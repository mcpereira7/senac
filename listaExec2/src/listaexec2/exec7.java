package listaexec2;

/**
 * Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use
 * o laço WHILE.
 *
 * @author Marcelo Pereira
 */
public class exec7 {
    public static void main(String[] args) {
        
        int i=7;
        System.out.println("Multiplos de 7 menores que 200:");
      while(i<200){
          System.out.print(i+" ");
          i=i+7;
      }
        System.out.println("\n\n\n");
      
    }

}
