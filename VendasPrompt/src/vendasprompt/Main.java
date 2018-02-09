/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt;

import vendasprompt.visao.Prompt;
import static vendasprompt.visao.Prompt.ADICIONA_ITEM;
import static vendasprompt.visao.Prompt.LISTA_ITEM;
import static vendasprompt.visao.Prompt.SAIR_MENU;
import static vendasprompt.visao.Prompt.TOATAL_CARRINHO;

/**
 *
 * @author Felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ConexaoSQLiteJDBC teste = new ConexaoSQLiteJDBC();
       // teste.connect();
       Prompt prompt = new Prompt();
       int opcaoMenu = -1;
       do{
           switch (opcaoMenu) {
                case ADICIONA_ITEM:
                    break;
                case LISTA_ITEM:
                    break;
                case TOATAL_CARRINHO:
                    break;
                case SAIR_MENU:
                    break;
                default: {
                    prompt.exibeMenuInicial();
                    opcaoMenu = prompt.getOpcaoMenu();
                }
            }
       }while(opcaoMenu !=0);
  
    }
    
}
