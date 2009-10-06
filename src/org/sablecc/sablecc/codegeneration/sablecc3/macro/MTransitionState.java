/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.sablecc3.macro;

import java.util.LinkedList;
import java.util.List;

public class MTransitionState {

    private final List<Object> ePackage = new LinkedList<Object>();

    public MTransitionState() {

    }

    public MPackage newPackage(
            String pPackage) {

        MPackage lPackage = new MPackage(pPackage);
        this.ePackage.add(lPackage);
        return lPackage;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("package ");
        for (Object oPackage : this.ePackage) {
            sb.append(oPackage.toString());
        }
        sb.append("lexer;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("abstract class TransitionState");
        sb.append(System.getProperty("line.separator"));
        sb.append("    extends State {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  abstract void setMarker(Lexer lexer);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  abstract State getTarget(Symbol symbol);");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  StateType getStateType() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    return State.StateType.TRANSITION;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
