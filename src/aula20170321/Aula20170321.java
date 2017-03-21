package aula20170321;

import java.util.Scanner;


public class Aula20170321 {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        // Entrada
        System.out.print("x1: ");
        double x1 = Double.parseDouble(console.nextLine());
        System.out.print("x2: ");
        double x2 = Double.parseDouble(console.nextLine());
        System.out.print("c: ");
        double c = Double.parseDouble(console.nextLine());
        
        //Processamento
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(a*s);
        
        //Saídas
        
        System.out.println(a + "x²+"+b+"x+"+c+"=0");
        System.out.println("Viva a Matemática");
        
    }
    
}
