package estruturadecisao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Marcelo Pereira
 */
public class war {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        
        System.out.println("informe a quantidade de exercitos atacando \n "
                + "Lembrando que o máximo é de apenas 3 exercítos");
        int execAtaque = entrada.nextInt();
        
        if ((execAtaque>3) || (execAtaque<1)){
        System.out.println("insira um valor entre 1 e 3");
    }
        else{
            int dado1 = gerador.nextInt(6);
            int dado2 = gerador.nextInt(6);
            
            
        }
    }
    
}
