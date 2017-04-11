package lista1;

import java.util.Scanner;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
 * uma duração mínima de 1 hora e máxima de 24 horas. Veja abaixo alguns
 * exemplos. Não fixe esses valores no código. Você pode usá­los para TESTAR
 * seu algoritmo:
 *
 * @author Marcelo Pereira
 */
public class exec16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hi, hf, duracao;

        System.out.print("informe a hora de inicio do jogo: ");
        hi = sc.nextDouble();
        System.out.print("informe a hora de fim do jogo: ");
        hf = sc.nextDouble();

        if (hi > hf) {
            duracao = (24 - hi) + hf;
            System.out.printf("A duração do jogo foi de %.2f horas \n", duracao);
        } else if (hi == hf) {
            System.out.printf("A duração do jogo foi de 24 horas \n");
        } else {
            duracao = hf - hi;
            System.out.printf("A duração do jogo foi de %.2f horas \n", duracao);
        }
    }
}
