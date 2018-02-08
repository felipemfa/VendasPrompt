/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe
 */
public abstract class ConexaoSQLiteJDBC {
    private static final String URL_CONEXAO = "jdbc:sqlite:C:/db/chinook.db"; 
    private Connection conexao = null;
    
    abstract public void criarTabelaBD();
    
    protected Connection getConnection() throws SQLException {
       return DriverManager.getConnection(URL_CONEXAO); 
    }
  
    protected void fechaConexao() {
        if (conexao !=null) {
            try {
                conexao.close();               
            } catch (Exception e) {
              }
        }      
    }
}