package calculopi;

/**
 * Cálculo do Pi Leibniz, em 1682, desenvolveu uma série para o cálculo do \pi:
 * \frac{\pi}{4} = 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} -
 * \cdots Escreva um algoritmo que calcula um valor aproximado para \pi usando a
 * série desenvolvida por Leibniz (dica: você irá precisar calcular a série com
 * pelo menos 10000 termos).
 *
 * @author marcelo.cpereira4
 */
public class CalculoPi {

    public static void main(String[] args) {

        int numero = 1;
        double soma = 0;
        double div = 0;
        double sinal = 1;
        for (int i = 0; i < 10000000; i++) {

            div = 1.0d / numero;
            soma = soma + (sinal*div);
            numero = numero + 2;
            sinal=-sinal;

        }
        System.out.println("soma :" + soma*4);
        System.out.println("    "+Math.PI);
    }

}
