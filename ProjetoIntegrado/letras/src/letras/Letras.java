package letras;

import java.util.Scanner;

/**
 * Escreva um programa que lê uma letra e mostra se ela é uma vogal ou
 * consoante. Atenção: use o comando switch
 *
 * @author marcelo.cpereira4
 */
public class Letras {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = console.next();
        if (letra.matches("[a-zA-Z]")) {
            switch (letra.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("A letra " +"'"+ letra +"'"+ " é uma Vogal!");
                    break;
                default:
                    System.out.println("A letra " +"'"+ letra+"'" + " é uma Consoante!");
                    break;
            }
        } else {
            System.out.println("Digite uma letra");
        }

    }
}
