package listaexercicios1;
import java.util.Scanner;
/**
 * **Escreva um algoritmo capaz de calcular a divisão
 * **de dois números e apresente o resultado.
 * @author Marcelo Pereira
 */
public class ListaExercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Escreva o primeiro número: ");
        num1 = leia.nextInt();
        
        System.out.println("Escreva o segundo número: ");
        num2 = leia.nextInt();
        
        System.out.println("A divisão do primeiro pelo segundo número é: "+ num1/num2);
    }
    
}
