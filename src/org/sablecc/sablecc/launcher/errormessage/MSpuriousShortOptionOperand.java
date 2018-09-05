/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.launcher.errormessage;

public class MSpuriousShortOptionOperand {

    private final String pOptionName;

    private final String pOperandText;

    private final MSpuriousShortOptionOperand mSpuriousShortOptionOperand
            = this;

    public MSpuriousShortOptionOperand(
            String pOptionName,
            String pOperandText) {

        if (pOptionName == null) {
            throw new NullPointerException();
        }
        this.pOptionName = pOptionName;
        if (pOperandText == null) {
            throw new NullPointerException();
        }
        this.pOperandText = pOperandText;
    }

    String pOptionName() {

        return this.pOptionName;
    }

    String pOperandText() {

        return this.pOperandText;
    }

    private String rOptionName() {

        return this.mSpuriousShortOptionOperand.pOptionName();
    }

    private String rOperandText() {

        return this.mSpuriousShortOptionOperand.pOperandText();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MCommandLineErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("The following option is rejected:");
        sb.append(System.getProperty("line.separator"));
        sb.append(" -");
        sb.append(rOptionName());
        sb.append("=");
        sb.append(rOperandText());
        sb.append(System.getProperty("line.separator"));
        sb.append("This option does not accept an operand.");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append(new MCommandLineErrorTail().toString());
        return sb.toString();
    }

}
