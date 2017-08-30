package autonomiacarro;

import java.util.Scanner;

/**
 * Escreva um programa em Java que calcula quantos km/l seu carro está fazendo.
 * @author Marcelo Pereira
 */
public class AutonomiaCarro {

    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);
         double km, litros, calculo;
         
         System.out.println("Insira os Quilômetros rodados:");
         km = entrada.nextDouble();
         
         System.out.println("Insira a quantidade de litros de combustível abastecido:");
         litros = entrada.nextDouble();
         
         calculo = km/litros;
         
         System.out.printf("A autonomia de seu carro é de %.2f por litro.\n", calculo);
    }
    
}
