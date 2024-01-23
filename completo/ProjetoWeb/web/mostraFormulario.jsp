<%@page import="Classes.Usuario"%>
<html><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      </head>
    <body>
         <%@include file="include/menuPrincipal.jsp" %>
         <% Usuario usu = (Usuario) request.getAttribute("usuario");%>
          <form method="get" action="edicaoDados2">
            <center><h1> Usuários Cadastrados </h1>
                <table border="1">  <tr> 
                        <td>Código: </td>
                        <td><input type="text" name="txtID" value="<%=usu.getIdusuario()%>" ></td>
                    </tr>
                    <tr> <td>Nome: </td>
                        <td><input type="text" name="txtNome" value="<%=usu.getNome()%>" ></td>
                    </tr>
                    <tr> <td>Login: </td>
                        <td><input type="text" name="txtLogin" value="<%=usu.getLogin()%>" ></td>
                    </tr>
                    <tr><td>Senha:</td>
                        <td><input type="password" name="txtSenha" value="<%=usu.getSenha()%>" </td>
                    </tr>
                     <td colspan="3">
                         <a href="mostraUsuario.jsp"> <input  type="button" name="acao" value="Novo"> </a>
                        <input type="submit" name="acao" value="Alterar"> 
                        <input type="submit" name="acao" value="Anterior"> 
                        <input type="submit" name="acao" value="Proximo"> 
                        <input type="submit" name="acao" value="Excluir"> 
                    </tr>
                </table></center></form>
</body>
</html>
