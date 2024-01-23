/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaDADOS;

import Classes.Usuario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class TestaGravaDados {

    static Usuario usuDAO = new Usuario();
    static gravaDados gravaD = new gravaDados();

    public static void main(String args[]) {
        TestaAutenticar();
    }

    private static void deveCadastrar() {
        usuDAO.setNome("x");
        usuDAO.setLogin("´´eéééé");
        usuDAO.setSenha("123");
        //usuDAO.setData("12/12/2015");
        
    


        gravaD.cadastrar(usuDAO);
    }

    private static void deveAlterar() {
        usuDAO.setIdusuario(1);
        usuDAO.setNome("Maria Florentina");
        usuDAO.setLogin("marflo");
        usuDAO.setSenha("mf123");

        gravaD.alterarDados(usuDAO);

    }

    private static void deveExcluir() {
        usuDAO.setIdusuario(1);
        gravaD.excluir(usuDAO);
    }

    private static void deveBuscarId() {

        Usuario usuRetorno = gravaD.buscaPorId(5);

        if (usuRetorno != null) {
            System.out.println(
                    usuRetorno.getIdusuario() + " - "
                    + usuRetorno.getNome() + " - "
                    + usuRetorno.getLogin() + " - "
                    + usuRetorno.getSenha());
        }
    }

    private static void deveBuscarTudo() {
        List<Usuario> lista = gravaD.buscaTodos();
        for (Usuario u : lista) {
            System.out.println(
                    u.getIdusuario() + " - "
                    + u.getNome() + " - "
                    + u.getLogin() + " - "
                    + u.getSenha());
        }

    }
    private static void TestaBuscaPorNome(){
        List<Usuario> nomes = gravaD.buscaPorNome("paulo");
        for(Usuario u : nomes){
            System.out.println("ID: "+u.getIdusuario()+"\n Nome: "+u.getNome()+
                    "\n Login: "+u.getLogin()+" \n Senha: "+u.getSenha());
        }
    }
    private static void TestaAutenticar(){
        Usuario u = new Usuario();
        u.setLogin("xsy");
        u.setSenha("xsy");
        Usuario ux = gravaD.autenticar(u);
        System.out.println("Nome...."+ux.getSenha());
    }
}
