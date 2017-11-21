/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class Exec2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();
        int menuOpcao;
        
        do {
            Scanner sc = new Scanner(System.in);
            String texto="";
            menuOpcao = -1;
                System.out.println("Escolha uma Opção:");
                System.out.println("1 - Inserir na fila");
                System.out.println("2 - Furar a fila");
                System.out.println("3 - Imprimir fila");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                menuOpcao = sc.nextInt();
            
            switch (menuOpcao) {
                
                case 0:
                    break;
                case 1:
                    System.out.println("Digite um valor:");
                    fila.enqueue(sc.next());
                    break;
                case 2:
                    fila.furarFila(sc.next());
                    break;
                case 3:
                    fila.imprimeFila();
                    break;

            }
        } while (menuOpcao != 0);
    }
    
}
