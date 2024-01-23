<%-- 
    Document   : usuario
    Created on : 02/06/2016, 15:46:16
    Author     : ALUNO
--%>


<%@page import="Classes.Usuario"%>

<html>
    <head>
        <title>Cadastro de Usuário</title>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />    
          <script>
            function validar() {
                camponome = document.frmusu.txtNome;
                if (camponome.value == "") {
                    alert("O campo Nome é obrigatório - Preencha-o");
                    camponome.focus();
                    return false;
                }
                return true;
            }
        </script>
    </head>

    <form name="frmusu" method="get" action="usuarioController" onsubmit="return validar()">
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
                <td><input type="submit" name="salvar" value="Salvar"></td>
            </tr>
        </table>
    </form>

    <form method="Post" action="usuarioController" >
        Usando o método Post <br>
        Clique no botão Listar para ver os dados cadastrados no banco de dados.
        <td><input type="submit" value="Listar"></td>
    </form>

</body>
</html>
