/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presencavip.domain;

import java.util.Date;

/**
 *
 * @author Caio Gustavo
 */
public class Pessoa extends EntidadeDominio{
    
    private String nome;
    private Date dtNascimeto;
    private String cidade;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dtNascimeto
     */
    public Date getDtNascimeto() {
        return dtNascimeto;
    }

    /**
     * @param dtNascimeto the dtNascimeto to set
     */
    public void setDtNascimeto(Date dtNascimeto) {
        this.dtNascimeto = dtNascimeto;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
        
}
