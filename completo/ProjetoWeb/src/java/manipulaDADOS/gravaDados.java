/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaDADOS;

import BancoDados.Conexao;
import Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class gravaDados {

    private Connection con = Conexao.getConnection();

    public void cadastrar(Usuario usu) {
        try {

            String sql = "insert into usuarios(nome,login,senha) values (?,?,?)";

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setString(1, usu.getNome());
            preparador.setString(2, usu.getLogin());
            preparador.setString(3, usu.getSenha());

            preparador.execute();
            preparador.close();
            System.out.println("Cadastro realizado com sucesso");

        } catch (SQLException e) {
            System.out.println("Erro de SQL " + e.getMessage());
        }
    }

    public void alterarDados(Usuario usu) {
        String sql = "update usuarios set nome=?, login=?, senha=? where idusuario=?";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setString(1, usu.getNome());
            preparador.setString(2, usu.getLogin());
            preparador.setString(3, usu.getSenha());
            preparador.setInt(4, usu.getIdusuario());

            preparador.execute();
            preparador.close();
            System.out.println("Operação realizada com sucesso. ");
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }

    public void excluir(Usuario usu) {

        String sql = "delete from usuarios where idusuario=?";

        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, usu.getIdusuario());
            preparador.execute();
            preparador.close();

        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }

    }

    public Usuario buscaPorId(Integer id) {
        Usuario usuRetorno = null;
        String sql = "select * from usuarios where idusuario=?";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, id);
            ResultSet resultado = preparador.executeQuery();
            if (resultado.next()) {
                usuRetorno = new Usuario();
                usuRetorno.setIdusuario(resultado.getInt("idusuario"));
                usuRetorno.setNome(resultado.getString("nome"));
                usuRetorno.setLogin(resultado.getString("login"));
                usuRetorno.setSenha(resultado.getString("senha"));
            }
            System.out.println("Registro encontrado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro de SQL " + e.getMessage());
        }
        return usuRetorno;
    }

    public Usuario proximoID(Integer id) {
        Usuario usuRetorno = null;
        String sql = "select * from usuarios where idusuario>? order by idusuario asc limit 1";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, id);
            ResultSet resultado = preparador.executeQuery();
            if (resultado.next()) {
                usuRetorno = new Usuario();
                usuRetorno.setIdusuario(resultado.getInt("idusuario"));
                usuRetorno.setNome(resultado.getString("nome"));
                usuRetorno.setLogin(resultado.getString("login"));
                usuRetorno.setSenha(resultado.getString("senha"));
            }
            System.out.println("Registro encontrado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro de SQL " + e.getMessage());
        }
        return usuRetorno;
    }

    public Usuario anteriorID(Integer id) {
        Usuario usuRetorno = null;
        String sql = "select * from usuarios where idusuario<? order by idusuario desc limit 1";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, id);
            ResultSet resultado = preparador.executeQuery();
            if (resultado.next()) {
                usuRetorno = new Usuario();
                usuRetorno.setIdusuario(resultado.getInt("idusuario"));
                usuRetorno.setNome(resultado.getString("nome"));
                usuRetorno.setLogin(resultado.getString("login"));
                usuRetorno.setSenha(resultado.getString("senha"));
            }
            System.out.println("Registro encontrado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro de SQL " + e.getMessage());
        }
        return usuRetorno;
    }

    public Usuario pesquisaPorNome(String nome) {
        Usuario usuRetornoNome = null;

        ResultSet resultado = null;
        PreparedStatement preparador = null;
        String sql = "select * from usuarios where nome=?";
        try {
            preparador = con.prepareStatement(sql);
            preparador.setString(1, nome);
            resultado = preparador.executeQuery();
            while (resultado.next()) {
                usuRetornoNome = new Usuario();
                usuRetornoNome.setIdusuario(resultado.getInt("idusuario"));
                usuRetornoNome.setNome(resultado.getString("nome"));
                usuRetornoNome.setLogin(resultado.getString("login"));
                usuRetornoNome.setSenha(resultado.getString("senha"));

            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return usuRetornoNome;

    }

    public List<Usuario> buscaTodos() {
        List<Usuario> listaRetorno = new ArrayList<Usuario>();
        String sql = "select * from usuarios order by idusuario";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            ResultSet resultado = preparador.executeQuery();
            while (resultado.next()) {
                Usuario usu = new Usuario();
                usu.setIdusuario(resultado.getInt("idusuario"));
                usu.setNome(resultado.getString("nome"));
                usu.setLogin(resultado.getString("login"));
                usu.setSenha(resultado.getString("senha"));

                listaRetorno.add(usu);
            }
            System.out.println("Busca realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return listaRetorno;
    }

    public List<Usuario> buscaPorNome(String nome) {
        String sql = "select * from usuarios where nome like ?";
        List<Usuario> lista = new ArrayList<Usuario>();
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            //Que começa com o nome especificado e não importa o fim
            preparador.setString(1, nome + "%");
            ResultSet resultado = preparador.executeQuery();
            while (resultado.next()) {
                Usuario usu = new Usuario();
                usu.setIdusuario(resultado.getInt("idusuario"));
                usu.setNome(resultado.getString("nome"));
                usu.setLogin(resultado.getString("login"));
                usu.setSenha(resultado.getString("senha"));
                lista.add(usu);
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return lista;

    }

    public Usuario autenticar(Usuario usu) {
        String sql = "select * from usuarios where login=? and senha=?";
        Usuario usuRetorno = null;
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setString(1, usu.getLogin());
            preparador.setString(2, usu.getSenha());
            ResultSet resultado = preparador.executeQuery();
            if (resultado.next()) {
                usuRetorno = new Usuario();
                usuRetorno.setIdusuario(resultado.getInt("idusuario"));
                usuRetorno.setNome(resultado.getString("nome"));
                usuRetorno.setLogin(resultado.getString("login"));
                usuRetorno.setSenha(resultado.getString("senha"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usuRetorno;
    }

}
