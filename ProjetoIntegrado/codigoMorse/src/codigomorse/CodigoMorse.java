package codigomorse;

import java.util.Scanner;

/**
 * Escreva um programa que lê um texto (uma String) e o mostra em Código Morse
 * (deixe um espaço entre um código e outro).
 *
 * @author Marcelo Pereira
 */
public class CodigoMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = ".-", B = "-...", C = "-.-.", D = "-..", E = ".", F = "..-.", G = "--.", H = "....", I = "..", J = ".---", K = "-.-", L = ".-..", M = "--", N = "-.", O = "---", P = ".--.", Q = "--.-", R = ".-.", S = "...", T = "-", U = "..-", V = "...-", W = ".--", X = "-..-", Y = "-.--", Z = "--..", digitado, posicao;

        System.out.println("Digite uma palavra:");
        digitado = sc.nextLine().toUpperCase();

        for (int i = 0; i < digitado.length(); i++) {
            posicao = digitado.substring(i, i + 1);

            switch (posicao) {
                case "A":
                    System.out.print(A + " ");
                    break;
                case "B":
                    System.out.print(B + " ");
                    break;
                case "C":
                    System.out.print(C + " ");
                    break;
                case "D":
                    System.out.print(D + " ");
                    break;
                case "E":
                    System.out.print(E + " ");
                    break;
                case "F":
                    System.out.print(F + " ");
                    break;
                case "G":
                    System.out.print(G + " ");
                    break;
                case "H":
                    System.out.print(H + " ");
                    break;
                case "I":
                    System.out.print(I + " ");
                    break;
                case "J":
                    System.out.print(J + " ");
                    break;
                case "K":
                    System.out.print(K + " ");
                    break;
                case "L":
                    System.out.print(L + " ");
                    break;
                case "M":
                    System.out.print(M + " ");
                    break;
                case "N":
                    System.out.print(N + " ");
                    break;
                case "O":
                    System.out.print(O + " ");
                    break;
                case "P":
                    System.out.print(P + " ");
                    break;
                case "Q":
                    System.out.print(Q + " ");
                    break;
                case "R":
                    System.out.print(R + " ");
                    break;
                case "S":
                    System.out.print(S + " ");
                    break;
                case "T":
                    System.out.print(T + " ");
                    break;
                case "U":
                    System.out.print(U + " ");
                    break;
                case "V":
                    System.out.print(V + " ");
                    break;
                case "W":
                    System.out.print(W + " ");
                    break;
                case "X":
                    System.out.print(X + " ");
                    break;
                case "Y":
                    System.out.print(Y + " ");
                    break;
                case "Z":
                    System.out.print(Z + " ");
                    break;
    // Poderia ter feito tudo assim, sem precisar de declarar variavel.
                case "0":
                    System.out.print("----- ");
                    break;
                case "1":
                    System.out.print("·---- ");
                    break;
                case "2":
                    System.out.print("··--- ");
                    break;
                case "3":
                    System.out.print("···-- ");
                    break;
                case "4":
                    System.out.print("····- ");
                    break;
                case "5":
                    System.out.print("····· ");
                    break;
                case "6":
                    System.out.print("-···· ");
                    break;
                case "7":
                    System.out.print("--··· ");
                    break;
                case "8":
                    System.out.print("---·· ");
                    break;
                case "9":
                    System.out.print("----· ");
                    break;
            }

        }
        System.out.println("");
    }

}
