/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import vendasprompt.modelo.Carrinho;
import vendasprompt.modelo.Produto;

public class CarrinhoDAO extends ConexaoSQLiteJDBC {
    private static final String SCRIPT_CRIACAO_TABELA = "create table if not exists carrinho"
            + " (descrico  VARCHAR(80) not null,"
            + " valor     INTEGER not null)";

    @Override
    public void criarTabelaBD() {
        try{
            try {
                getstatement().execute(SCRIPT_CRIACAO_TABELA);    
            } catch (SQLException ex) {
            }
        }finally{
            fechaConexao();  
        }
    }
    
    public Carrinho getCarrinho(){
        Carrinho carrinho = new Carrinho();
        try {            
            ResultSet resultSet = getstatement().executeQuery("select * from carrinho");
            while (resultSet.next()) {
               Produto produto = new Produto();
               produto.setDescricao(resultSet.getString("descrico"));
               produto.setValor(resultSet.getFloat("valor"));
               carrinho.addItem(produto);
            }
        } catch (SQLException ex) {
        }
        return carrinho;
    }
    
}
