package listaexec2;

/**
 * Faça um programa para imprimir os números pares entre 100 e 1, em ordem
 * decrescente, ou seja, o laço deve iniciar em 100 e encerrar em 1. Use o laço
 * FOR.
 *
 * @author Marcelo Pereira
 */
public class exec5 {
    public static void main(String[] args) {
        for(int i=100;i>0;i=i-2){
            System.out.print(i+" ");
        }
        System.out.println("");
    }

}
