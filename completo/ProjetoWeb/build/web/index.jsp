<%@page import="Classes.Usuario"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <title>JSP Page</title>
    </head>
    <body>

        <%@include file="include/menuPrincipal.jsp"%>
        <%
            Usuario usuEncontrado = (Usuario) session.getAttribute("usuEncontrado");
        %>
        <p>
            Seja bem vindo <b> <%= usuEncontrado.getNome()%> </b>
        </p>
        
    </body>
</html>
