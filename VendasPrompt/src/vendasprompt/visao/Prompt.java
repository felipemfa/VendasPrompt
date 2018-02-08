/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt.visao;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Prompt {
    public static final String[] OPCOES_MENU_INICIAL = {"Novo pedido","Cadastro de produtos","Listar pedidos"};
    public static final int NOVO_PEDIDO = 1;
    public static final int CADASTRAR_PRODUTO = 2;
    public static final int LISTAR_PEDIDOS = -3;
    
    
    public void exibeMenu(int opcao){
        switch (opcao) {
            case NOVO_PEDIDO:
                break;
            case CADASTRAR_PRODUTO:
                break;
            case LISTAR_PEDIDOS:
                break;
            default:exibeMenuInicial();                
        }
    }
    
    private void exibeMenuInicial(){
        System.out.println("MENU PRINCIPAL\n\n");
        for (int opcao = 1; opcao <= OPCOES_MENU_INICIAL.length; opcao++) {
            System.out.println(opcao+" - "+OPCOES_MENU_INICIAL[opcao-1]); 
        }
            System.out.println("0 - Sair"); 
            System.out.println("\n\nDigite sua escolha:");
    }
    public int getOpcaoMenu(){
        Scanner leitorPromt = new Scanner(System.in);
        return leitorPromt.nextInt();   
    }
    
   
    
}



