/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aplicacaomodelo.domain;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Caio Gustavo
 */
public class EntidadeDominio implements Serializable{
    private Integer id;
    private Calendar dtCadastro;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the dtCadastro
     */
    public Calendar getDtCadastro() {
        return dtCadastro;
    }

    /**
     * @param dtCadastro the dtCadastro to set
     */
    public void setDtCadastro(Calendar dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
    
    @Override
    public boolean equals(Object other){
        return other instanceof EntidadeDominio && equals((EntidadeDominio)other);
    }
    
    public boolean equals (EntidadeDominio other){
        return this.id.equals(other.id);
    }
    @Override
    public int hashCode(){
        return id.hashCode();
    }
}
