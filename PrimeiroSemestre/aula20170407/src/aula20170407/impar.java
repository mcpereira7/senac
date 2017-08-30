/*
    Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
    inclusive o X, se for o caso. Use o laço for.
 */
package aula20170407;

import java.util.Scanner;

public class impar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X;
        System.out.print("Digite um número: ");
        X = sc.nextInt();

        for (int i = 1; i <= X;) {
            int mod = X % 2;
            if (mod != 0) {
                System.out.println(X);
            }

            X--;
        }
    }

}
