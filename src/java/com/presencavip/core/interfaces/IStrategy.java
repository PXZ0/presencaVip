/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presencavip.core.interfaces;

import com.presencavip.domain.EntidadeDominio;




/**
 *
 * @author caioc_000
 */
public interface IStrategy {
    
    public String processar (EntidadeDominio entidade);
    
}
