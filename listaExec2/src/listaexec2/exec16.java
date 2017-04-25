package listaexec2;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão
 * lidos em seguida do usuário. Para cada valor lido, mostre uma mensagem em
 * português dizendo se este valor lido é par (PAR), ímpar (ÍMPAR), positivo
 * (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu
 * programa deverá imprimir apenas NULO. Utilize o laço DO-WHILE
 *
 * @author Marcelo Pereira
 */
public class exec16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, n2, i = 1, mod;
        System.out.print("insira um valor inteiro maior que 0: ");
        n = sc.nextInt();

        do {
            System.out.print("Digite um número qualquer: ");
            n2 = sc.nextInt();

            if (n2 != 0) {
                mod = n2 % 2;
                if (mod == 0) {
                    System.out.println("PAR");
                    if (n2 > 0) {
                        System.out.println("POSITIVO");
                    } else {
                        System.out.println("NEGATIVO");
                    }
                } else {
                    System.out.println("IMPAR");
                    if (n2 > 0) {
                        System.out.println("POSITIVO");
                    } else {
                        System.out.println("NEGATIVO");
                    }
                }
                i++;
            } else {
                System.out.println("NULLO");
            }
        } while (i <= n);

    }

}
