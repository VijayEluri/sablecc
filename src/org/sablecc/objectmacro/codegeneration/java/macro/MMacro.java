/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MMacro {

    private final String pName;

    private final MMacro mMacro = this;

    private final List<Object> ePackageDeclaration = new LinkedList<>();

    private final List<Object> eImportJavaUtil = new LinkedList<>();

    private final List<Object> eParamField_SelfRefMacro_AncestorField_ExpandField
            = new LinkedList<>();

    private final List<Object> ePublic = new LinkedList<>();

    private final List<Object> eParamParam_AncestorParam = new LinkedList<>();

    private final List<Object> eParamConstructorInit_AncestorConstructorInit
            = new LinkedList<>();

    private final List<Object> eMacroCreator = new LinkedList<>();

    private final List<Object> eParam = new LinkedList<>();

    private final List<Object> eParamRef = new LinkedList<>();

    private final List<Object> eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
            = new LinkedList<>();

    public MMacro(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    public MPackageDeclaration newPackageDeclaration(
            String pPackageName) {

        MPackageDeclaration lPackageDeclaration
                = new MPackageDeclaration(pPackageName);
        this.ePackageDeclaration.add(lPackageDeclaration);
        return lPackageDeclaration;
    }

    public MImportJavaUtil newImportJavaUtil() {

        MImportJavaUtil lImportJavaUtil = new MImportJavaUtil();
        this.eImportJavaUtil.add(lImportJavaUtil);
        return lImportJavaUtil;
    }

    public MParamField newParamField(
            String pName) {

        MParamField lParamField = new MParamField(pName);
        this.eParamField_SelfRefMacro_AncestorField_ExpandField
                .add(lParamField);
        return lParamField;
    }

    public MSelfRefMacro newSelfRefMacro() {

        MSelfRefMacro lSelfRefMacro = new MSelfRefMacro(this.mMacro);
        this.eParamField_SelfRefMacro_AncestorField_ExpandField
                .add(lSelfRefMacro);
        return lSelfRefMacro;
    }

    public MAncestorField newAncestorField(
            String pName) {

        MAncestorField lAncestorField = new MAncestorField(pName);
        this.eParamField_SelfRefMacro_AncestorField_ExpandField
                .add(lAncestorField);
        return lAncestorField;
    }

    public MExpandField newExpandField(
            String pName) {

        MExpandField lExpandField = new MExpandField(pName);
        this.eParamField_SelfRefMacro_AncestorField_ExpandField
                .add(lExpandField);
        return lExpandField;
    }

    public MPublic newPublic() {

        MPublic lPublic = new MPublic();
        this.ePublic.add(lPublic);
        return lPublic;
    }

    public MParamParam newParamParam(
            String pName) {

        MParamParam lParamParam = new MParamParam(pName);
        this.eParamParam_AncestorParam.add(lParamParam);
        return lParamParam;
    }

    public MAncestorParam newAncestorParam(
            String pName) {

        MAncestorParam lAncestorParam = new MAncestorParam(pName);
        this.eParamParam_AncestorParam.add(lAncestorParam);
        return lAncestorParam;
    }

    public MParamConstructorInit newParamConstructorInit(
            String pName) {

        MParamConstructorInit lParamConstructorInit
                = new MParamConstructorInit(pName);
        this.eParamConstructorInit_AncestorConstructorInit
                .add(lParamConstructorInit);
        return lParamConstructorInit;
    }

    public MAncestorConstructorInit newAncestorConstructorInit(
            String pName) {

        MAncestorConstructorInit lAncestorConstructorInit
                = new MAncestorConstructorInit(pName);
        this.eParamConstructorInit_AncestorConstructorInit
                .add(lAncestorConstructorInit);
        return lAncestorConstructorInit;
    }

    public MMacroCreator newMacroCreator(
            String pName) {

        MMacroCreator lMacroCreator = new MMacroCreator(pName);
        this.eMacroCreator.add(lMacroCreator);
        return lMacroCreator;
    }

    public MParam newParam(
            String pName) {

        MParam lParam = new MParam(pName);
        this.eParam.add(lParam);
        return lParam;
    }

    public MParamRef newParamRef(
            String pName,
            String pContext) {

        MParamRef lParamRef = new MParamRef(pName, pContext);
        this.eParamRef.add(lParamRef);
        return lParamRef;
    }

    public MStringPart newStringPart(
            String pString) {

        MStringPart lStringPart = new MStringPart(pString);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lStringPart);
        return lStringPart;
    }

    public MEolPart newEolPart() {

        MEolPart lEolPart = new MEolPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lEolPart);
        return lEolPart;
    }

    public MParamInsertPart newParamInsertPart(
            String pName) {

        MParamInsertPart lParamInsertPart = new MParamInsertPart(pName);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lParamInsertPart);
        return lParamInsertPart;
    }

    public MTextInsertPart newTextInsertPart() {

        MTextInsertPart lTextInsertPart = new MTextInsertPart();
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lTextInsertPart);
        return lTextInsertPart;
    }

    public MExpandInsertPart newExpandInsertPart(
            String pName) {

        MExpandInsertPart lExpandInsertPart = new MExpandInsertPart(pName);
        this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                .add(lExpandInsertPart);
        return lExpandInsertPart;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mMacro.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.ePackageDeclaration.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oPackageDeclaration : this.ePackageDeclaration) {
            sb.append(oPackageDeclaration.toString());
        }
        if (this.eImportJavaUtil.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oImportJavaUtil : this.eImportJavaUtil) {
            sb.append(oImportJavaUtil.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("public class M");
        sb.append(rName());
        sb.append(" {");
        sb.append(System.getProperty("line.separator"));
        if (this.eParamField_SelfRefMacro_AncestorField_ExpandField
                .size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oParamField_SelfRefMacro_AncestorField_ExpandField : this.eParamField_SelfRefMacro_AncestorField_ExpandField) {
            sb.append(oParamField_SelfRefMacro_AncestorField_ExpandField
                    .toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        for (Object oPublic : this.ePublic) {
            sb.append(oPublic.toString());
        }
        sb.append("M");
        sb.append(rName());
        sb.append("(");
        {
            boolean first = true;
            for (Object oParamParam_AncestorParam : this.eParamParam_AncestorParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamParam_AncestorParam.toString());
            }
        }
        sb.append(") {");
        sb.append(System.getProperty("line.separator"));
        for (Object oParamConstructorInit_AncestorConstructorInit : this.eParamConstructorInit_AncestorConstructorInit) {
            sb.append(oParamConstructorInit_AncestorConstructorInit.toString());
        }
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        if (this.eMacroCreator.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oMacroCreator : this.eMacroCreator) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oMacroCreator.toString());
            }
        }
        if (this.eParam.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParam : this.eParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParam.toString());
            }
        }
        if (this.eParamRef.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        {
            boolean first = true;
            for (Object oParamRef : this.eParamRef) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParamRef.toString());
            }
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public String toString() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    StringBuilder sb = new StringBuilder();");
        sb.append(System.getProperty("line.separator"));
        for (Object oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart : this.eStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart) {
            sb.append(
                    oStringPart_EolPart_ParamInsertPart_TextInsertPart_ExpandInsertPart
                            .toString());
        }
        sb.append("    return sb.toString();");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
