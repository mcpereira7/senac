/*
 * Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o
 * número e o salário do funcionário.

 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author Marcelo Pereira
 */
public class exec9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int func=0;
        double sal=0.0, vlh=0, htb=0;
        
        System.out.println("Digite a identificação do Funcionário");
        func = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Informe a quantidade de horas trabalhadas:");
        htb = Double.parseDouble(leitor.nextLine());
        
        System.out.println("Informe o valor da hora deste funcionário:");
        vlh = Double.parseDouble(leitor.nextLine());
        
        sal =htb*vlh ;
        
        System.out.printf("O salário do funcionário %d é de R$ %.2f \n", func, sal);
        
    }
    
}
