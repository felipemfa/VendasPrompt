/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasprompt;

import vendasprompt.dao.ConexaoSQLiteJDBC;
import vendasprompt.visao.Prompt;

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
           prompt.exibeMenu(opcaoMenu);
           opcaoMenu = prompt.getOpcaoMenu();
       }while(opcaoMenu !=0);
  
    }
    
}
