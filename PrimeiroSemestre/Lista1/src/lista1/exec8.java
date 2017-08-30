package lista1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia quatro números e imprime a média aritmética​ 
 * dos quatro números
 * @author Marcelo Pereira
 */
public class exec8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, n3, n4, calculo;
        
        System.out.println("Digite o primeiro número:");
        n1 = leitor.nextDouble();
        System.out.println("Digite o segundo número:");
        n2 = leitor.nextDouble();        
        System.out.println("Digite o terceiro número:");
        n3 = leitor.nextDouble();        
        System.out.println("Digite o quarto número:");
        n4 = leitor.nextDouble();
        
        calculo = (n1+n2+n3+n4)/4;
        
        System.out.println("A média dos números digitados é: " + calculo);
    }
    
}
