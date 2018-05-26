/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.java.macro;

import java.util.*;

public class MMacroFactory
        extends Macro {

    final List<Macro> list_DefaultVersion;

    final Context DefaultVersionContext = new Context();

    final InternalValue DefaultVersionValue;

    private DSeparator DefaultVersionSeparator;

    private DBeforeFirst DefaultVersionBeforeFirst;

    private DAfterLast DefaultVersionAfterLast;

    private DNone DefaultVersionNone;

    final List<Macro> list_PackageDeclaration;

    final Context PackageDeclarationContext = new Context();

    final InternalValue PackageDeclarationValue;

    private DSeparator PackageDeclarationSeparator;

    private DBeforeFirst PackageDeclarationBeforeFirst;

    private DAfterLast PackageDeclarationAfterLast;

    private DNone PackageDeclarationNone;

    final List<Macro> list_NewMacroMethods;

    final Context NewMacroMethodsContext = new Context();

    final InternalValue NewMacroMethodsValue;

    private DSeparator NewMacroMethodsSeparator;

    private DBeforeFirst NewMacroMethodsBeforeFirst;

    private DAfterLast NewMacroMethodsAfterLast;

    private DNone NewMacroMethodsNone;

    public MMacroFactory(
            Macros macros) {

        setMacros(macros);
        this.list_DefaultVersion = new LinkedList<>();
        this.list_PackageDeclaration = new LinkedList<>();
        this.list_NewMacroMethods = new LinkedList<>();

        this.DefaultVersionValue = new InternalValue(this.list_DefaultVersion,
                this.DefaultVersionContext);
        this.PackageDeclarationValue = new InternalValue(
                this.list_PackageDeclaration, this.PackageDeclarationContext);
        this.NewMacroMethodsValue = new InternalValue(this.list_NewMacroMethods,
                this.NewMacroMethodsContext);
    }

    public void addAllDefaultVersion(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("DefaultVersion");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("MacroFactory");
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "DefaultVersion");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeDefaultVersion(macro);
            this.list_DefaultVersion.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeDefaultVersion(
            Macro macro) {

        macro.apply(new InternalsInitializer("DefaultVersion") {

            @Override
            void setVersion(
                    MVersion mVersion) {

            }
        });
    }

    public void addDefaultVersion(
            MVersion macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("DefaultVersion");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("MacroFactory");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_DefaultVersion.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllPackageDeclaration(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("PackageDeclaration");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("MacroFactory");
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
            throw ObjectMacroException.cannotModify("MacroFactory");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_PackageDeclaration.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    public void addAllNewMacroMethods(
            List<Macro> macros) {

        if (macros == null) {
            throw ObjectMacroException.parameterNull("NewMacroMethods");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("MacroFactory");
        }

        int i = 0;

        for (Macro macro : macros) {
            if (macro == null) {
                throw ObjectMacroException.macroNull(i, "NewMacroMethods");
            }

            if (getMacros() != macro.getMacros()) {
                throw ObjectMacroException.diffMacros();
            }

            verifyTypeNewMacroMethods(macro);
            this.list_NewMacroMethods.add(macro);
            this.children.add(macro);
            Macro.cycleDetector.detectCycle(this, macro);

            i++;
        }
    }

    void verifyTypeNewMacroMethods(
            Macro macro) {

        macro.apply(new InternalsInitializer("NewMacroMethods") {

            @Override
            void setMacroCreatorMethod(
                    MMacroCreatorMethod mMacroCreatorMethod) {

            }
        });
    }

    public void addNewMacroMethods(
            MMacroCreatorMethod macro) {

        if (macro == null) {
            throw ObjectMacroException.parameterNull("NewMacroMethods");
        }
        if (this.build_state != null) {
            throw ObjectMacroException.cannotModify("MacroFactory");
        }

        if (getMacros() != macro.getMacros()) {
            throw ObjectMacroException.diffMacros();
        }

        this.list_NewMacroMethods.add(macro);
        this.children.add(macro);
        Macro.cycleDetector.detectCycle(this, macro);
    }

    private String buildDefaultVersion() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.DefaultVersionContext;
        List<Macro> macros = this.list_DefaultVersion;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.DefaultVersionNone != null) {
            sb.append(this.DefaultVersionNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.DefaultVersionBeforeFirst != null) {
                expansion = this.DefaultVersionBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.DefaultVersionAfterLast != null) {
                expansion = this.DefaultVersionAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.DefaultVersionSeparator != null) {
                expansion = this.DefaultVersionSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
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

    private String buildNewMacroMethods() {

        StringBuilder sb = new StringBuilder();
        Context local_context = this.NewMacroMethodsContext;
        List<Macro> macros = this.list_NewMacroMethods;

        int i = 0;
        int nb_macros = macros.size();
        String expansion = null;

        if (this.NewMacroMethodsNone != null) {
            sb.append(this.NewMacroMethodsNone.apply(i, "", nb_macros));
        }

        for (Macro macro : macros) {
            expansion = macro.build(local_context);

            if (this.NewMacroMethodsBeforeFirst != null) {
                expansion = this.NewMacroMethodsBeforeFirst.apply(i, expansion,
                        nb_macros);
            }

            if (this.NewMacroMethodsAfterLast != null) {
                expansion = this.NewMacroMethodsAfterLast.apply(i, expansion,
                        nb_macros);
            }

            if (this.NewMacroMethodsSeparator != null) {
                expansion = this.NewMacroMethodsSeparator.apply(i, expansion,
                        nb_macros);
            }

            sb.append(expansion);
            i++;
        }

        return sb.toString();
    }

    private InternalValue getDefaultVersion() {

        return this.DefaultVersionValue;
    }

    private InternalValue getPackageDeclaration() {

        return this.PackageDeclarationValue;
    }

    private InternalValue getNewMacroMethods() {

        return this.NewMacroMethodsValue;
    }

    private void initDefaultVersionInternals(
            Context context) {

        for (Macro macro : this.list_DefaultVersion) {
            macro.apply(new InternalsInitializer("DefaultVersion") {

                @Override
                void setVersion(
                        MVersion mVersion) {

                }
            });
        }
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

    private void initNewMacroMethodsInternals(
            Context context) {

        for (Macro macro : this.list_NewMacroMethods) {
            macro.apply(new InternalsInitializer("NewMacroMethods") {

                @Override
                void setMacroCreatorMethod(
                        MMacroCreatorMethod mMacroCreatorMethod) {

                }
            });
        }
    }

    private void initDefaultVersionDirectives() {

        StringBuilder sb3 = new StringBuilder();
        sb3.append("null");
        this.DefaultVersionNone = new DNone(sb3.toString());
        this.DefaultVersionValue.setNone(this.DefaultVersionNone);
    }

    private void initPackageDeclarationDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        this.PackageDeclarationBeforeFirst = new DBeforeFirst(sb1.toString());
        this.PackageDeclarationValue
                .setBeforeFirst(this.PackageDeclarationBeforeFirst);
    }

    private void initNewMacroMethodsDirectives() {

        StringBuilder sb1 = new StringBuilder();
        sb1.append(LINE_SEPARATOR);
        sb1.append(LINE_SEPARATOR);
        this.NewMacroMethodsSeparator = new DSeparator(sb1.toString());
        this.NewMacroMethodsValue.setSeparator(this.NewMacroMethodsSeparator);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LINE_SEPARATOR);
        this.NewMacroMethodsBeforeFirst = new DBeforeFirst(sb2.toString());
        this.NewMacroMethodsValue
                .setBeforeFirst(this.NewMacroMethodsBeforeFirst);
    }

    @Override
    void apply(
            InternalsInitializer internalsInitializer) {

        internalsInitializer.setMacroFactory(this);
    }

    @Override
    public String build() {

        BuildState buildState = this.build_state;

        if (buildState == null) {
            buildState = new BuildState();
        }
        else if (buildState.getExpansion() == null) {
            throw ObjectMacroException.cyclicReference("MacroFactory");
        }
        else {
            return buildState.getExpansion();
        }
        this.build_state = buildState;
        List<String> indentations = new LinkedList<>();
        StringBuilder sbIndentation = new StringBuilder();

        initDefaultVersionDirectives();
        initPackageDeclarationDirectives();
        initNewMacroMethodsDirectives();

        initDefaultVersionInternals(null);
        initPackageDeclarationInternals(null);
        initNewMacroMethodsInternals(null);

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
        sb0.append("public class Macros");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    private VERSIONS version;");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    public Macros(");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            VERSIONS version)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        if(version == null)");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("            throw ObjectMacroException.versionNull();");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("        this.version = version;");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        sb0.append(LINE_SEPARATOR);
        sb0.append("    public Macros()");
        sb0.append("{");
        sb0.append(LINE_SEPARATOR);
        sb0.append("        this.version = ");
        sb0.append(buildDefaultVersion());
        sb0.append(";");
        sb0.append(LINE_SEPARATOR);
        sb0.append("    }");
        sb0.append(LINE_SEPARATOR);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    ");
        indentations.add(sb2.toString());
        sb1.append(buildNewMacroMethods());
        sb0.append(applyIndent(sb1.toString(),
                indentations.remove(indentations.size() - 1)));
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
