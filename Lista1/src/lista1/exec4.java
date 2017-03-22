/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 * 4. Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
 * (Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é
 * consecutivo de –9)

 * @author marcelo.cpereira4
 */
public class exec4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, nn1, nn2;
        
        System.out.println("Digite um número inteiro:");
        n1=leitor.nextInt();
        
        System.out.println("Digite outro número inteiro:");
        n2 = leitor.nextInt();
        
        nn1 = n1+1;
        nn2 = n2+1;
        
        System.out.println("você digitou: "+n1 +"e "+n2 +" Seus consecutivos são: "+nn1 +", "+nn2);
        
    }
    
}
