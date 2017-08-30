package listanomes;

import java.util.Scanner;

public class ListaNomes {

    static String menu() {
        Scanner sc = new Scanner(System.in);
        String opcao = " ";
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Adicionar um novo nome\n"
                + "2 - Apresentar os nomes\n"
                + "3 - Pesquisar um nome\n"
                + "4 - Remover um nome\n"
                + "0 - Sair");
        while (!opcao.matches("[0-4]")) {
            System.out.print("Opção: ");
            opcao = sc.nextLine();
        }
        return opcao;
    }

    // ATIVIDADE 1 DE ALP 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o vetor com tamanho 50
        String[] listaNomes = new String[50];
        // Variaveis diversar
        int contarNullo = 0;
        String opcao = "";

        while (!opcao.equals("0")) {
            opcao = menu();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome: ");
                    for (int i = 0; i < listaNomes.length; i++) {
                        if (listaNomes[i] != null) {
                            contarNullo += 1;
                        }
                    }
                    listaNomes[contarNullo] = sc.nextLine();
                    contarNullo=0;
                    System.out.println("#########################");
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("#########################");
                    System.out.println("\nLista de Nomes");
                    for (int i = 0; i < listaNomes.length; i++) {
                        if (listaNomes[i] != null) {
                            System.out.println((i + 1) + " - " + listaNomes[i]);
                        }
                    }
                    System.out.println("#########################");
                    break;
            }

        }
    }

}
