package lista1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia três números e imprime o maior deles.
 *
 * @author Marcelo Pereira
 */
public class exec13 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int n3 = leitor.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.printf("O número %d foi o maior digitado.\n", n1);
            }

        } else if (n2 > n3) {
            System.out.printf("O número %d foi o maior digitado.\n", n2);
        } else {
            System.out.printf("O número %d foi o maior digitado.\n", n3);
        }

    }

}
