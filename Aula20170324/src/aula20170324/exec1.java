package aula20170324;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class exec1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, sum;
        
        System.out.print("Digite um número: ");
        num = entrada.nextInt();
        
        if(num>100){
            sum = num + 150;
            System.out.printf("O número %d somado a 150 é: %d\n", num, sum);
        }
        else{
            System.out.println("O valor digitado foi: "+ num);
        }
    }
    
}
