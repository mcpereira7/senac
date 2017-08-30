package matrizes;

import java.util.Scanner;

public class exec2 {
    static Scanner sc = new Scanner (System.in);
    
    static int n;
    
    static int[][] criaMatriz(int linha, int coluna) {
        System.out.println("Criar Matriz");
        int[][] matriz = new int[linha][coluna];
        return matriz;
    }

    
    static void imprimeMatriz(int[][] matriz){
        System.out.println("");
        for(int i=0; i<matriz.length;i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println("\n ");
        }
        
    }
    
    static int[][] diagonal(int[][] m){
        System.out.println("Diagonal Principal");
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j<m[i].length; j++){
                if(i==j){
                    m[i][j]=0;
                }else if((i+j)==(n-1)){
                    m[i][j]=1;
                }else{
                    m[i][j]=2;
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println("Informe o tamanho da Matriz");
        n = sc.nextInt();
        int [][] matriz = criaMatriz(n, n);
        matriz = diagonal(matriz);
        imprimeMatriz(matriz);
    }
    
}
