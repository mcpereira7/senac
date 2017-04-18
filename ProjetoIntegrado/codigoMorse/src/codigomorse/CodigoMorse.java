package codigomorse;

import java.util.Scanner;

/**
 * Escreva um programa que lê um texto (uma String) e o mostra em 
 * Código Morse (deixe um espaço entre um código e outro).
 * @author Marcelo Pereira
 */
public class CodigoMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = ".-", B="-...",C="-.-.",D="-..",E=".",F="..-."
                ,G="--.",H="....",I="..",J=".---",K="-.-",L=".-.."
                ,M="--",N="-.",O="---",P=".--.",Q="--.-",R=".-."
                ,S="...",T="-",U="..-", V="...-",W=".--",X="-..-"
                ,Y="-.--",Z="--..", digitado,posicao;
        int cont =0;
        System.out.println("Digite uma palavra:");
        digitado=sc.nextLine().toUpperCase();
        
        do{
            posicao = digitado.substring(cont, cont+1);
            
            
        }while(cont<=digitado.length());
    }
    
}
