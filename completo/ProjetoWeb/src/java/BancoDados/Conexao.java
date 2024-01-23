/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ALUNO
 */
public class Conexao {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3309/loja","root","123");
            System.out.println("Acesso realizado com sucesso");
        }catch(Exception e){
            System.out.println("Ocurreu um erro. "+e.getMessage());
        }
        return con;
    }
}
