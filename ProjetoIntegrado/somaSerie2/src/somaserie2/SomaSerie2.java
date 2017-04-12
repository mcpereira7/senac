package somaserie2;

/**
 * Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte
 * série: soma = 1/1 + 1/3 + 1/5 + 1/7 + 1/9 + ...
 *
 * @author marcelo.cpereira4
 */
public class SomaSerie2 {

    public static void main(String[] args) {
        int numero = 1;
        double soma = 0;
        double div = 1.0d;
        for (int i = 0; i < 10000; i++) {

            div = 1.0d / numero;
            soma = soma+div;
            numero = numero + 2;

        }
        System.out.println("soma :" + soma);

    }

}
