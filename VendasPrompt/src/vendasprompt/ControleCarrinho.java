/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt;

import vendasprompt.modelo.Carrinho;
import vendasprompt.modelo.Produto;
import static vendasprompt.visao.Prompt.ADICIONA_ITEM;
import static vendasprompt.visao.Prompt.LISTA_ITEM;
import static vendasprompt.visao.Prompt.SAIR_MENU;
import static vendasprompt.visao.Prompt.TOTAL_CARRINHO;
import vendasprompt.visao.ViewInterface;

/**
 *
 * @author Felipe
 */
public class ControleCarrinho {
    ViewInterface viewInterface;

    public ControleCarrinho(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
        iniciaTelaSistema();
    }
    
    private void iniciaTelaSistema(){
        int opcaoMenu = -1;
        
        
        Carrinho car = new Carrinho();
        
        for (int i = 0; i < 10; i++) {
            Produto prod = new Produto();
            prod.setDescricao("PRODUTO "+i);
            prod.setValor(i);
            car.addItem(prod);
        }
        
       do{
           switch (opcaoMenu) {
                case ADICIONA_ITEM:
                    viewInterface.cadastraProduto();
                    opcaoMenu = -1;
                    break;
                case LISTA_ITEM:
                    viewInterface.listCarrinho(car);
                    opcaoMenu = -1;
                    break;
                case TOTAL_CARRINHO:
                    viewInterface.imprimeTotalCarrinho(1888.665f);
                    opcaoMenu = -1;
                    break;
                case SAIR_MENU:
                    opcaoMenu = -1;
                    break;
                default: {
                    viewInterface.exibeMenuInicial();
                    opcaoMenu = viewInterface.getOpcaoMenu();
                }
            }
       }while(opcaoMenu !=SAIR_MENU);
    }
    
    
}
