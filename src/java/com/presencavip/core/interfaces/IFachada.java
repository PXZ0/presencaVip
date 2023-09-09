/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.presencavip.core.interfaces;

import com.presencavip.core.aplicacao.Resultado;
import com.presencavip.domain.EntidadeDominio;



/**
 *
 * @author caioc_000
 */
public interface IFachada {
    
    public Resultado salvar(EntidadeDominio entidade);
    public Resultado alterar(EntidadeDominio entidade);
    public Resultado excluir(EntidadeDominio entidade);
    public Resultado consultar(EntidadeDominio entidade);
    public Resultado visualizar(EntidadeDominio entidade);
}
