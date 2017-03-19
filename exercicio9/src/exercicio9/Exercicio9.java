package exercicio9;

import java.util.Scanner;

/**
 *Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:

b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B.
 * @author Marcelo Pereira
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double a, b, c, calculo;
        
        System.out.println("insira o valor de A:");
        a = leitor.nextDouble();
        
        System.out.println("Insira o valor de B:");
        b = leitor.nextDouble();
        
        System.out.println("Insira o valor de C:");
        c = leitor.nextDouble();
        
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        calculo=(a*c)/2;
        System.out.println("A área do triângulo retângulo de base A e altura C é: " + calculo);

    }
    
}
