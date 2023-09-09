/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presencavip.web.command;

import com.presencavip.core.aplicacao.Resultado;
import com.presencavip.core.impl.controle.Fachada;
import com.presencavip.core.interfaces.IFachada;
import com.presencavip.domain.EntidadeDominio;
import com.presencavip.web.interfaces.ICommand;




/**
 *
 * @author caioc_000
 */
public class VisualizarCommand implements ICommand{

    @Override
    public Resultado execute(EntidadeDominio entidade) {
        IFachada f = new Fachada();
        return f.visualizar(entidade);
    }
    
}
