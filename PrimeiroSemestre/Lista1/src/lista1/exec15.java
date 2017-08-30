package lista1;

import java.util.Scanner;

/**
 * Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara
 * Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0
 * ou raiz de numero negativo,
 * mostre a mensagem correspondente “Impossivel calcular ”.
 *
 * @author Marcelo Pereira
 */
public class exec15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int delta, xi, xii, a, b, c, raiz;

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        c = sc.nextInt();

        delta = (b * b) - 4 * a * c;

        if (delta > 0) {
            raiz = (int) Math.sqrt(delta);
            xi = (-b + raiz) / (2 * a);
            xii = (-b - raiz) / (2 * a);
            System.out.printf("As raizes de Bascara são: %d e %d \n", xi, xii);
        } else {
            System.out.println("Impossível calcular!");
        }
    }

}
