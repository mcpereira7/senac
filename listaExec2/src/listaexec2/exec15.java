package listaexec2;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro N maior do que zero e calcule o
 * fatorial desse número. Fatorial de N é representado por N! e calculado da
 * seguinte maneira: N! = N * (N − 1) * (N − 2) * ... * 3 * 2 * 1
 *
 * @author Marcelo Pereira
 */
public class exec15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatorial = 1, i = 1, n;
        System.out.print("informe um número inteiro maior que 0: ");
        n = sc.nextInt();
        
        if (n>0){
            while(i<=n){
                fatorial=fatorial*i;
                i++;
            }
            System.out.println("O fatorial de "+ n +" é: "+ fatorial);
        }

    }

}