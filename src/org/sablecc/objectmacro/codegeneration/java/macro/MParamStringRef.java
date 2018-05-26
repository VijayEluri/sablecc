/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MParamStringRef
        extends Macro {

    String field_Name;

    final List<Macro> list_ContextParam;

    final Context ContextParamContext = new Context();

    final InternalValue ContextParamValue;

    private DSeparator ContextParamSeparator;

    private DBeforeFirst ContextParamBeforeFirst;

    private DAfterLast ContextParamAfterLast;

    private DNone ContextParamNone;

    final List<Macro> list_GetInternalTail;

    final Context GetInternalTailContext = new Context();

    final InternalValue GetInternalTailValue;

    private DSeparator GetInternalTailSeparator;

    private DBeforeFirst GetInternalTailBeforeFirst;

    private DAfterLast GetInternalTailAfterLast;

    private DNone GetInternalTailNone;

    public MParamStringRef(
            String pName,
            Macros macros) {

        setMacros(macros);
        setPName(pName);
        this.list_ContextParam = new LinkedList<>();
        this.list_GetInternalTail = new LinkedList<>();

        this.ContextParamValue = new InternalValue(this.list_ContextParam,
                this.ContextParamContext);
        this.GetInternalTailValue = new InternalValue(this.list_GetInternalTail,
                this.GetInternalTailContext);
    }

    private void setPName(
            String pName) {

        if (pName == null) {
            throw ObjectMacroException.parameterNull("Name");
        }

        this.field_Name = pName;
    }

    public void addAllContextParam(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("ContextParam");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("ParamStringRef");
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "ContextParam");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeContextParam(macro);
            this.list_ContextParam.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeContextParam(
            Macro macro) {

        macro.apply(new InternalsInitializer("ContextParam") {

            @Override
            void setContextParam(
                    MContextParam mContextParam) {

            }
        });
    }

    public void addContextParam(
            MContextParam macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("ContextParam");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("ParamStringRef");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_ContextParam.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllGetInternalTail(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("GetInternalTail");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("ParamStringRef");
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "GetInternalTail");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeGetInternalTail(macro);
            this.list_GetInternalTail.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeGetInternalTail(
            Macro macro) {

        macro.apply(new InternalsInitializer("GetInternalTail") {

            @Override
            void setGetInternalTail(
                    MGetInternalTail mGetInternalTail) {

            }
        });
    }

    public void addGetInternalTail(
            MGetInternalTail macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("GetInternalTail");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("ParamStringRef");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_GetInternalTail.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    String buildName() {

        return this.field_Name;
    }

    private String buildContextParam() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.ContextParamContext;
        List<Macro> macros = this.list_ContextParam;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.ContextParamNone != null) {
            sb.append(this.ContextParamNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.ContextParamBeforeFirst != null) {
                expansion = this.ContextParamBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.ContextParamAfterLast != null) {
                expansion = this.ContextParamAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.ContextParamSeparator != null) {
                expansion = this.ContextParamSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildGetInternalTail() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.GetInternalTailContext;
        List<Macro> macros = this.list_GetInternalTail;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.GetInternalTailNone != null) {
            sb.append(this.GetInternalTailNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.GetInternalTailBeforeFirst != null) {
                expansion = this.GetInternalTailBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.GetInternalTailAfterLast != null) {
                expansion = this.GetInternalTailAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.GetInternalTailSeparator != null) {
                expansion = this.GetInternalTailSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    String getName() {

        return this.field_Name;
    }

    private InternalValue getContextParam() {

        return this.ContextParamValue;
    }

    private InternalValue getGetInternalTail() {

        return this.GetInternalTailValue;
    }

    private void initContextParamInternals(
            Context context) {

        for (Macro macro : this.list_ContextParam) {
            macro.apply(new InternalsInitializer("ContextParam") {

                @Override
                void setContextParam(
                        MContextParam mContextParam) {

                }
            });
        }
    }

    private void initGetInternalTailInternals(
            Context context) {

        for (Macro macro : this.list_GetInternalTail) {
            macro.apply(new InternalsInitializer("GetInternalTail") {

                @Override
                void setGetInternalTail(
                        MGetInternalTail mGetInternalTail) {

                }
            });
        }
    }

    private void initContextParamDirectives() {

    }

    private void initGetInternalTailDirectives() {

    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setParamStringRef(this);
    }

    @Override
    public String build() {

        BuildState buildState = this.build_state;

        if (buildState == null) {
            buildState = new BuildState();
        }
        else if (buildState.getExpansion() == null) {
            throw ObjectMacroException.cyclicReference("ParamStringRef");
        }
        else {
            return buildState.getExpansion();
        }
        this.build_state = buildState;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        initContextParamDirectives();
        initGetInternalTailDirectives();

        initContextParamInternals(null);
        initGetInternalTailInternals(null);

        StringBuilder sb0 = new StringBuilder();

        sb0.append("String get");
        sb0.append(buildName());
        sb0.append("(");
        sb0.append(buildContextParam());
        sb0.append(")");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    return this.field_");
        sb0.append(buildName());
        sb0.append(buildGetInternalTail());
        sb0.append(";");
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
