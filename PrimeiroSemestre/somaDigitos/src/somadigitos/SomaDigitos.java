package somadigitos;

import java.util.Scanner;

/**
 * Escrva um programa que lê um número e mostra a soma dos seus dígitos
 *
 * @author marcelo.cpereira4
 */
public class SomaDigitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String num = sc.nextLine();
        int tamanho = num.length();
        int soma = 0;

        // validando se valor digitado é um número inteiro
        if (num.matches("[0-9]*")) {
        // laço onde fará a soma dos digitos do número informado.
            for (int i = 0; i < tamanho; i++) {
                soma = soma + Integer.parseInt(num.substring(i, i + 1));
            }
            System.out.println("A soma dos dígitos é = " + soma);
        } else {
            // mensagem se número não for inteiro
            System.out.println("Número inválido!");
        }
    }

}
