/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aplicacaomodelo.domain;

import java.util.Date;

/**
 *
 * @author Pedro Henrique e Thiago Aparecido
 */
public class Pessoa extends EntidadeDominio{
    
    private String nome;
    private String email;
    private String senha;
    private Integer tipo;


    public Pessoa() {
   
    }

    public Pessoa(int i, String nome, String email, String senha, Integer tipo) {
        setId(i);
        this.nome = nome;
        this.email = email;
        this.email = email;
        this.tipo = tipo;               
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
        
}
