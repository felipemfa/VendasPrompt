package vendasprompt.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vendasprompt.modelo.Carrinho;
import vendasprompt.modelo.Produto;

public class CarrinhoDAO extends ConexaoSQLiteJDBC {
    private static final String SCRIPT_CRIACAO_TABELA = "create table if not exists carrinho"
            + " (descrico  VARCHAR(80) not null,"
            + " valor     INTEGER not null)";

    public void criarTabelasBD() {
        try{
            try {
                getstatement().execute(SCRIPT_CRIACAO_TABELA);    
            } catch (SQLException ex) {
            }
        }finally{
            fecharConexao();  
        }
    }
    
    public Carrinho getCarrinho(){
        Carrinho carrinho = new Carrinho();
        try{
            try{            
                ResultSet resultSet = getstatement().executeQuery("select * from carrinho");
                while (resultSet.next()) {
                   Produto produto = new Produto();
                   produto.setDescricao(resultSet.getString("descrico"));
                   produto.setValor(resultSet.getFloat("valor"));
                   carrinho.addItem(produto);
                }
            } catch (SQLException ex) {
            }
        }finally{
            fecharConexao();  
        }
        return carrinho;
    }
    
    public void salvarProduto(Produto produto){
        try{
            try {
                PreparedStatement preparedStatement = getConnection().prepareStatement("insert into carrinho values(?,?)");
                preparedStatement.setString(1, produto.getDescricao());
                preparedStatement.setFloat(2, produto.getValor());
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
            }
        }finally{
            fecharConexao();  
        }
    }
    
    public void limparCarrinho(){
        try {
            try {            
               getstatement().execute("delete from carrinho");
            } catch (SQLException ex) {
            }
        }finally{
            fecharConexao();  
        }
    }
    
}
