package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Classes.Usuario;

public final class usuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Cadastro de Usuário</title>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />    \n");
      out.write("          <script>\n");
      out.write("            function validar() {\n");
      out.write("                camponome = document.frmusu.txtNome;\n");
      out.write("                if (camponome.value == \"\") {\n");
      out.write("                    alert(\"O campo Nome é obrigatório - Preencha-o\");\n");
      out.write("                    camponome.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <form name=\"frmusu\" method=\"get\" action=\"usuarioController\" onsubmit=\"return validar()\">\n");
      out.write("        <table>\n");
      out.write("            <tr> <td>ID: </td>\n");
      out.write("                <td><input type=\"text\" name=\"txtID\" value=\"\" size=\"5\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> <td>Nome: </td>\n");
      out.write("                <td><input type=\"text\" name=\"txtNome\" value=\"\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr> <td>Login: </td>\n");
      out.write("                <td><input type=\"text\" name=\"txtLogin\" value=\"\" size=\"20\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td>Senha:</td>\n");
      out.write("                <td><input type=\"password\" name=\"txtSenha\" value=\"\" maxlength=\"6\"> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" name=\"salvar\" value=\"Salvar\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <form method=\"Post\" action=\"usuarioController\" >\n");
      out.write("        Usando o método Post <br>\n");
      out.write("        Clique no botão Listar para ver os dados cadastrados no banco de dados.\n");
      out.write("        <td><input type=\"submit\" value=\"Listar\"></td>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
