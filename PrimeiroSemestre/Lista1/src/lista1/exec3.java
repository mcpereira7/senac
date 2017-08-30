/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *3. Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O
 * quadrado de um número A é representado por A2
 * = A * A.
 * @author marcelo.cpereira4
 */
public class exec3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, soma;
        
        System.out.println("Digite um número inteiro");
        n1 = leitor.nextInt();
        
        System.out.println("Digite outro número inteiro");
        n2 = leitor.nextInt();
        
        soma = ((int)Math.pow(n1, 2))+((int)Math.pow(n2, 2)); // Math é do tipo double, colocando int na frente ele converte evitando erro
        
        System.out.println("A soma dos quadrados dos dois números digitados é: "+ soma);
       
    }
    
}
