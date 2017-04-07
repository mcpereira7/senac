package listaaula6;

import java.util.Scanner;

/**
 *
 * @author Marcelo Pereira
 */
public class quantidadeNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double valor, n100=0, n50=0, n20=0, n10=0, n2=0,m1=0;
        
        System.out.print("Digite um valor em reais: ");
        valor = entrada.nextDouble();
        
        while(valor>=100){
            valor=valor-100;
            n100=n100+1;
        }
       
                while(valor>=50){
            valor=valor-50;
            n50=n50+1;
        }
                 System.out.println("total "+n100+" "+n50);
    }
    
}
