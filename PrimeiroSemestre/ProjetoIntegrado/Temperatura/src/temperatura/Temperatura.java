package temperatura;

import java.util.Scanner;

/**
 * Escreva um algoritmo que lê o valor de uma temperatura em °F e a mostra convertida para °C.
 * 
 * @author Marcelo Pereira
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double f,c;
        
        System.out.println("Informe a temperatura em ºF: ");
        f = Double.parseDouble(entrada.nextLine());
        
        c = (5.0/9.0)*(f-32);
        
        System.out.printf("%s ºF é %.5s ºC \n",f,c);
        
    }
    
}
