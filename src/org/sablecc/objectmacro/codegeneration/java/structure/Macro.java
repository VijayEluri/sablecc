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

package org.sablecc.objectmacro.codegeneration.java.structure;

import java.util.*;

import org.sablecc.objectmacro.codegeneration.java.macro.*;

public class Macro {

    private final MMacro macro;

    private final String name;

    private final List<String> parametersName;

    private final List<String> internalsName;

    public Macro(
            MMacro macro,
            List<String> parametersName,
            List<String> internalsName,
            String name) {

        this.macro = macro;
        this.parametersName = parametersName;
        this.internalsName = internalsName;
        this.name = name;
    }

    public List<String> getInternalsName() {

        return this.internalsName;
    }

    public List<String> getParametersName() {

        return this.parametersName;
    }

    public MMacro getMacro() {

        return this.macro;
    }

    public String getName() {

        return this.name;
    }
}