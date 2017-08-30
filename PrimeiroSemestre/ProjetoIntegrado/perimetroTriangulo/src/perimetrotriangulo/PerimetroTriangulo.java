package perimetrotriangulo;

import java.util.Scanner;

/**
 * Escreva um programa em Java que lê o tamanho dos dois catetos de um triângulo 
 * retângulo e que mostra o perímetro do triângulo.
 * @author Marcelo Pereira
 */
public class PerimetroTriangulo {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double cat1, cat2, hipo, p;
        
        System.out.println("Digite o valor do primeiro cateto:");
        cat1 = entrada.nextDouble();
        
        System.out.println("Digite o valor do segundo cateto:");
        cat2 = entrada.nextDouble();
        
        hipo = Math.sqrt((cat1*cat1)+(cat2*cat2));
        p= cat1+cat2+hipo;
        
        System.out.println("O perimetro do triângulo é: "+ p);        
        
    }
    
}
