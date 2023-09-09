/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presencavip.web.command;

import com.presencavip.core.impl.controle.Fachada;
import com.presencavip.core.interfaces.IFachada;
import com.presencavip.web.interfaces.ICommand;



/**
 *
 * @author caioc_000
 */
public abstract class AbstractCommand implements ICommand{
    
    protected IFachada fachada = new Fachada();
    
}
