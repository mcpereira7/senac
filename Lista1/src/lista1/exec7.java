package lista1;

import java.util.Scanner;

/**
 * Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do
 * triângulo. Para esse caso, considere que hipotenusa = √A^2++ B^2 . Dica: nesse programa, você deve 
 * usar a função matemática Math.sqrt() . Por exemplo, a raiz de 121 ficaria Math.sqrt(121) .

 * @author Marcelo Pereira
 */
public class exec7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double a, b, calculo;
        
        System.out.println("Digite o valor do Cateto A:");
        a = Double.parseDouble(leitor.nextLine());
        
        System.out.println("Digite o valor do Cateto B");
        b = Double.parseDouble(leitor.nextLine());
        
        calculo = Math.sqrt((a*a)+(b*b));
        System.out.printf("A Hipotenusa de catetos %s e %s é %s \n", a, b, calculo);
    }
    
}
