/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Date;

/**
 *
 * @author ALUNO
 */
public class Usuario {
    private int idusuario;
    private String nome;
    private String login ;
    private String senha;
    private Date data;

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }
    
    public int getIdusuario() {
        return idusuario;
    }
    public String getNome() {
        return nome;
    }
    public String getLogin() {
        return login;
    }
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }
  
}
