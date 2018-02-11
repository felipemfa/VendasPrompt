package vendasprompt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ConexaoSQLiteJDBC {
    private static final String URL_CONEXAO = "jdbc:sqlite:./vendasprompt.db"; 
    private Connection conexao = null;
    private Statement statement;
    abstract public void criarTabelasBD();
    
    protected Statement getstatement() throws SQLException {
        conexao = DriverManager.getConnection(URL_CONEXAO);
        statement = conexao.createStatement();
       return statement; 
    }
    protected Connection getConnection() throws SQLException {
        conexao = DriverManager.getConnection(URL_CONEXAO);
       return conexao; 
    }
  
    protected void fecharConexao() {
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