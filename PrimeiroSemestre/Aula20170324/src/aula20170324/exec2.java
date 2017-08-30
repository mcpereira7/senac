package aula20170324;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class exec2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int n1, n2, mod;
       
        System.out.println("Digite o N1");
        n1 = entrada.nextInt();
        
        System.out.println("Digite o N2");
        n2 = entrada.nextInt();
        mod=n1%n2;
        if(mod==0){
            System.out.printf("A divisão de %d por %d é exata \n", n1, n2);
            //System.out.println(n1/n2);
        }
    }

    
    
    
    
}
