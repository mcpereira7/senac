package lista1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.
 *
 * @author Marcelo Pereira
 */
public class exec14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numéro: ");
        double num2 = sc.nextDouble();

        if (num1 >= num2) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));
        }

    }

}
