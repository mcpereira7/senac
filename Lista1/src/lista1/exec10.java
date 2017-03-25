package lista1;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por
 * ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
 * efetuadas, calcular e imprimir o total a receber no final do mês.
 * @author marcelo.cpereira4
 */
public class exec10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomev;
        double salario, vendasmes, comissao=0.15, calculo;
        
        System.out.print("Informe o nome do Funcionário: ");
        nomev = console.nextLine();
        
        System.out.print("Informe o salário fixo do vendedor: ");
        salario = Double.parseDouble(console.nextLine());
        
        System.out.print("Informe agora o total de vendas no mês: ");
        vendasmes = Double.parseDouble(console.nextLine());
        
        calculo = salario + (vendasmes*comissao);
        
        System.out.println("O salário mais a comissão do Funcionário "+nomev +" é "+ calculo);
    }
}
