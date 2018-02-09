/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt.visao;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Prompt {
    public static final String[] OPCOES_MENU_INICIAL = {"Adicionar Item","Listar Itens","Total do carrinho"};
    public static final int SAIR_MENU = 0;
    public static final int ADICIONA_ITEM = 1;
    public static final int LISTA_ITEM = 2;
    public static final int TOATAL_CARRINHO = 3;
    
    
      
    public void exibeMenuInicial(){
        System.out.println("MENU PRINCIPAL\n\n");
        for (int opcao = 1; opcao <= OPCOES_MENU_INICIAL.length; opcao++) {
            System.out.println(opcao+" - "+OPCOES_MENU_INICIAL[opcao-1]); 
        }
            System.out.println("0 - Sair"); 
            System.out.println("\n\n");
    }
    public int getOpcaoMenu(){
        Scanner leitorPromt = new Scanner(System.in);   
        int opcaoSelecionada = -1 ;
        do{
            System.out.println("Digite sua escolha:");
        try{
            opcaoSelecionada =  leitorPromt.nextInt(); 
        }catch (InputMismatchException ex) {
            System.out.println("Digite um numero inteiro!");
            leitorPromt.nextLine();
        }
        } while ((opcaoSelecionada < 0) || (opcaoSelecionada > OPCOES_MENU_INICIAL.length));
        return opcaoSelecionada;
    }
    
   
    
}



