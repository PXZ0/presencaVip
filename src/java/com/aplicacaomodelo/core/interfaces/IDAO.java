/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacaomodelo.core.interfaces;

import com.aplicacaomodelo.domain.EntidadeDominio;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author caioc_000
 */
public interface IDAO {
    
    public void salvar (EntidadeDominio entidade) throws SQLException;
    public void alterar (EntidadeDominio entidade) throws SQLException;
    public void excluir (EntidadeDominio entidade) throws SQLException;
    public List<EntidadeDominio> consultar (EntidadeDominio entidade) throws SQLException;
    public EntidadeDominio visualizar (EntidadeDominio entidade) throws SQLException;
    
}
