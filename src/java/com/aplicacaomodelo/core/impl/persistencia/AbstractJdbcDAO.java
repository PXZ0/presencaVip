/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacaomodelo.core.impl.persistencia;
import com.aplicacaomodelo.core.interfaces.IDAO;
import com.aplicacaomodelo.core.util.Conexao;
import com.aplicacaomodelo.domain.EntidadeDominio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author caioc_000
 */
public abstract class AbstractJdbcDAO implements IDAO {
    
    public Connection connection;
    protected String table;
    protected String idTable;
    public boolean ctrlTransaction = true;
    
    public AbstractJdbcDAO(Connection connection, String table, String idTable){
        
        this.table = table;
        this.idTable = idTable;
        this.connection = connection;
    }
    
    protected AbstractJdbcDAO(String table, String idTable){
        
        this.table = table;
        this.idTable = idTable;
    }
    
    @Override
    public void excluir(EntidadeDominio entidade){
        openConnection();
        PreparedStatement pst = null;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(table);
        sb.append(" WHERE ");
        sb.append(idTable);
        sb.append("=");
        sb.append("?");
        try {
            
            connection.setAutoCommit(false);
            pst = connection.prepareStatement(sb.toString());
            pst.setInt(1,entidade.getId());
            
            pst.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                if(ctrlTransaction)
                    connection.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }

    protected void openConnection() {
        
        try {
            if(connection == null || connection.isClosed())
                connection = Conexao.getConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
}
