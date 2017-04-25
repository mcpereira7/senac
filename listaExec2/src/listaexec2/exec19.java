package listaexec2;

import java.util.Scanner;

/**
 * A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida
 * como série de Fibonacci. Nessa sequência, cada número, depois dos 2
 * primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um
 * inteiro N (onde N < 46) e mostre os N primeiros números dessa série. Utilize
 * o laço que lhe for mais conveniente.
 *
 * @author Marcelo Pereira
 */
public class exec19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        if (num < 46) {
            for (int i = 0; i < num; i++) {
                int num2 = i + i;
                System.out.print(num2 + " ");
            }
        }
        System.out.println("");
    }
}
