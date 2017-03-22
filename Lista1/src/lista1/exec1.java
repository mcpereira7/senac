/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 * 1. Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois
 * números.
 * @author marcelo.cpereira4
 */
public class exec1 {
    public static void main(String[] args) {
        // declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite o primeiro número");
        num1 = leitor.nextInt();
        
        System.out.println("Digite o segundo número");
        num2 = leitor.nextInt();
        
        System.out.println("O produto do primeiro pelo segundo é: "+(num1*num2));
    }
    
}
