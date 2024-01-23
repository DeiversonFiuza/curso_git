/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Classes.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import manipulaDADOS.gravaDados;

/**
 *
 * @author ALUNO
 */
@WebServlet("/usuarioController")
public class usuarioController extends HttpServlet {

    Usuario usu = new Usuario();
    gravaDados usuDAO = new gravaDados();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet usuarioController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Apresentação dos dados </h1>");
            out.println("<br> ID.....: " + usu.getIdusuario());
            out.println("<br> Nome...: " + usu.getNome());
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
        PrintWriter saida = response.getWriter();
        saida.print("cadastro com sucesso");
        saida.println(nome);
    }

    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Usuario> lista = usuDAO.buscaTodos();
        String htmlSaida = "<html> <body> <center><table border='1'>"
                + "<tr><td>ID </td><td>"
                + "Nome</td> <td>"
                + "Login</td></tr>";
        for(Usuario u : lista){
            htmlSaida += "<tr><td> "+u.getIdusuario()+"</td><td>"+
                    u.getNome()+"</td><td>"
                    +u.getLogin()+"</td>";
        }
        htmlSaida +="</table></body></html>";
        PrintWriter saida = response.getWriter();
        saida.print(htmlSaida);
        //processRequest(request, response);
    
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
