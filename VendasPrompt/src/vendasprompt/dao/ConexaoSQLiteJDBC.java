/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Felipe
 */
public abstract class ConexaoSQLiteJDBC {
    private static final String URL_CONEXAO = "jdbc:sqlite:C:/db/chinook.db"; 
    private Connection conexao = null;
    private Statement statement;
    
    abstract public void criarTabelaBD();
    
    protected Statement getstatement() throws SQLException {
        statement = DriverManager.getConnection(URL_CONEXAO).createStatement();
       return statement; 
    }
  
    protected void fechaConexao() {
        try {          
            if (statement != null) {
                statement.close();
            }
            if (conexao !=null) {
                    conexao.close();               
            } 
        } catch (SQLException e) {
        }
    }
}