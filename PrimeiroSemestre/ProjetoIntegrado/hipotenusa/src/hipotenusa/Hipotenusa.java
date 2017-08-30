package hipotenusa;

import java.util.Scanner;

/**
 * Escreva um programa em Java que lê o tamanho dos dois catetos de um triângulo retângulo e que mostra o tamanho da hipotenusa.
 * @author Marcelo Pereira
 */
public class Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double cateto1, cateto2, calculo;
        
        System.out.println("Digite o valor do primeiro cateto:");
        cateto1 = entrada.nextDouble();
        
        System.out.println("Digite o valor do segundo cateto:");
        cateto2 = entrada.nextDouble();
        
        calculo = (Math.pow(cateto1, 2)+(Math.pow(cateto2, 2)));
        
        
        System.out.println("O valor da Hipotenusa é: " + (Math.sqrt(calculo)));
    }
    
}
