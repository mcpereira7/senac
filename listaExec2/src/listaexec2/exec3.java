package listaexec2;

import java.util.Scanner;

/**
 * Escreva um programa que leia um conjunto de 10 números inteiros positivos.
 * Seu programa deve determinar e imprimir o maior deles. Use o laço FOR.
 *
 * @author Marcelo Pereira
 */
public class exec3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, nmaior = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num > nmaior) {
                nmaior = num;
            }

        }
        System.out.println("O maior número digitado foi: " + nmaior);
    }
}
