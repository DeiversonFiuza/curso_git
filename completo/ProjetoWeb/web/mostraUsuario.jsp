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
 <%@include file="include/menuPrincipal.jsp" %>
    <form name="frmusu" action="edicaoDados2" onsubmit="return validar()">
        <table>
           
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
                 <td><input type="submit" name="acao" value="Salvar"></td>
                 <td><input type="reset" name="limpar" value="Limpar"></td>
            </tr>
        </table>
    </form>

</body>
</html>
