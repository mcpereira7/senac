package aula20170324;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class exec3 {
    public static void main(String[] args) {
    
    Scanner console = new Scanner(System.in);
    double peso, altura, massa;
    
        System.out.print("Informe sua altura: ");
        altura = Double.parseDouble(console.nextLine());
        
        System.out.print("Informe o seu peso: ");
        peso = Double.parseDouble(console.nextLine());
        
        massa = peso/(altura*altura);
         
        if(massa<26){
            System.out.println("Parabéns, você está no peso ideal!!!");
        }
        else if(massa>=26 && massa<30){
            System.out.println("Opa, tá na hora de fechar a boca. Bora pra academia!");
        }
        else{
            System.out.println("Vixi, melhor ir ao médico!!!");
        }
    }
}
