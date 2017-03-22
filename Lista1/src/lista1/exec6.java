package lista1;

import java.util.Scanner;

/**
 * 6. Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (π = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 * f) o perímetro do retângulo que tem lados A e B.

 * @author marcelo.cpereira4
 */
public class exec6 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double a, b, c, calculo;
        
        System.out.println("Digite o valor de A");
        a = leitor.nextFloat();
        
        System.out.println("Digite o valor de B");
        b = leitor.nextFloat();
        
        System.out.println("Digite o valor de C");
        c = leitor.nextFloat();
        
        calculo=(a*c)/2;
        System.out.println("a área do triângulo retângulo que tem A por base e C por altura."+ calculo);
        
        calculo = (Math.PI*(Math.pow(c, 2)));
        System.out.println("a área do círculo de raio C. (π = 3.14159)"+ calculo);
        
        calculo =((a+b)*c)/2;
        System.out.println("a área do trapézio que tem A e B por bases e C por altura.");
        
        
        
        
             
        
    }
    
}
