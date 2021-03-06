/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MAddAllMacro
        extends Macro {

    private DSeparator ParamNameSeparator;

    private DBeforeFirst ParamNameBeforeFirst;

    private DAfterLast ParamNameAfterLast;

    private DNone ParamNameNone;

    final List<String> list_ParamName;

    final Context ParamNameContext = new Context();

    final StringValue ParamNameValue;

    MAddAllMacro(
            Macros macros) {

        setMacros(macros);
        this.list_ParamName = new LinkedList<>();

        this.ParamNameValue
                = new StringValue(this.list_ParamName, this.ParamNameContext);
    }

    MAddAllMacro(
            String pParamName,
            Macros macros) {

        setMacros(macros);
        this.list_ParamName = new LinkedList<>();

        this.ParamNameValue
                = new StringValue(this.list_ParamName, this.ParamNameContext);

        if (pParamName != null) {
            addParamName(pParamName);
        }
    }

    public void addAllParamName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("ParamName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("ParamName");
            }

            this.list_ParamName.add(string);
        }
    }

    public void addParamName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("ParamName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_ParamName.add(string);
    }

    private String buildParamName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_ParamName;

        int i = 0;
        int nb_strings = strings.size();

        for (String string : strings) {

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    StringValue getParamName() {

        return this.ParamNameValue;
    }

    private void initParamNameDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setAddAllMacro(this);
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

        initParamNameDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("public void addAll");
        sb0.append(buildParamName());
        sb0.append("(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("                List<Macro> macros)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    if(macros == null)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        throw ObjectMacroException.parameterNull(\"");
        sb0.append(buildParamName());
        sb0.append("\");");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        MIsBuilt m1 = getMacros().newIsBuilt();

        sb1.append(m1.build(null));
        sb1.append(LINE_SEPARATOR);
        sb1.append(LINE_SEPARATOR);
        sb1.append("int i = 0;");
        sb1.append(LINE_SEPARATOR);
        sb1.append(LINE_SEPARATOR);
        sb1.append("for(Macro macro : macros) ");
        sb1.append("{");
        sb1.append(LINE_SEPARATOR);
        sb1.append("    if(macro == null) ");
        sb1.append("{");
        sb1.append(LINE_SEPARATOR);
        sb1.append("        throw ObjectMacroException.macroNull(i, \"");
        sb1.append(buildParamName());
        sb1.append("\");");
        sb1.append(LINE_SEPARATOR);
        sb1.append("    }");
        sb1.append(LINE_SEPARATOR);
        sb1.append(LINE_SEPARATOR);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("    ");
        indentations.add(sb4.toString());
        MFactoryComparison m2 = getMacros().newFactoryComparison();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("macro");
        StringValue value5 = new StringValue(
                new ArrayList<>(Collections.singletonList(sb5.toString())),
                null);
        m2.setVarName(null, value5);
        sb3.append(m2.build(null));
        sb1.append(applyIndent(sb3.toString(),
                indentations.remove(indentations.size() - 1)));
        sb1.append(LINE_SEPARATOR);
        sb1.append(LINE_SEPARATOR);
        sb1.append("    this.verifyType");
        sb1.append(buildParamName());
        sb1.append("(macro);");
        sb1.append(LINE_SEPARATOR);
        sb1.append("    this.list_");
        sb1.append(buildParamName());
        sb1.append(".add(macro);");
        sb1.append(LINE_SEPARATOR);
        sb1.append("    this.children.add(macro);");
        sb1.append(LINE_SEPARATOR);
        sb1.append("    Macro.cycleDetector.detectCycle(this, macro);");
        sb1.append(LINE_SEPARATOR);
        sb1.append(LINE_SEPARATOR);
        sb1.append("    i++;");
        sb1.append(LINE_SEPARATOR);
        sb1.append("}");
        sb1.append(LINE_SEPARATOR);
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
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
