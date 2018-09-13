/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MExObjectMacroException
        extends Macro {

    private DSeparator PackageDeclarationSeparator;

    private DBeforeFirst PackageDeclarationBeforeFirst;

    private DAfterLast PackageDeclarationAfterLast;

    private DNone PackageDeclarationNone;

    final List<Macro> list_PackageDeclaration;

    final Context PackageDeclarationContext = new Context();

    final MacroValue PackageDeclarationValue;

    MExObjectMacroException(
            Macros macros) {

        setMacros(macros);
        this.list_PackageDeclaration = new LinkedList<>();

        this.PackageDeclarationValue = new MacroValue(
                this.list_PackageDeclaration, this.PackageDeclarationContext);
    }

    MExObjectMacroException(
            List<Macro> pPackageDeclaration,
            Macros macros) {

        setMacros(macros);
        this.list_PackageDeclaration = new LinkedList<>();

        this.PackageDeclarationValue = new MacroValue(
                this.list_PackageDeclaration, this.PackageDeclarationContext);
        if (pPackageDeclaration != null) {
            addAllPackageDeclaration(pPackageDeclaration);
        }
    }

    public void addAllPackageDeclaration(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("PackageDeclaration");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
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
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
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

        if (this.PackageDeclarationBeforeFirst == null) {
            initPackageDeclarationDirectives();
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            expansion = this.PackageDeclarationBeforeFirst.apply(i, expansion,
                    nb_macros);
            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    MacroValue getPackageDeclaration() {

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

        internalsInitializer.setExObjectMacroException(this);
    }

    public String build() {

        CacheBuilder cache_builder = this.cacheBuilder;

        if (cache_builder == null) {
            cache_builder = new CacheBuilder();
        }
        else if (cache_builder.getExpansion() == null) {
            throw new InternalException("Cycle detection detected lately");
        }
        else {
            return cache_builder.getExpansion();
        }
        this.cacheBuilder = cache_builder;
        List<String> indentations = new LinkedList<>();

        initPackageDeclarationInternals(null);

        initPackageDeclarationDirectives();

        StringBuilder sb0 = new StringBuilder();

        MHeader m1 = getMacros().newHeader();

        sb0.append(m1.build(null));
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(buildPackageDeclaration());
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("public class ObjectMacroException");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        extends RuntimeException");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private ObjectMacroException(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String message)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        super(message);");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        if(message == null)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "            throw new RuntimeException(\"message may not be null\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private ObjectMacroException(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String message,");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            Throwable cause) ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        super(message, cause);");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        if (message == null) ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "            throw new RuntimeException(\"message may not be null\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        if (cause == null) ");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "            throw new RuntimeException(\"cause may not be null\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    static ObjectMacroException incorrectType(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String type,");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String param_name)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        return new ObjectMacroException(");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "                new MUserErrorIncorrectType(type, param_name).build());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    static ObjectMacroException macroNull(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            Integer index,");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String paramName)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        return new ObjectMacroException(");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "                new MUserErrorMacroNullInList(String.valueOf(index), paramName).build());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    static ObjectMacroException parameterNull(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String paramName)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        return new ObjectMacroException(new MUserErrorParameterNull(paramName).build());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    static ObjectMacroException cyclicReference(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String macroName)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        return new ObjectMacroException(new MUserErrorCyclicReference(macroName).build());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    static ObjectMacroException cannotModify(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            String macroName)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        return new ObjectMacroException(new MUserErrorCannotModify(macroName).build());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    static ObjectMacroException versionNull()");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        return new ObjectMacroException(new MUserErrorVersionNull().build());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    static ObjectMacroException diffMacros()");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(
                "        return new ObjectMacroException(new MUserErrorVersionsDifferent().build());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append("}");
        cache_builder.setExpansion(sb0.toString());
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