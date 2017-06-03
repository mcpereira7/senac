/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author marcelo.cpereira4
 */
public class f1 {

    static Scanner sc = new Scanner(System.in);

    static int tamanho() {
        int t;
        System.out.println("Tamanho");
        System.out.println("Linha / Coluna: ");
        t = sc.nextInt();
        return t;
    }

    static int[][] criaMatriz(int linha, int coluna) {
        System.out.println("Criar Matriz");
        int[][] matriz = new int[linha][coluna];
        return matriz;
    }

    static int[][] populaMatriz(int[][] matriz) {
        System.out.println("Popupa Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: ",i,j);
                matriz[i][j] = sc.nextInt();
            
        }
        }
        return matriz;
    }
    static void imprimeMatriz(int[][] matriz){
        for(int i=0; i<matriz.length;i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: %d\t", i,j,matriz[i][j]);
            }
            System.out.println("\n ");
        }
        
    }
    
    public static void main(String[] args) {
        int linhas = tamanho();
        int colunas = tamanho();
        int [][] matriz = criaMatriz(linhas, colunas);
        matriz = populaMatriz(matriz);
        imprimeMatriz(matriz);
    }
}
