/*
 * Escreva um algoritmo para calcular a média
 * aritmética de 3 notas e apresentar o resultado
 */
package listaexercicios1;

import java.util.Scanner;

/**
 *
 * @author Marcelo Pereira
 */
public class Exec2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        
        System.out.println("Digite a Nota 1: ");
        nota1 = leia.nextFloat();
        
        System.out.println("Digite a Nota 2: ");
        nota2 = leia.nextFloat();
        
        System.out.println("Digite a Nota 3: ");
        nota3 = leia.nextFloat();
        
        media = (nota1+nota2+nota3)/3;
        
        System.out.println("A média é: "+ media);
    }
    
}
