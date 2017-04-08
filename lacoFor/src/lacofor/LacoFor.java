package lacofor;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class LacoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 0, soma = 0;
        int c = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o item " + i);
            x = entrada.nextInt();
            //x++;
            soma = soma + x;
            //System.out.println(x);
        }
        System.out.println("Total: " + soma);
        
        // Laço while
        while (c < 10) {
            System.out.println("Linha " + c);
            c++;
        }

    }

}
