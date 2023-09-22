package com.aplicacaomodelo.core.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author caioc_000
 */
public class Conexao {
    
    public static Connection getConnection() throws ClassNotFoundException,
            SQLException{
        
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5433/presenca_vip";
        String user = "postgres";
        String password = "postgres";
        Class.forName( driver );
        Connection conn = 
                        DriverManager.getConnection( url, user, password);

        return conn;
    }
    
}
