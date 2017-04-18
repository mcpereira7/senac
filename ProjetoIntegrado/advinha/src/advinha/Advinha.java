package advinha;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Marcelo Pereira
 */
public class Advinha {

    public static void main(String[] args) {
        Random sorteio = new Random();
        Scanner console = new Scanner(System.in);
        
        int resultado = sorteio.nextInt(10)+1;
        System.out.println("Adivinhe o número sorteado");
        int num = console.nextInt();
        int i = 1;
        do {
             if(num>resultado){
                System.out.println("Tentativa "+i+"\nNão foi desta vez, tente novamente"
                        +"\nO número sorteado é menor que o digitado");
                num = console.nextInt();
                i++;
            }else if(num<resultado){
                System.out.println("Tentativa "+i+"\nNão foi desta vez, tente novamente "
                        + "\nO número sorteado é maior que o digitado");
                num = console.nextInt();
                i++;
            }
        } while(num!=resultado);
        System.out.println("Parabéns, você acertou na "+i+"ª tentativa!");
    }
    
}
