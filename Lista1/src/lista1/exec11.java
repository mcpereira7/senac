package lista1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a
 * mensagem "Numero negativo".
 * @author Marcelo Pereira
 */
public class exec11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número qualquer: ");
        double numero = leitor.nextDouble();
        
        if (numero<0){
            System.out.println("Número negativo!");
        }
        
    }
    
}
