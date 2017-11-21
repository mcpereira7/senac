/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.Scanner;

/**
 * Marcelo Pereira 
 * Caique Brandão
 */
public class Atividade03 {

    static void Menu(int menuOpcao) {
        do {
            Scanner sc = new Scanner(System.in);
            Pilha pilha = new Pilha();
            String texto="";
            menuOpcao = -1;
                System.out.println("Escolha uma Opção:");
                System.out.println("1 - Criptografar Mensagem");
                System.out.println("2 - Descriptografar Mensagem");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                menuOpcao = sc.nextInt();
            
            switch (menuOpcao) {
                
                case 0:
                    break;
                case 1:
                    System.out.println("Digite um texto: ");
                    texto = sc.next();
                    empilharString(texto);
                    desempilhaString(pilha, texto);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Digite um texto: ");
                    String txt = sc.next();
                    empilharString(txt);
                    desempilhaString(pilha, txt);
                    System.out.println("");
                    break;

            }
        } while (menuOpcao != 0);

    }

    static Pilha empilharString(String txt) {
        Pilha pilha = new Pilha();
        for (int i = 0; i < txt.length(); i++) {
            pilha.push(txt.charAt(i));

        }
        return pilha;
    }

    static void desempilhaString(Pilha pilha, String txtCripto) {
        pilha = empilharString(txtCripto);
        String txt="";
//        Pilha pilha = new Pilha();
        for (int i = 0; i < txtCripto.length(); i++) {
            
//            txt = txt+""+pilha.pop().toString();
            System.out.print(pilha.pop().toString());
            
        }

//        return txtCripto;
    }

    public static void main(String[] args) {
        Menu(0);
        

    }

}
