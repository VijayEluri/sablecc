/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

import java.util.*;

public class MTextInsertArg {

    private final String pIndent;

    private final MTextInsertArg mTextInsertArg = this;

    private final List<Object> eTextInsert = new LinkedList<>();

    public MTextInsertArg(
            String pIndent) {

        if (pIndent == null) {
            throw new NullPointerException();
        }
        this.pIndent = pIndent;
    }

    public MTextInsert newTextInsert(
            String pName,
            String pIndent) {

        MTextInsert lTextInsert = new MTextInsert(pName, pIndent);
        this.eTextInsert.add(lTextInsert);
        return lTextInsert;
    }

    String pIndent() {

        return this.pIndent;
    }

    private String rIndent() {

        return this.mTextInsertArg.pIndent();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(rIndent());
        sb.append("    arg {");
        sb.append(System.getProperty("line.separator"));
        for (Object oTextInsert : this.eTextInsert) {
            sb.append(oTextInsert.toString());
        }
        sb.append(rIndent());
        sb.append("    }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
