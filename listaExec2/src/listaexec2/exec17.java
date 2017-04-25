package listaexec2;

import java.util.Scanner;

/**
 * Ler um número inteiro N e calcular e imprimir todos os seus divisores.
 * Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6. Utilize o
 * laço que lhe for mais conveniente.
 *
 * @author Marcelo Pereira
 */
public class exec17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, mod, i = 1;

        System.out.print("Digite um valor inteiro : ");
        n = sc.nextInt();
        System.out.print("Os divisores de " + n + " são: ");
        while (i <= n) {
            mod = n % i;
            if (mod == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("\n\n");
    }

}
