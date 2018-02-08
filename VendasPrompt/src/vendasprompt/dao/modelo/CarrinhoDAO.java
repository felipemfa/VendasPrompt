/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt.dao.modelo;

import java.sql.SQLException;
import java.sql.Statement;
import vendasprompt.dao.ConexaoSQLiteJDBC;

/**
 *
 * @author marcos
 */
public class CarrinhoDAO extends ConexaoSQLiteJDBC {
    private static final String SCRIPT_CRIACAO_TABELA = "create table if not exists carrinho"
            + " (descrico  VARCHAR(80) not null,"
            + " valor     INTEGER not null)";

    @Override
    public void criarTabelaBD() {
        try{
            try {
                Statement statement = getConnection().createStatement();
                statement.execute(SCRIPT_CRIACAO_TABELA);
            } catch (SQLException ex) {
            }
        }finally{
            fechaConexao();  
        }
    }
    
}
