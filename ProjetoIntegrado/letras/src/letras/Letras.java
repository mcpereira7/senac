package letras;

import java.util.Scanner;

/**
 * Escreva um programa que lê uma letra e mostra se ela é uma vogal ou consoante.
 * Atenção: use o comando switch
 * @author marcelo.cpereira4
 */
public class Letras {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String letra =  console.next();
        
        switch(letra.toLowerCase()){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("A letra "+letra+" é uma Volgal");
                break;
            default:
                if(letra.matches("^0"))

        }
    }
    
}
