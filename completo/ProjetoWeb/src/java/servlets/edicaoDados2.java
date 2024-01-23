/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import BancoDados.Conexao;
import Classes.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import manipulaDADOS.gravaDados;

/**
 *
 * @author ALUNO
 */
public class edicaoDados2 extends HttpServlet {

    Usuario usu = new Usuario();
    gravaDados usuDAO = new gravaDados();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet edicaoDados2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet edicaoDados2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        String acao = request.getParameter("acao");
        
        
        out.println(acao);
        if (acao.equals("lis")) {

            List<Usuario> lista = usuDAO.buscaTodos();
            String htmlSaida = "<html> <body>  <center><table border='1'>"
                    + "<tr><td>ID </td><td>"
                    + "Nome</td> <td>"
                    + "Login</td></tr>";
            for (Usuario u : lista) {
                htmlSaida += "<tr><td> " + u.getIdusuario() + "</td><td>"
                        + u.getNome() + "</td><td>"
                        + u.getLogin() + "</td>";
            }
            htmlSaida += "</table></body></html>";
            PrintWriter saida = response.getWriter();
            saida.print(htmlSaida);
        }

        if (acao != null && acao.equals("Excluir")) {
            String id = request.getParameter("txtID");
            usu.setIdusuario(Integer.parseInt(id));

            usuDAO.excluir(usu);
            Usuario usu = usuDAO.anteriorID(Integer.parseInt(id));
            //usuDAO.buscaTodosCadastrados();
            request.setAttribute("usuario", usu);
            RequestDispatcher a = request.getRequestDispatcher("mostraFormulario.jsp");
            a.forward(request, response);
            // processRequest(request, response);
        }

        if (acao != null && acao.equals("Proximo")) {

            String codigo = request.getParameter("txtID");
            Usuario usu = usuDAO.proximoID(Integer.parseInt(codigo));
            request.setAttribute("usuario", usu);
            RequestDispatcher a = request.getRequestDispatcher("mostraFormulario.jsp");
            a.forward(request, response);
        }
        if (acao != null && acao.equals("Anterior")) {
            String codigo = request.getParameter("txtID");
            Usuario usu = usuDAO.anteriorID(Integer.parseInt(codigo));
            request.setAttribute("usuario", usu);
            RequestDispatcher a = request.getRequestDispatcher("mostraFormulario.jsp");
            a.forward(request, response);
        }
       
        if (acao != null && acao.equals("Salvar")) {
            //Recebe os dados via método Get
            String nome = request.getParameter("txtNome");
            String login = request.getParameter("txtLogin");
            String senha = request.getParameter("txtSenha");

            //Atribuindo valores as variáveis
            usu.setNome(nome);
            usu.setLogin(login);
            usu.setSenha(senha);

            //Cadastrando os dados no banco de dados com o cadastrar
            usuDAO.cadastrar(usu);

            request.setAttribute("usuario", usu);
            RequestDispatcher a = request.getRequestDispatcher("mostraFormulario.jsp");
            a.forward(request, response);

        }
         if (acao != null && acao.equals("Alterar")) {
            //Recebe os dados via método Get
            String codigo = request.getParameter("txtID");
            String nome = request.getParameter("txtNome");
            String login = request.getParameter("txtLogin");
            String senha = request.getParameter("txtSenha");

            //Atribuindo valores as variáveis
            usu.setIdusuario(Integer.parseInt(codigo));
            usu.setNome(nome);
            usu.setLogin(login);
            usu.setSenha(senha);
          
            //Cadastrando os dados no banco de dados com o cadastrar
            usuDAO.alterarDados(usu);

            request.setAttribute("usuario", usu);
            RequestDispatcher a = request.getRequestDispatcher("mostraFormulario.jsp");
            a.forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
