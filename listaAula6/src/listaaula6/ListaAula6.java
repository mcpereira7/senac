package listaaula6;

import java.util.Scanner;

/**
 * Crie um programa que verifica se um número inteiro informado pelo usuário é
 * divisível por 3
 * @author Marcelo Pereira
 */
public class ListaAula6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        int mod = num%3;
        
        switch(mod){
            case 0:
                System.out.println(num+" é divisível por 3!");
                break;
            default:
                System.out.println(num+" não dá divisão exata por 3!");
                break;
        }
        
    }
    
}
