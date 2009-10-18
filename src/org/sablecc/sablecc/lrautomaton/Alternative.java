/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.lrautomaton;

import java.util.*;

import org.sablecc.exception.*;

public class Alternative {

    private final Production production;

    private final String shortName;

    private String name;

    private final ArrayList<Element> elements = new ArrayList<Element>();

    private boolean isStable;

    private Integer shortestLength;

    private ArrayList<Item> items;

    Alternative(
            Production production,
            String shortName) {

        this.production = production;
        this.shortName = shortName;
    }

    public Element addProductionElement(
            String shortName,
            Production production) {

        if (this.isStable) {
            throw new InternalException("alternative is stable");
        }
        int position = this.elements.size();
        Element element = new ProductionElement(this, position, shortName,
                production);
        this.elements.add(element);
        return element;
    }

    public Element addTokenElement(
            String shortName,
            Token token) {

        if (this.isStable) {
            throw new InternalException("alternative is stable");
        }
        int position = this.elements.size();
        Element element = new TokenElement(this, position, shortName, token);
        this.elements.add(element);
        return element;
    }

    public String getShortName() {

        return this.shortName;
    }

    void setName(
            String name) {

        if (this.isStable) {
            throw new InternalException("alternative is stable");
        }
        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    void stabilize() {

        if (this.isStable) {
            throw new InternalException("alternative is already stable");
        }

        Map<String, List<Element>> nameToElementListMap = new LinkedHashMap<String, List<Element>>();
        for (Element element : this.elements) {
            String shortName = element.getShortName();
            List<Element> elementList = nameToElementListMap.get(shortName);
            if (elementList == null) {
                elementList = new LinkedList<Element>();
                nameToElementListMap.put(shortName, elementList);
            }
            elementList.add(element);
        }
        for (List<Element> elementList : nameToElementListMap.values()) {
            if (elementList.size() == 1) {
                Element element = elementList.get(0);
                element.setName(element.getShortName());
            }
            else {
                int index = 1;
                for (Element element : elementList) {
                    element.setName(element.getShortName() + "$" + index++);
                }
            }
        }
        for (Element element : this.elements) {
            element.stabilize();
        }

        int position = 0;
        for (Element element : this.elements) {
            if (element instanceof TokenElement) {
                this.items.add(new Item(this, position, ItemType.BEFORE_TOKEN));
            }
            else {
                this.items.add(new Item(this, position,
                        ItemType.BEFORE_PRODUCTION));
            }
            position++;
        }
        this.items.add(new Item(this, position, ItemType.END));
    }

    public String getFullName() {

        return this.production.getName() + "." + getName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(getName());
        sb.append(":}");
        for (Element element : this.elements) {
            sb.append(" ");
            sb.append(element);
        }
        return sb.toString();
    }

    public Integer getShortestLength() {

        return this.shortestLength;
    }

    public boolean computeShortestLength() {

        Integer length = 0;

        for (Element element : this.elements) {
            if (element instanceof TokenElement) {
                length++;
            }
            else {
                ProductionElement productionElement = (ProductionElement) element;
                Integer elementLength = productionElement.getProduction()
                        .getShortestLength();
                if (elementLength == null) {
                    return false;
                }
                else {
                    length += elementLength;
                }
            }
        }

        if (length != null) {
            if (this.shortestLength == null
                    || length.compareTo(this.shortestLength) < 0) {
                this.shortestLength = length;
                return true;
            }
        }

        return false;
    }

    public Item getItem(
            int position) {

        return this.items.get(position);
    }
}