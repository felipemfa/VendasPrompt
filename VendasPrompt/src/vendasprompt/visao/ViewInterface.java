package vendasprompt.visao;

import vendasprompt.modelo.Carrinho;
import vendasprompt.modelo.Produto;

public interface ViewInterface {
    
    public void exibeMenuInicial();
    public int getOpcaoMenu();
    public Produto cadastraProduto();
    public void listCarrinho(Carrinho carrinho);
    public void imprimeTotalCarrinho(Float total);
    
}
