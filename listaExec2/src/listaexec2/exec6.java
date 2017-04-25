package listaexec2;

import java.util.Scanner;

/**
 * Faça um programa para ler e escrever dados de uma turma de 5 alunos. O
 * programa deve pedir dados como nome, idade e sexo. O programa deve imprimir
 * os dados do aluno mais velho. Use o laço DO-WHILE.
 *
 * @author Marcelo Pereira
 */
public class exec6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, i = 0, midade = 0;
        String nome, sexo, mnome = null, msexo = null;

        do {
            System.out.print("Nome: ");
            nome = sc.next();

            System.out.print("Sexo: ");
            sexo = sc.next(); 

            System.out.print("Idade: ");
            idade = sc.nextInt();

            if (idade > midade) {
                midade = idade;
                mnome = nome;
                msexo = sexo;
            }
            i++;

        } while (i < 5);
        System.out.println("Os dados do aluno mais velho são:");
        System.out.printf("Nome\t\t Sexo\t\t idade\t \n%s\t\t %s\t\t %d \n\n", mnome, msexo, midade);

    }

}
