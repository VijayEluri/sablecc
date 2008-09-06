/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

import java.util.LinkedList;
import java.util.List;

public class M_param_accessor
        extends Macro {

    // ---- constructor ----

    M_param_accessor(
            String p_param_name,
            String p_containing_macro_name) {

        this.p_param_name = p_param_name;
        this.p_containing_macro_name = p_containing_macro_name;
    }

    // ---- parent ----

    @Override
    Macro get_parent() {

        return null;
    }

    // ---- parameters ----

    private final String p_param_name;

    String get_local_p_param_name() {

        return this.p_param_name;
    }

    private final String p_containing_macro_name;

    String get_local_p_containing_macro_name() {

        return this.p_containing_macro_name;
    }

    // ---- expands ----

    private final List<Macro> e_expand_1 = new LinkedList<Macro>();

    // ---- parameter accessors ----

    private String cached_p_param_name;

    String get_p_param_name() {

        String result = this.cached_p_param_name;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_param_accessor)) {
                current = current.get_parent();
            }

            result = ((M_param_accessor) current).get_local_p_param_name();
            this.cached_p_param_name = result;
        }

        return result;
    }

    private String cached_p_containing_macro_name;

    String get_p_containing_macro_name() {

        String result = this.cached_p_containing_macro_name;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_param_accessor)) {
                current = current.get_parent();
            }

            result = ((M_param_accessor) current)
                    .get_local_p_containing_macro_name();
            this.cached_p_containing_macro_name = result;
        }

        return result;
    }

    // ---- macro creators ----

    public M_this new_this() {

        M_this result = new M_this();
        this.e_expand_1.add(result);
        return result;
    }

    public M_parent new_parent() {

        M_parent result = new M_parent();
        this.e_expand_1.add(result);
        return result;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("  private String cached_p_");

        sb.append(get_p_param_name());

        sb.append(";");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("  private String get_p_");

        sb.append(get_p_param_name());

        sb.append("() {");

        sb.append(EOL);

        sb.append("    String result = this.cached_p_");

        sb.append(get_p_param_name());

        sb.append(";");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("    if(result == null) {");

        sb.append(EOL);

        sb.append("      Macro current = ");

        if (this.e_expand_1.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_1) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        sb.append(";");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("      while(!(current instanceof M_");

        sb.append(get_p_containing_macro_name());

        sb.append(")) {");

        sb.append(EOL);

        sb.append("        current = current.get_parent();");

        sb.append(EOL);

        sb.append("      }");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("      result = ((M_");

        sb.append(get_p_containing_macro_name());

        sb.append(") current).get_local_p_");

        sb.append(get_p_param_name());

        sb.append("();");

        sb.append(EOL);

        sb.append("      this.cached_p_");

        sb.append(get_p_param_name());

        sb.append(" = result;");

        sb.append(EOL);

        sb.append("    }");

        sb.append(EOL);

        sb.append(EOL);

        sb.append("    return result;");

        sb.append(EOL);

        sb.append("  }");

        sb.append(EOL);

        sb.append(EOL);
    }

}
