package listaexec2;

/**
 * Faça um programa que calcule e imprima o resultado da soma abaixo (lembre-se
 * de que tanto as divisões quanto o resultado devem ser decimais). Utilize o
 * laço que lhe for mais conveniente. 1+(1/2)+(1/3)+(1/4)...(1/20)
 *
 * @author Marcelo Pereira
 */
public class exec10 {

    public static void main(String[] args) {
        double soma = 1;

        for (int i = 2; i < 21; i++) {
            soma = soma + (1d / i);
           // System.out.println(i);
        }

        System.out.println("S = " + soma);
    }

}
