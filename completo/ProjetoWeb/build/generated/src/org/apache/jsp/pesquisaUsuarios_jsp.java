package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pesquisaUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/include/menuPrincipal.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <title> Menu </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Menu </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"body\">\n");
      out.write("        <div id=\"tudo\">\n");
      out.write("        <div id=\"conteudo\">\n");
      out.write("           <center><img src=\"Image/x9.JPG\"> </center>\n");
      out.write("           <center>  <table width=\"90%\" border=\"1\" cellspacing=\"10\">\n");
      out.write("              <tr> <td><center><a href=\"pesquisaUsuarios.jsp\"> <img src=\"Image/usuario.jpg\" width=\"200\"></center> \n");
      out.write("                   <td><center><a href=\"edicaoDados2?acao=lis\"> <img src=\"Image/produtos.jpg\" width=\"200\"></center> \n");
      out.write("                   <td><center><a href=\"edicaoDados2?acao=lis\"> <img src=\"Image/clientes.jpg\" width=\"200\"></center> \n");
      out.write("                          \n");
      out.write("              </tr>    \n");
      out.write("                     </table></center>\n");
      out.write("        </div></div></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"body\">\n");
      out.write("          <div id=\"tudo\">\n");
      out.write("            <div id=\"conteudo\">\n");
      out.write("                <form method=\"get\" action=\"usuarioControllerMostraDados\"> \n");
      out.write("                    <center>\n");
      out.write("                        <table width=\"90%\" border=\"1\" cellspacing=\"10\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                   <center><h3><a href=\"edicaoDados2?acao=lis\"> \n");
      out.write("                                           <img src=\"Image/User.jpg\"><br>Listar todos os dados</a>  \n");
      out.write("                                            </h3> </center>\n");
      out.write("                                </td>\n");
      out.write("                                <td>Digite o código do usuário <br>\n");
      out.write("                                <center>    <input type=\"text\" name=\"txtID\" value=\"\" > <br>\n");
      out.write("                                 <input type=\"submit\" value=\"Pesquisar\"> </center>\n");
      out.write("                                    </td>\n");
      out.write("                </form>\n");
      out.write("                <form method=\"Post\" action=\"usuarioControllerMostraDados\"> \n");
      out.write("                    <center><td>Digite o nome do usuário <br>\n");
      out.write("                                 <center>    <input type=\"text\" name=\"txtNome\" value=\"\" > <br>\n");
      out.write("                       <input type=\"submit\" value=\"Pesquisar\"> </center>\n");
      out.write("                        </td></center>\n");
      out.write("                            </tr>\n");
      out.write("                       </table>\n");
      out.write("                    </center>\n");
      out.write("                </form>\n");
      out.write("            </div></div></div>\n");
      out.write("    </body>\n");
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
