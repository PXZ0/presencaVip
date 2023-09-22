/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacaomodelo.web.command;

import com.aplicacaomodelo.core.impl.controle.Fachada;
import com.aplicacaomodelo.core.interfaces.IFachada;
import com.aplicacaomodelo.web.interfaces.ICommand;



/**
 *
 * @author caioc_000
 */
public abstract class AbstractCommand implements ICommand{
    
    protected IFachada fachada = new Fachada();
    
}
