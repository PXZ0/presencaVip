/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aplicacaomodelo.web.interfaces;

import com.aplicacaomodelo.core.aplicacao.Resultado;
import com.aplicacaomodelo.domain.EntidadeDominio;

/**
 *
 * @author Caio Gustavo
 */
public interface ICommand {
    
    public Resultado execute(EntidadeDominio entidade);
}
