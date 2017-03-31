package lista1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um
 * quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
 * @author Marcelo Pereira
 */
public class exec12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o lado de um quadrado: ");
        double lado = leitor.nextDouble();
        
        System.out.print("Informe o raio de um circulo: ");
        double raio = leitor.nextDouble();
        
        double areac = Math.PI*(raio*raio);
        double areaq = lado*lado;
        
        if (areac>areaq){
            System.out.println("A área do circulo é maior");
        }
        else {
            System.out.println("A área do quadrado é maior");
        }
    }
    
}
