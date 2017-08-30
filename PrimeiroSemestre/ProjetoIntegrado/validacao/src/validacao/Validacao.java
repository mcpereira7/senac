
package validacao;

import java.util.Scanner;

/**
 * Escreva um programa que lê um número entre 1 e 12 e mostra o seu dobro.
 * Valide a entrada.
 * @author marcelo.cpereira4
 */
public class Validacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;
        
        System.out.println("Insira um número entre 1 e 12");
        num = leitor.nextInt();
        
        if ((num>=1)&& (num<=12)){
            int calculo = num*2;
            System.out.println("O dobro do número digitado é: " + calculo);
        }
        else{
            System.out.println("Por favor, insira um número entre 1 e 12");
        }
    }
    
}
