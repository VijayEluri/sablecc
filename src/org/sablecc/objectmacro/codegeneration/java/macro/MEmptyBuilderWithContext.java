/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

public class MEmptyBuilderWithContext {

    public MEmptyBuilderWithContext() {

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("    @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("    String build(Context context) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("        return build();");
        sb.append(System.getProperty("line.separator"));
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}