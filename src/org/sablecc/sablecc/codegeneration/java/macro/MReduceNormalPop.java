/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MReduceNormalPop {

    private final String pElementName;

    private final MReduceNormalPop mReduceNormalPop = this;

    MReduceNormalPop(
            String pElementName) {

        if (pElementName == null) {
            throw new NullPointerException();
        }
        this.pElementName = pElementName;
    }

    String pElementName() {

        return this.pElementName;
    }

    private String rElementName() {

        return this.mReduceNormalPop.pElementName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("      AbstractForest l");
        sb.append(rElementName());
        sb.append(" = stack.pop();");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}