package listaexec2;

/**
 * Calcular e mostrar a média aritmética dos números pares compreendidos entre
 * 13 e 73. Utilize o laço que lhe for mais conveniente
 *
 * @author Marcelo Pereira
 */
public class exec8 {

    public static void main(String[] args) {
        int ini = 13, mod, soma = 0, i = 0;

        while (i < 60) {
            mod = ini % 2;
            if (mod == 0) {
                soma = soma + ini;
            }
            ini++;
            i++;
        }
        System.out.println("a Soma dos números pares entre 13 e 73 é : " +soma);
        System.out.println("A média aritmética dos números pares entre 13 e 73 é " + (soma / 60)+"\n\n");

    }

}
