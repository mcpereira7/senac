package aula20170407;

/*
    Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço
    while.
 */
public class Aula20170407 {

    public static void main(String[] args) {

        int mod, par = 2, i = 1;

        while (i <= 100) {
            mod = par % 2;
            if (mod == 0) {
                System.out.print(" " + par);

            }
            par++;
            i++;
        }
        System.out.println("");

    }

}
