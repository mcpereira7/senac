package listaaula6;

import java.util.Scanner;

/**
 * Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado
 * o número referente ao dia. Considere que domingo é o dia 1 e sábado é o dia 7. 
 * @author Marcelo Pereira
 */
public class diaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite Um núemro equivalente para o dia da Semana \n"
                + "sendo 1 - para Domingo e 7 - para Sábado!");
        String numDia = entrada.nextLine(); //poderia ter usado int
        String diaSeman = null;
        /*
         * Mas queria usr / testar o matches e ví aqui uma oportunidade
         * poderia ter feito if(numDia>=1 && numDia<=7) para validar o digitado pelo usuário
        */
        if (numDia.matches("[1-7]")){
            switch(numDia){
                case "1":
                    diaSeman="Domingo";
                    break;
                    case "2":
                    diaSeman="Segunda";
                    break;
                    case "3":
                    diaSeman="Terça";
                    break;
                    case "4":
                    diaSeman="Quarta";
                    break;
                    case "5":
                    diaSeman="Quinta";
                    break;
                    case "6":
                    diaSeman="Sexta";
                    break;
                    case "7":
                    diaSeman="Sábado";
                    break;
            }
            if(numDia.equals("1") || numDia.equals("7")){
                System.out.println(diaSeman+" é fim de semana!");
            }else{
                System.out.println(diaSeman+" é dia útil!");
            }
            
        }else{
            System.out.println("Dia da semana inválido!");
        }
        
    }
    
}
