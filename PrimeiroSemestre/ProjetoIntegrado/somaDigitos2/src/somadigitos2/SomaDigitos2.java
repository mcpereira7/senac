package somadigitos2;

import java.util.Scanner;

/**
 * Escreva um programa que lê um número e mostra a soma dos seus dígitos, cada
 * um múltiplicado por um peso, da seguinte forma: Se o número tem 4 dígitos, o
 * primeiro dígito deve ser multiplicado por 4, o segundo por 3, o terceiro por
 * 2 e assim por diante. Se o número tem 10 dígitos, o primeiro dígito deve ser
 * multiplicado por 10, o segundo por 9, o terceiro por 8 e assim por diante.
 *
 * @author Marcelo Pereira
 */
public class SomaDigitos2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String num = console.nextLine();
        int tamanho = num.length();
        int soma = 0;

        if (num.matches("[0-9]*")) {
            for (int i = 0; 0 < tamanho; i++) {
                soma = soma + (Integer.parseInt(num.substring(i, i + 1)) * tamanho);
                tamanho--;

            }
            System.out.println(soma);
        } else {
            // mensagem se número não for inteiro
            System.out.println("Número inválido!");
        }
    }

}
