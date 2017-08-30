package lacofor;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class doWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i=1, soma=0, x;
        
        while(i<=10){
            System.out.println("Digite o item "+i);
            x = console.nextInt();
            
            if(x<0){
                System.err.println("Número invalido");
                break;
            }
            soma = soma+x;
            i++;
        }
        System.out.println("Total: "+soma);
    }
    
}
