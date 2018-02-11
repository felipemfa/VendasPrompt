/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt.visao;

import java.util.InputMismatchException;
import java.util.Scanner;
import vendasprompt.modelo.Carrinho;
import vendasprompt.modelo.Produto;

/**
 *
 * @author marcos
 */
public class Prompt implements ViewInterface{
    public static final String[] OPCOES_MENU_INICIAL = {"Adicionar Item","Listar Itens","Total do carrinho"};
    public static final int SAIR_MENU = 0;
    public static final int ADICIONA_ITEM = 1;
    public static final int LISTA_ITEM = 2;
    public static final int TOTAL_CARRINHO = 3;
    Scanner leitorPromt;

    public Prompt() {
        leitorPromt = new Scanner(System.in);
    }
    
    
    
    
      
    public void exibeMenuInicial(){
        System.out.println("MENU PRINCIPAL\n\n");
        for (int opcao = 1; opcao <= OPCOES_MENU_INICIAL.length; opcao++) {
            System.out.println(opcao+" - "+OPCOES_MENU_INICIAL[opcao-1]); 
        }
            System.out.println("0 - Sair"); 
            System.out.println("\n\n");
    }
    public int getOpcaoMenu(){
           
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
    
    public Produto cadastraProduto(){
        String descricaoProduto = "";
        Float precoProduto = 0f;
        do{
            System.out.println("Digite a descrição do produto (ou 'c' para cancelar a inclusão): ");
            descricaoProduto = leitorPromt.next();
            if (descricaoProduto.toUpperCase().equals("C")) {
               return null;                
            }
            precoProduto = getPrecoProduto();
            
        }while(descricaoProduto.equals(""));
        Produto produto = new Produto();
        produto.setDescricao(descricaoProduto);
        produto.setValor(precoProduto);
        return produto;
    }
    private Float getPrecoProduto(){
        Float precoProduto = 0.0f;
        do{
            System.out.println("Digite o valor do produto: (ou 0 para cancelar a inclusão)");
            try{
                precoProduto = leitorPromt.nextFloat();
            }catch (InputMismatchException ex) {
                System.out.println("Digite um valor válido!");
            }
        }while(Float.compare(precoProduto, 0.0f)<0);    
        
        System.out.println("teste "+precoProduto);
        return precoProduto;
    }
    
    public void listCarrinho(Carrinho carrinho){
        System.out.println("Descrição | Valor");
        for (Produto produto : carrinho.getItens()) {      
            System.out.printf("%s | R$ %f\n", produto.getDescricao(), produto.getValor());
        }
        aguardaQualquerTecla();
    }
    
    public void imprimeTotalCarrinho(Float total){
        System.out.printf("Total do carrinho é R$ %f \n\n\n",total);;
        aguardaQualquerTecla();
    }
    
    
    private void aguardaQualquerTecla(){
        System.out.println("Aperte qualquer tecla para retornar");
        leitorPromt.nextLine();//intercepta o "enter" anterior
        leitorPromt.nextLine();//aguarda qualquer tecla para prosseguir
    }
    
   
    
}



