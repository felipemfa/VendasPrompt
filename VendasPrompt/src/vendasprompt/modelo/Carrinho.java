package vendasprompt.modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrinho{
    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }
    
    

    public List<Produto> getItens() {
        return produtos;
    }

    public void setItens(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void addItem(Produto produto){
        this.produtos.add(produto);
    }
}
