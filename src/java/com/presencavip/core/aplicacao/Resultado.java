/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presencavip.core.aplicacao;

import com.presencavip.domain.EntidadeDominio;
import java.util.List;

/**
 *
 * @author Pedro Henrique e Thiago Aparecido
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
