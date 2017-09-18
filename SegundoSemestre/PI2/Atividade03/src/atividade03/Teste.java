/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rerum
 */
public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, tipo, ano, finalizado, nota;
        //ListaJogos listaJogos = new ListaJogos();
        ArrayList<String> listaJogos = new ArrayList();

       while (!sc.nextLine().equals("sair")) {
            System.out.println("Digite o nome: ");
            nome = sc.nextLine();
            System.out.println("Digite o tipo: ");
            tipo = sc.nextLine();
            System.out.println("Digite o ano: ");
            ano = sc.nextLine();
            System.out.println("Finalizado?  ");
            finalizado = sc.nextLine();
            System.out.println("Digite a nota: ");
            nota = sc.nextLine();

            //lista.salvarLista(nome, tipo, ano, finalizado, nota);

            listaJogos.add(nome);
            listaJogos.add(tipo);
            listaJogos.add(ano);
            listaJogos.add(finalizado);
            listaJogos.add(nota);
        }
    }

}
