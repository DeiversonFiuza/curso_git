/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Classes.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import manipulaDADOS.gravaDados;

@WebServlet(name = "Autenticador", urlPatterns = {"/Autenticador"})
public class Autenticador extends HttpServlet {

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
            out.println("<title>Servlet Autenticador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Autenticador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Acessando a sessão
        HttpSession sessao = request.getSession(false);
        //Se a sessão ainda não foi expirada;
        if(sessao!=null){
            //invalida a sessão.
            sessao.invalidate();
        }
        //redirecionando para a tela de login
        response.sendRedirect("login.html");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Captura os dados
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        //Adiciona dados         
        usu.setLogin(login);
        usu.setSenha(senha);
        
        PrintWriter out = response.getWriter();
        out.println(login);
        //Faz a autenticação do usuário
        Usuario usuAutentica = usuDAO.autenticar(usu);
        //Verifica se o usuário foi encontrado.
        if (usuAutentica != null) {
            //Cria a sessão
            HttpSession sessao = request.getSession();
            //Adiciona o objeto como atributo da sessão.
            sessao.setAttribute("usuEncontrado", usuAutentica);
            //Definido um tempo para a sessão expirar.
            sessao.setMaxInactiveInterval(3000);
            //Encaminha para a tela de bem vindo.
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{
            response.getWriter().print(
            "<script>"
                    + "alert('Usuário não encontrado!');"
                    + "location.href='login.html'"
                    + "</script>"
            );
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
