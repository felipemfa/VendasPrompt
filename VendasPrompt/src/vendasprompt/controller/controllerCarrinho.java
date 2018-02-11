package vendasprompt.controller;

import vendasprompt.dao.CarrinhoDAO;
import vendasprompt.modelo.Produto;
import static vendasprompt.visao.Prompt.ADICIONA_ITEM;
import static vendasprompt.visao.Prompt.LIMPAR_CARRINHO;
import static vendasprompt.visao.Prompt.LISTA_ITEM;
import static vendasprompt.visao.Prompt.SAIR_MENU;
import static vendasprompt.visao.Prompt.TOTAL_CARRINHO;
import vendasprompt.visao.ViewInterface;

public class controllerCarrinho {
    ViewInterface viewInterface;
    CarrinhoDAO carrinhoDAO = new CarrinhoDAO();

    public controllerCarrinho(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
        carrinhoDAO.criarTabelasBD();
        iniciarTelaSistema();
    }
    
    private void iniciarTelaSistema(){
       int opcaoMenu = -1;
       do{
           switch (opcaoMenu) {
                case ADICIONA_ITEM:
                    Produto novoProduto = viewInterface.inserirNovoProduto();
                    if (novoProduto != null) {
                        carrinhoDAO.salvarProduto(novoProduto);
                    }                   
                    opcaoMenu = -1;
                    break;
                case LISTA_ITEM:
                    viewInterface.listarProdutosCarrinho(carrinhoDAO.getCarrinho());
                    opcaoMenu = -1;
                    break;
                case TOTAL_CARRINHO:
                    viewInterface.imprimirValorTotalCarrinho(carrinhoDAO.getCarrinho().getValorTotal());
                    opcaoMenu = -1;
                    break;
                case LIMPAR_CARRINHO:
                    if(viewInterface.confirmarLimpezaCarrinho()){
                        carrinhoDAO.limparCarrinho();
                    };
                    opcaoMenu = -1;
                case SAIR_MENU:
                    opcaoMenu = -1;
                    break;
                default: {
                    viewInterface.exibirMenuInicial();
                    opcaoMenu = viewInterface.getOpcaoMenu();
                }
            }
       }while(opcaoMenu !=SAIR_MENU);
    }
    
    
}
