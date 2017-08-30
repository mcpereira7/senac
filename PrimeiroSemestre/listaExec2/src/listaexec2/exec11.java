package listaexec2;

import java.util.Scanner;

/**
 * Faça um programa que leia um número natural N e calcule a soma abaixo
 * (lembre-se de que tanto as divisões quanto o resultado devem ser decimais).
 * Utilize o laço que lhe for mais conveniente. S = 1-(1/2)+(1/3)...+(1/n)
 *
 * @author Marcelo Pereira
 */
public class exec11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 1, num, base=1;
        int i=1;
        
        System.out.print("Digite um número: ");
        num = sc.nextInt();

        while(i<=num) {
            //i = i * (-1);
            base=base*(-1);
            soma = soma + (base/i);
            System.out.println(i+" "+base);
            i++;
        }

        System.out.println("S = " + soma);
    }

}
