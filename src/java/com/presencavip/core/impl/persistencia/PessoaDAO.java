/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presencavip.core.impl.persistencia;

import com.presencavip.domain.EntidadeDominio;
import com.presencavip.domain.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Caio Gustavo
 */
public class PessoaDAO extends AbstractJdbcDAO{

    public PessoaDAO(Connection connection, String table, String idTable) {
        super(connection, table, idTable);
    }
    
     public PessoaDAO(String table, String idTable) {
        super("TB_PESSOA", "ID_PESSOA");
    }
    public PessoaDAO(Connection cx){
        super(cx, "TB_PESSOA", "ID_PESSOA");
    }
    public PessoaDAO(){
        super("TB_PESSOA", "ID_PESSOA");
    }

    @Override
    public void salvar(EntidadeDominio entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(EntidadeDominio entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EntidadeDominio> consultar(EntidadeDominio entidade) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EntidadeDominio visualizar(EntidadeDominio entidade) throws SQLException {
        
        if(connection == null){
            openConnection();
        }
        Pessoa pessoa = (Pessoa) entidade;
        pessoa.setId(0);
        try {
            
            PreparedStatement ps;            
            String sql = "SELECT * FROM tb_pessoa WHERE nome=?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                pessoa.setId(rs.getInt("id_pessoa"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCidade(rs.getString("cidade"));
                
                                
                pessoa.setDtNascimeto(rs.getDate("dt_nascimento"));
                
             
            }
                       
            ps.close();
            rs.close();
            if(ctrlTransaction){
                connection.close();
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return pessoa;
    } 
}
