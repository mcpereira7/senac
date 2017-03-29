package salarioporhora;

import java.util.Scanner;

/**
 *Escreva um algoritmo que lê o nome de um funcionário, o valor da sua hora de trabalho 
 * e a quantidade de horas que ele trabalhou. O algoritmo deve calcular o valor do salário 
 * a ser pago e mostrar a seguinte mensagem: “O funcionário Nome do Funcionário trabalhou Horas 
 * Trabalhadas horas por R$ Valor da Hora e deve receber R$ Valor do Salário“.
 * @author Marcelo Pereira
 */
public class SalarioPorHora {

    public static void main(String[] args) {
        
                Scanner leitor = new Scanner(System.in);
        
        String func;
        double sal, vlh, htb;
        
        System.out.print("Nome do Funcionário: ");
        func = leitor.nextLine();
        
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        htb = Double.parseDouble(leitor.nextLine());
        
        System.out.print("Informe o valor da hora deste funcionário: ");
        vlh = Double.parseDouble(leitor.nextLine());
        
        sal =htb*vlh ;
        System.out.printf("O funcionário %s trabalhou %.2f "
                            + " horas por R$ %.2f por hora e deve "
                            + "receber o total de R$ %.2f \n", func, htb, vlh, sal);
    }
    
}
