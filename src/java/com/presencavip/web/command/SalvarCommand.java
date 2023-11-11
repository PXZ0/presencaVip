package com.presencavip.web.command;

import com.presencavip.core.aplicacao.Resultado;
import com.presencavip.core.impl.controle.Fachada;
import com.presencavip.core.interfaces.IFachada;
import com.presencavip.domain.EntidadeDominio;
import com.presencavip.web.interfaces.ICommand;



/**
 * @author caioc_000
 */
public class SalvarCommand implements ICommand{

    @Override
    public Resultado execute(EntidadeDominio entidade) {
        IFachada f = new Fachada();
        return f.salvar(entidade);
    }
    
}
