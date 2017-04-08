/*
Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a
1000.
A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato:
1 x N = N 2 x N = 2N ... 10 x N = 10N
 */
package aula20170407;

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite um número maior ou igual a 2 e menor ou igual a 1000: ");
        int numero = leitor.nextInt();
        int i = 1;
        if (numero >= 2 && numero <= 1000) {
            do {
                int mult = i * numero;
                System.out.println(i + " x " + numero + " = " + mult);
                i++;
            } while (i <= 10);
        }

    }

}
