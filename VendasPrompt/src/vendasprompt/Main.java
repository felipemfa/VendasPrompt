/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt;

import vendasprompt.modelo.Carrinho;
import vendasprompt.modelo.Produto;
import vendasprompt.visao.Prompt;
import static vendasprompt.visao.Prompt.ADICIONA_ITEM;
import static vendasprompt.visao.Prompt.LISTA_ITEM;
import static vendasprompt.visao.Prompt.SAIR_MENU;
import static vendasprompt.visao.Prompt.TOTAL_CARRINHO;

/**
 *
 * @author Felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ControleCarrinho controleCarrinho = new ControleCarrinho(new Prompt());
    }
    
}
