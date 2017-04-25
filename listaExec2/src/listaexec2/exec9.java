package listaexec2;

import java.util.Scanner;

/**
 * Escreva um programa para ler a quantidade de alunos existentes em uma turma.
 * Depois disso, o programa deve ler as notas de cada um destes alunos, calcular
 * e mostrar na tela a média aritmética destas notas. Utilize o laço WHILE
 *
 * @author Marcelo Pereira
 */
public class exec9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double qaluno, soma = 0, nota, media;
        int i = 1;
        System.out.print("Informe a quantidade de alunos: ");
        qaluno = sc.nextDouble();
        while (i <= qaluno) {
            System.out.print("Nota do " + i + "º" + " aluno: ");
            nota = sc.nextDouble();
            soma = soma + nota;
            i++;
        }
        media = soma / (i - 1);
        //System.out.println(soma+" "+ i);
        System.out.println("A média da das turma é: " + media);

    }

}
