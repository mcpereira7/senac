package lista1;

import java.util.Scanner;

/**
 * Leia 3 números decimais A, B e C e ordene­os em ordem decrescente, de modo
 * que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de
 * triângulo que estes três lados formam, com base nos
 * seguintes casos, sempre escrevendo uma mensagem adequada:
 *
 * @author Marcelo Pereira
 */
public class exec18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados de um triângulo!");
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();

        //se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            //se A2  = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
            if ((a * a) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            //se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
            if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            // se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
            if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            //se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
            if (a == b && a == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            //se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
            if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
                System.out.println("TRIANGULO ISOSCELES");

            }
        }
    }

}
