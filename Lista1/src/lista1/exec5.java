/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 * 5. Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
 * @author marcelo.cpereira4
 */
public class exec5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double l, area;
        
        System.out.println("Digite o Valor de um lado do quadrado:");
        l = leitor.nextDouble();
        area = l*l;
        System.out.println("A área do quadrado é: "+ area);
    }
    
}
