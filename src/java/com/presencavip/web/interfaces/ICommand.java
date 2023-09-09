/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.presencavip.web.interfaces;

import com.presencavip.core.aplicacao.Resultado;
import com.presencavip.domain.EntidadeDominio;

/**
 *
 * @author Caio Gustavo
 */
public interface ICommand {
    
    public Resultado execute(EntidadeDominio entidade);
}
