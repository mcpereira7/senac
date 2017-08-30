/*
    Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
    1. Soma de todos os valores digitados que foram positivos;
    2. Quantidade de valores digitados que foram positivos.
    3. Média (decimal) de todos os valores digitados que foram positivos
 */
package aula20170407;

import java.util.Scanner;

public class valoresPositivos {

    public static void main(String[] args) {
        double num, soma = 0, qtd = 0, media = 0, i = 0;
        Scanner entrada = new Scanner(System.in);

        while (i < 6) {
            System.out.print("número: ");
            num = entrada.nextInt();

            if (num > 0) {
                soma = soma + num;
                qtd++;
                media = soma / 6;

            }
            i++;
        }
        System.out.println("Você digitou " + qtd + "números positivos!");
        System.out.println("A soma desses números é: " + soma);
        System.out.printf("A média é: %.2f \n", media);

    }

}
