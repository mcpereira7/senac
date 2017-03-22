/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *2. Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
 *expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
 *Math.pow(5, 3) . Você pode trocar esses números por variáveis.
 * @author marcelo.cpereira4
 */
public class exec2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int base, exp;
        
        System.out.println("Digite o número base:");
        base = leitor.nextInt();
        
        System.out.println("Digite o expoente");
        exp = leitor.nextInt();
        
        System.out.println("A base elevada ao expoente digitado é:" + (int)Math.pow(base, exp));
    }
    
}
