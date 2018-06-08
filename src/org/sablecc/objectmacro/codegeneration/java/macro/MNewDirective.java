/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MNewDirective
        extends Macro {

    private DSeparator DirectiveNameSeparator;

    private DBeforeFirst DirectiveNameBeforeFirst;

    private DAfterLast DirectiveNameAfterLast;

    private DNone DirectiveNameNone;

    final List<String> list_DirectiveName;

    final Context DirectiveNameContext = new Context();

    final StringValue DirectiveNameValue;

    private DSeparator IndexBuilderSeparator;

    private DBeforeFirst IndexBuilderBeforeFirst;

    private DAfterLast IndexBuilderAfterLast;

    private DNone IndexBuilderNone;

    final List<String> list_IndexBuilder;

    final Context IndexBuilderContext = new Context();

    final StringValue IndexBuilderValue;

    private DSeparator TextPartsSeparator;

    private DBeforeFirst TextPartsBeforeFirst;

    private DAfterLast TextPartsAfterLast;

    private DNone TextPartsNone;

    final List<Macro> list_TextParts;

    final Context TextPartsContext = new Context();

    final MacroValue TextPartsValue;

    private Map<Context, StringValue> list_ParamName = new LinkedHashMap<>();

    MNewDirective(
            Macros macros) {

        setMacros(macros);
        this.list_DirectiveName = new LinkedList<>();
        this.list_IndexBuilder = new LinkedList<>();
        this.list_TextParts = new LinkedList<>();
        this.list_ParamName = new LinkedHashMap<>();

        this.DirectiveNameValue = new StringValue(this.list_DirectiveName,
                this.DirectiveNameContext);
        this.IndexBuilderValue = new StringValue(this.list_IndexBuilder,
                this.IndexBuilderContext);
        this.TextPartsValue
                = new MacroValue(this.list_TextParts, this.TextPartsContext);
    }

    MNewDirective(
            String pDirectiveName,
            String pIndexBuilder,
            List<Macro> pTextParts,
            Macros macros) {

        setMacros(macros);
        this.list_DirectiveName = new LinkedList<>();
        this.list_IndexBuilder = new LinkedList<>();
        this.list_TextParts = new LinkedList<>();
        this.list_ParamName = new LinkedHashMap<>();

        this.DirectiveNameValue = new StringValue(this.list_DirectiveName,
                this.DirectiveNameContext);
        this.IndexBuilderValue = new StringValue(this.list_IndexBuilder,
                this.IndexBuilderContext);
        this.TextPartsValue
                = new MacroValue(this.list_TextParts, this.TextPartsContext);
        if (pTextParts != null) {
            addAllTextParts(pTextParts);
        }

        if (pDirectiveName != null) {
            addDirectiveName(pDirectiveName);
        }
        if (pIndexBuilder != null) {
            addIndexBuilder(pIndexBuilder);
        }
    }

    public void addAllDirectiveName(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("DirectiveName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("DirectiveName");
            }

            this.list_DirectiveName.add(string);
        }
    }

    public void addDirectiveName(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("DirectiveName");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_DirectiveName.add(string);
    }

    public void addAllIndexBuilder(
            List<String> strings) {

        if (this.macros == null) {
            throw ObjectMacroException.parameterNull("IndexBuilder");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }
        for (String string : strings) {
            if (string == null) {
                throw ObjectMacroException.parameterNull("IndexBuilder");
            }

            this.list_IndexBuilder.add(string);
        }
    }

    public void addIndexBuilder(
            String string) {

        if (string == null) {
            throw ObjectMacroException.parameterNull("IndexBuilder");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        this.list_IndexBuilder.add(string);
    }

    public void addAllTextParts(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "TextParts");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeTextParts(macro);
            this.list_TextParts.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeTextParts(
            Macro macro) {

        macro.apply(new InternalsInitializer("TextParts") {

            @Override
            void setStringPart(
                    MStringPart mStringPart) {

            }

            @Override
            void setParamInsertPart(
                    MParamInsertPart mParamInsertPart) {

            }

            @Override
            void setEolPart(
                    MEolPart mEolPart) {

            }

            @Override
            void setInsertMacroPart(
                    MInsertMacroPart mInsertMacroPart) {

            }
        });
    }

    public void addTextParts(
            MStringPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addTextParts(
            MParamInsertPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addTextParts(
            MEolPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addTextParts(
            MInsertMacroPart macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("TextParts");
        }
        if (this.cacheBuilder != null) {
            throw ObjectMacroException
                    .cannotModify(this.getClass().getSimpleName());
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_TextParts.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    void setParamName(
            Context context,
            StringValue value) {

        if (value == null) {
            throw new RuntimeException("value cannot be null here");
        }

        this.list_ParamName.put(context, value);
    }

    private String buildDirectiveName() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_DirectiveName;

        int i = 0;
        int nb_strings = strings.size();

        for (String string : strings) {

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildIndexBuilder() {

        StringBuilder sb = new StringBuilder();
        List<String> strings = this.list_IndexBuilder;

        int i = 0;
        int nb_strings = strings.size();

        for (String string : strings) {

            sb.append(string);
            i++;
        }

        return sb.toString();
    }

    private String buildTextParts() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.TextPartsContext;
        List<Macro> macros = this.list_TextParts;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.TextPartsSeparator == null) {
            initTextPartsDirectives();
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            expansion = this.TextPartsSeparator.apply(i, expansion, nb_macros);
            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private String buildParamName(
            Context context) {

        StringValue stringValue = this.list_ParamName.get(context);
        return stringValue.build();
    }

    StringValue getDirectiveName() {

        return this.DirectiveNameValue;
    }

    StringValue getIndexBuilder() {

        return this.IndexBuilderValue;
    }

    MacroValue getTextParts() {

        return this.TextPartsValue;
    }

    private StringValue getParamName(
            Context context) {

        return this.list_ParamName.get(context);
    }

    private void initTextPartsInternals(
            Context context) {

        for (Macro macro : this.list_TextParts) {
            macro.apply(new InternalsInitializer("TextParts") {

                @Override
                void setStringPart(
                        MStringPart mStringPart) {

                }

                @Override
                void setParamInsertPart(
                        MParamInsertPart mParamInsertPart) {

                }

                @Override
                void setEolPart(
                        MEolPart mEolPart) {

                }

                @Override
                void setInsertMacroPart(
                        MInsertMacroPart mInsertMacroPart) {

                }
            });
        }
    }

    private void initDirectiveNameDirectives() {

    }

    private void initIndexBuilderDirectives() {

    }

    private void initTextPartsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.TextPartsSeparator = new DSeparator(sb1.toString());
        this.TextPartsValue.setSeparator(this.TextPartsSeparator);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setNewDirective(this);
    }

    @Override
    String build(
            Context context) {

        CacheBuilder cache_builder = this.cacheBuilders.get(context);

        if (cache_builder == null) {
            cache_builder = new CacheBuilder();
        }
        else if (cache_builder.getExpansion() == null) {
            throw new InternalException("Cycle detection detected lately");
        }
        else {
            return cache_builder.getExpansion();
        }

        this.cacheBuilders.put(context, cache_builder);
        List<String> indentations = new LinkedList<>();

        initTextPartsInternals(context);

        initDirectiveNameDirectives();
        initIndexBuilderDirectives();
        initTextPartsDirectives();

        StringBuilder sb0 = new StringBuilder();

        sb0.append("StringBuilder sb");
        sb0.append(buildIndexBuilder());
        sb0.append(" = new StringBuilder();");
        sb0.append(LINE_SEPARATOR);
        sb0.append(buildTextParts());
        sb0.append(LINE_SEPARATOR);
        sb0.append("this.");
        sb0.append(buildParamName(context));
        sb0.append(buildDirectiveName());
        sb0.append(" = new D");
        sb0.append(buildDirectiveName());
        sb0.append("(sb");
        sb0.append(buildIndexBuilder());
        sb0.append(".toString());");
        sb0.append(LINE_SEPARATOR);
        sb0.append("this.");
        sb0.append(buildParamName(context));
        sb0.append("Value.set");
        sb0.append(buildDirectiveName());
        sb0.append("(this.");
        sb0.append(buildParamName(context));
        sb0.append(buildDirectiveName());
        sb0.append(");");
        cache_builder.setExpansion(sb0.toString());
        return sb0.toString();
    }

    private void setMacros(
            Macros macros) {

        if (macros == null) {
            throw new InternalException("macros cannot be null");
        }

        this.macros = macros;
    }
}
