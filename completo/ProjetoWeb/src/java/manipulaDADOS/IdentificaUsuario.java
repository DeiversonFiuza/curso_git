/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaDADOS;

import BancoDados.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ALUNO
 */
public class IdentificaUsuario {

    public String nome = "";
    public boolean result = false;

    public boolean verificaUsuario(String login, String senha) {
        Connection con = Conexao.getConnection();
        try {
            String sql = "select * from usuarios ";
                    sql += "where login = " + "'"+login +"'";
                    sql += "and senha = "+"'"+ senha + "';";
            System.out.println(sql);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }

        } catch (Exception e) {

        }
        return result;
    }

}
