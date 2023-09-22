package com.aplicacaomodelo.web.command;

import com.aplicacaomodelo.core.aplicacao.Resultado;
import com.aplicacaomodelo.core.impl.controle.Fachada;
import com.aplicacaomodelo.core.interfaces.IFachada;
import com.aplicacaomodelo.domain.EntidadeDominio;
import com.aplicacaomodelo.web.interfaces.ICommand;





/**
 * @author caioc_000
 */
public class ConsultarCommand implements ICommand{

    
    @Override
    public Resultado execute(EntidadeDominio entidade) {
        
        IFachada f = new Fachada();
        return f.consultar(entidade);
    }
    
}
