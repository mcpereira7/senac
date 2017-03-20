package exercicio9;

import java.util.Scanner;

/**
 *Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
f) o perímetro do retângulo que tem lados A e B.
 * @author Marcelo Pereira
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double a, b, c, calculo, exp, pi;
        
        System.out.println("insira o valor de A:");
        a = leitor.nextDouble();
        
        System.out.println("Insira o valor de B:");
        b = leitor.nextDouble();
        
        System.out.println("Insira o valor de C:");
        c = leitor.nextDouble();
        
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        calculo=(a*c)/2;
        System.out.println("A área do triângulo retângulo de base A e altura C é: " + calculo);
        
        //b) a área do círculo de raio C. (π = 3.14159)
        exp = 2.0;
        pi = 3.14159;
        calculo = pi * (Math.pow(c, exp));
        System.out.printf("A área de um ciruculo de ráio C é igual a %.2f \n", calculo);
        
        //c) a área do trapézio que tem A e B por bases e C por altura.
        calculo = ((a+b)*2)/2;
        System.out.printf("A área de um traézio de base A = %.2f e B = %.2f é igual a %.2f \n", a, b, calculo);
        
        //d) a área do quadrado que tem lado B.
        calculo = b*b;
        System.out.printf("A área de um quadrado de lado %.2f é igual a %.2f \n", b, calculo);
        
        //e) a área do retângulo que tem lados A e B.
        calculo = a*b;
        System.out.printf("A area de um retangulo de largura A = %.1f e altura B = %.1f é igual a %.1f", a, b, calculo);

    }
    
}
