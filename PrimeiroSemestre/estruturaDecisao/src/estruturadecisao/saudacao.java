package estruturadecisao;

import java.util.Scanner;

/**
 * Escreva um programa que lê o nome de uma pessoa e mostra a seguinte 
 * mensagem: "Olá, nome da pessoa!". Se a pessoa não entrar com um nome, 
 * o programa deve mostrar: "Olá, mundo!".
 * @author Marcelo Pereira
 */
public class saudacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        
        if(nome.isEmpty()){
            System.out.println("Olá, Mundo!");
        }
        else{
            System.out.println("Olá, "+nome);
        }
    }
    
}
