

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="Get" action="usuarioController">
        <table>
            <tr> <td>ID: </td>
                <td><input type="text" name="txtID" value="" size="5"></td>
            </tr>
            <tr> <td>Nome: </td>
                <td><input type="text" name="txtNome" value="" size="20"></td>
            </tr>
            <tr> <td>Login: </td>
                <td><input type="text" name="txtLogin" value="" size="20"></td>
            </tr>
            <tr><td>Senha:</td>
                <td><input type="password" name="txtSenha" value="" maxlength="6"> </td>
            </tr>
            <tr>
                  <a href="/edicaoDados2?acao=lis"> Lista usuários </a>
                <td><input type="submit" value="Salvar"></td>
            </tr>
        </table>
    </form>
    </body>
</html>
