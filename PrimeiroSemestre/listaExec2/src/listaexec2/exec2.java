package listaexec2;
import java.util.Scanner;

/**
 * Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
 * resultado obtido. Use o laço WHILE
 * @author Marcelo Pereira
 */
public class exec2 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int num, soma=0, i=1;
        
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        
        while(i<=num){
            soma = soma+i;
            i++;
            System.out.println(soma);
            
        }
    }
    
}
