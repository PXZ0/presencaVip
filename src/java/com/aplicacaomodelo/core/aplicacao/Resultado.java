/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aplicacaomodelo.core.aplicacao;

import com.aplicacaomodelo.domain.EntidadeDominio;
import java.util.List;

/**
 *
 * @author Caio Gustavo
 */
public class Resultado {
    
    private String msg;
    private List<EntidadeDominio> entidades;
        
    public String getMsg() {
	return msg;
    }
        
    public void setMsg(String msg) {
	this.msg = msg;
    }
        
    public List<EntidadeDominio> getEntidades() {
        return entidades;
    }
    
    public void setEntidades(List<EntidadeDominio> entidades) {
	this.entidades = entidades;
    }
}
