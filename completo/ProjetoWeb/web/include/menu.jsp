<%-- 
    Document   : menu
    Created on : 23/07/2016, 10:35:01
    Author     : ESCOLA
--%>


<!DOCTYPE html>
<html>
    <head>

        <title> Menu </title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <link rel="stylesheet" type="text/css" href="css/estilo.css"
    </head>
    <body>
        <div id="body">
          <div id="tudo">
            <div id="conteudo">
                <form method="get" action="usuarioControllerMostraDados"> 
                    <center>
                        <table width="90%" border="1" cellspacing="10">
                            <tr>
                                <td>
                                   <center><h3><a href="edicaoDados2?acao=lis"> 
                                           <img src="Image/User.jpg"><br>Listar todos os dados</a>  
                                            </h3> </center>
                                </td>
                                <td>Digite o código do usuário <br>
                                <center>    <input type="text" name="txtID" value="" > <br>
                                 <input type="submit" value="Pesquisar"> </center>
                                    </td>
                </form>
                <form method="Post" action="usuarioControllerMostraDados"> 
                    <center><td>Digite o nome do usuário <br>
                                 <center>    <input type="text" name="txtNome" value="" > <br>
                       <input type="submit" value="Pesquisar"> </center>
                        </td></center>
                            </tr>
                       </table>
                    </center>
                </form>
            </div></div></div>
    </body>
</html>
