package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = "1", p2 = "2", p3 = "3", p4 = "4", p5 = "5", p6 = "6", p7 = "7", p8 = "8", p9 = "9";
        int i = 0;
        boolean fimdejogo = false;

        System.out.println("__|__|__");
        System.out.println("__|__|__");
        System.out.println("  |  |  ");
        System.out.println(""); // apenas para pular uma linha

        System.out.println("De quem é a vez? \n'X ou O'");
        String jogador = sc.nextLine().toUpperCase();
        System.out.println("Qual a posição? \n'Valor de 1 a 9'");
        int posicao = sc.nextInt();

        if (!jogador.equals("X") || !jogador.equals("O") && posicao < 1 || posicao > 9) {
            while (!jogador.equals("X") || !jogador.equals("O") && posicao < 1 || posicao > 9) {
                System.out.println("\nErrou!!!\nEscreva X ou O: ");
                jogador = sc.next().toUpperCase();
                System.out.println("\nPosição de 1 a 9:");
                posicao = sc.nextInt();
                if(jogador.equals("X")|| jogador.equals("O")|| posicao>=1 || posicao<=9){
                    break;
                }
            }
        } 
            while (!fimdejogo) {
                // adiciona valor X ou O para a posição escolhida
                switch (posicao) {
                    case 1:
                        p1 = jogador;
                        break;
                    case 2:
                        p2 = jogador;
                        break;
                    case 3:
                        p3 = jogador;
                        break;
                    case 4:
                        p4 = jogador;
                        break;
                    case 5:
                        p5 = jogador;
                        break;
                    case 6:
                        p6 = jogador;
                        break;
                    case 7:
                        p7 = jogador;
                        break;
                    case 8:
                        p8 = jogador;
                        break;
                    case 9:
                        p9 = jogador;
                        break;
                }
                // Exibe o tabuleiro com a posição preenchida

                System.out.printf(" %s | %s | %s\n", p1, p2, p3);
                System.out.println("---+---+---");
                System.out.printf(" %s | %s | %s\n", p4, p5, p6);
                System.out.print("---+---+---\n");
                System.out.printf(" %s | %s | %s\n", p7, p8, p9);

                // valida o vencedor
                boolean vencedor = p1.equals(p2) && p2.equals(p3) || p4.equals(p5) && p5.equals(p6)
                        || p7.equals(p8) && p8.equals(p9) || p1.equals(p4) && p4.equals(p7)
                        || p2.equals(p5) && p5.equals(p8) || p3.equals(p6) && p6.equals(p9)
                        || p1.equals(p5) && p5.equals(p9) || p3.equals(p5) && p5.equals(p7);

                if (vencedor) {
                    fimdejogo = true;
                    System.out.println("Vencedor = " + jogador);
                    break;
                }
                // Solicita a posição para o jogador
                if (jogador.equals("X")) {
                    jogador = "O";
                    System.out.println("A vez de O");
                    System.out.print("Posição: ");
                    posicao = sc.nextInt();

                } else if (jogador.equals("O")) {
                    System.out.println("A vez de X");
                    jogador = "X";
                    System.out.print("Posição: ");
                    posicao = sc.nextInt();

                }

                //i++;
            } 
            if(!fimdejogo){
                System.out.println("Deu velha!");
            }
        }

    }

