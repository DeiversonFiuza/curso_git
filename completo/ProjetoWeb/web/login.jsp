<%-- 
    Document   : login
    Created on : 24/05/2016, 15:59:56
    Author     : ALUNO
--%>

<%@page import="manipulaDADOS.IdentificaUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> login do usuário </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <% IdentificaUsuario iu = new IdentificaUsuario();
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        boolean status = iu.verificaUsuario(login, senha);
        
        if(status == true){
            out.print("login feito com sucesso "+iu.nome);
        }else{
            out.println("login ou senha inválidos ");
        }
        %>
    </body>
</html>
