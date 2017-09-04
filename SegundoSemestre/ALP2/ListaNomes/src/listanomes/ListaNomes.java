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
            if (!opcao.matches("[0-4]")) {
                System.err.println("Opção inválida!");
            }
        }
        return opcao;
    }

    static String[] ordenaVetor(String[] listaNomes) {
        //String nome = "";
        int contador = 0;
        boolean nulos = false;

        for (int i = 0; i < listaNomes.length; i++) {
            if (contador < listaNomes.length - 1) {
                if (listaNomes[i] == null) {
                    nulos = true;
                }
                if (nulos && (listaNomes[i + 1] != null)) {
                    listaNomes[i] = listaNomes[i + 1];
                    listaNomes[i + 1] = null;
                }
            }
            contador++;
        }
        return listaNomes;
    }

    // ATIVIDADE 1 DE ALP 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o vetor com tamanho 50
        String[] listaNomes = new String[50];
        // Variaveis diversas
        int contarNullo = 0;
        String opcao = "";
        String nome = "";

        while (!opcao.equals("0")) {
            opcao = menu();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    for (int i = 0; i < listaNomes.length; i++) {
                        if (listaNomes[i] != null) {
                            if (listaNomes[i].equalsIgnoreCase(nome)) {
                                System.err.println("Nome já cadastrado!");
                                break;
                            } else if (listaNomes[i] != null) {
                                contarNullo += 1;
                            }
                        }
                    }
                    if (contarNullo < listaNomes.length) {
                        listaNomes[contarNullo] = nome;
                        contarNullo = 0;
                    }else{
                       System.err.println("Lista de nomes completa. Impossível realizar novo cadastro");
                    }
                    // System.out.println("#########################");
                    break;
                case "2":
                    // System.out.println("#########################");
                    System.out.println("\nLista de Nomes");
                    for (int i = 0; i < listaNomes.length; i++) {
                        if (listaNomes[i] != null) {
                            System.out.println((i + 1) + " - " + listaNomes[i]);
                        }
                        if (listaNomes[i] != null) {
                            contarNullo += 1;
                        }

                    }
                    if (contarNullo == 0) {
                        System.err.println("Nenhum dado cadastrado!");
                        break;
                    }
                    contarNullo = 0;
                    break;
                case "3":
                    System.out.print("Pesquise pelo nome: ");
                    nome = sc.nextLine();
                    for (int i = 0; i < listaNomes.length; i++) {
                        if (listaNomes[i] != null) {
                            if (listaNomes[i].equalsIgnoreCase(nome)) {
                                System.out.println("Nome encontrado!");
                                System.out.println((i + 1) + " - " + listaNomes[i]);
                            }else{
                                contarNullo++;
                            }
                        }
                    }
                        if(contarNullo>0){
                                System.err.println("Nome não encontrado!");
                        }
                        
                    
                    break;
                case "4":
                    System.out.print("Digite o nome para REMOÇÃO: ");
                    nome = sc.nextLine();
                    for (int i = 0; i < listaNomes.length; i++) {
                        if (listaNomes[i] != null) {
                            if (listaNomes[i].equalsIgnoreCase(nome)) {
                                listaNomes[i] = null;
                            }else{
                                contarNullo++;
                            }
                        }
                    }
                        if(contarNullo>0){
                                System.err.println("Nome não encontrado!");
                        }
                    
                    listaNomes = ordenaVetor(listaNomes);
                    break;

            }
            System.out.println("\n#########################\n");

        }

    }
}
