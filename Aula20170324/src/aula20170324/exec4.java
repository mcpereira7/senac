package aula20170324;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class exec4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int kwh;
        double valorkwh=0.0, conta;
        
        System.out.print("Insira a quantidade de KW consumidos: ");
        kwh = Integer.parseInt(console.nextLine());
        
        if(kwh<150){
            valorkwh=0.20;
        }
        else if(kwh>=150 && kwh<500){
            valorkwh = 0.25;
        }
        else if(kwh>=500){
            valorkwh=0.30;
        }
        conta=kwh*valorkwh;
        if(conta<11.90){
            System.out.println("Você não atingiu o consumo mínimo.");
    }   else {
            System.out.printf("O valor de sua conta é: R$ %.2f \n", conta);
        }
    
}
    
}
