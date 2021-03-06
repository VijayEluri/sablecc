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

package org.sablecc.objectmacro.walker;

import java.util.*;

import org.sablecc.exception.*;
import org.sablecc.objectmacro.exception.*;
import org.sablecc.objectmacro.structure.*;
import org.sablecc.objectmacro.syntax3.analysis.*;
import org.sablecc.objectmacro.syntax3.node.*;

public class DeclarationCollector
        extends DepthFirstAdapter {

    private final GlobalIndex globalIndex;

    public DeclarationCollector(
            GlobalIndex globalIndex) {

        if (globalIndex == null) {
            throw new InternalException("globalIndex may not be null");
        }

        this.globalIndex = globalIndex;
    }

    @Override
    public void caseAMacro(
            AMacro node) {

        if (node.getBody().getPos() != 1) {
            throw CompilerException.bodyTokenMisused(node.getBody());
        }

        MacroInfo newMacroInfo = this.globalIndex.createMacro(node);
        this.globalIndex.addAllVersionnedMacro(newMacroInfo);
        List<PParam> params = newMacroInfo.getDeclaration().getParams();
        List<PInternal> internals
                = newMacroInfo.getDeclaration().getInternals();

        for (PParam param_production : params) {
            AParam param_node = (AParam) param_production;
            newMacroInfo.newParam(param_node);
        }

        for (PInternal param_production : internals) {
            AInternal param_node = (AInternal) param_production;
            newMacroInfo.newInternal(param_node);
        }

        for (PMacroBodyPart pMacroBodyPart : node.getMacroBodyParts()) {
            pMacroBodyPart.apply(this);
        }
    }

    @Override
    public void caseAIndentMacroBodyPart(
            AIndentMacroBodyPart node) {

        if (node.getCommand().getPos() != 1) {
            throw CompilerException.indentTokenMisused(node.getCommand());
        }
    }
}
