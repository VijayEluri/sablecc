/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MMacroInternalException
        extends Macro {

    final List<Macro> list_PackageDeclaration;

    final Context PackageDeclarationContext = new Context();

    final InternalValue PackageDeclarationValue;

    private DSeparator PackageDeclarationSeparator;

    private DBeforeFirst PackageDeclarationBeforeFirst;

    private DAfterLast PackageDeclarationAfterLast;

    private DNone PackageDeclarationNone;

    public MMacroInternalException(
            Macros macros) {

        setMacros(macros);
        this.list_PackageDeclaration = new LinkedList<>();

        this.PackageDeclarationValue = new InternalValue(
                this.list_PackageDeclaration, this.PackageDeclarationContext);
    }

    public void addAllPackageDeclaration(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("PackageDeclaration");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("MacroInternalException");
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "PackageDeclaration");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypePackageDeclaration(macro);
            this.list_PackageDeclaration.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypePackageDeclaration(
            Macro macro) {

        macro.apply(new InternalsInitializer("PackageDeclaration") {

            @Override
            void setPackageDeclaration(
                    MPackageDeclaration mPackageDeclaration) {

            }
        });
    }

    public void addPackageDeclaration(
            MPackageDeclaration macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("PackageDeclaration");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("MacroInternalException");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_PackageDeclaration.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildPackageDeclaration() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.PackageDeclarationContext;
        List<Macro> macros = this.list_PackageDeclaration;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.PackageDeclarationNone != null) {
            sb.append(this.PackageDeclarationNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.PackageDeclarationBeforeFirst != null) {
                expansion = this.PackageDeclarationBeforeFirst.apply(i,
                        expansion, nb_macros);
            }

            if (this.PackageDeclarationAfterLast != null) {
                expansion = this.PackageDeclarationAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.PackageDeclarationSeparator != null) {
                expansion = this.PackageDeclarationSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private InternalValue getPackageDeclaration() {

        return this.PackageDeclarationValue;
    }

    private void initPackageDeclarationInternals(
            Context context) {

        for (Macro macro : this.list_PackageDeclaration) {
            macro.apply(new InternalsInitializer("PackageDeclaration") {

                @Override
                void setPackageDeclaration(
                        MPackageDeclaration mPackageDeclaration) {

                }
            });
        }
    }

    private void initPackageDeclarationDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.PackageDeclarationBeforeFirst = new DBeforeFirst(sb1.toString());
        this.PackageDeclarationValue
                .setBeforeFirst(this.PackageDeclarationBeforeFirst);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setMacroInternalException(this);
    }

    @Override
    public String build() {

        BuildState buildState = this.build_state;

        if (buildState == null) {
            buildState = new BuildState();
        }
        else if (buildState.getExpansion() == null) {
            throw ObjectMacroException
                    .cyclicReference("MacroInternalException");
        }
        else {
            return buildState.getExpansion();
        }
        this.build_state = buildState;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        initPackageDeclarationDirectives();

        initPackageDeclarationInternals(null);

        StringBuilder sb0 = new StringBuilder();

        MHeader m1 = getMacros().newHeader();

        sb0.append(m1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(buildPackageDeclaration());
        sb0.append(LINE_SEPARATOR);
        MImportJavaUtil m2 = getMacros().newImportJavaUtil();

        sb0.append(m2.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("class MUserErrorInternalException extends Macro");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private String field_StackTrace;");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private String field_Message;");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    public MUserErrorInternalException(String pMessage)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        this.setPMessage(pMessage);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private void setPMessage( String pMessage )");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        if(pMessage == null)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "            throw ObjectMacroException.parameterNull(\"Message\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        this.field_Message = pMessage;");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private String buildMessage()");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        return this.field_Message;");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private String getMessage()");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        return this.field_Message;");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    @Override");
        sb0.append(LINE_SEPARATOR);
        sb0.append("     void apply(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("             InternalsInitializer internalsInitializer)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "         internalsInitializer.setUserErrorInternalException(this);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("     }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    @Override");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    public String build()");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        BuildState buildState = this.build_state;");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        if(buildState == null)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            buildState = new BuildState();");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        else if(buildState.getExpansion() == null)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "            throw ObjectMacroException.cyclicReference(\"UserErrorInternalException\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        else");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            return buildState.getExpansion();");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        this.build_state = buildState;");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        List<String> indentations = new LinkedList<>();");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        StringBuilder sbIndentation = new StringBuilder();");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        StringBuilder sb0 = new StringBuilder();");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(\"*** INTERNAL ERROR ***\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(LINE_SEPARATOR);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(LINE_SEPARATOR);");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        sb0.append(\"An internal error was raised with the following message:\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(LINE_SEPARATOR);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(\" \");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(buildMessage());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(\".\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(LINE_SEPARATOR);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(LINE_SEPARATOR);");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        sb0.append(\"Please submit a defect ticket with the full error trace above on:\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(LINE_SEPARATOR);");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        sb0.append(\" http://sablecc.org/\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        buildState.setExpansion(sb0.toString());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        return sb0.toString();");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    @Override");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    String build(Context context) ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("     return build();");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");

        buildState.setExpansion(sb0.toString());
        return sb0.toString();
    }

    @Override
    String build(
            Context context) {

        return build();
    }

    private void setMacros(
            Macros macros) {

        if (macros == null) {
            throw new InternalException("macros cannot be null");
        }

        this.macros = macros;
    }
}
