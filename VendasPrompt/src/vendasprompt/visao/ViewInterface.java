package vendasprompt.visao;

import vendasprompt.modelo.Carrinho;
import vendasprompt.modelo.Produto;

public interface ViewInterface {
    
    public void exibirMenuInicial();
    public int getOpcaoMenu();
    public Produto inserirNovoProduto();
    public void listarProdutosCarrinho(Carrinho carrinho);
    public void imprimirValorTotalCarrinho(Float total);
    public boolean confirmarLimpezaCarrinho();
    
}
