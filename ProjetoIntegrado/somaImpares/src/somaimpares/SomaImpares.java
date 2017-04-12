package somaimpares;

/**
 * Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte série:
 * soma = 1 + 3 + 5 + 7 + 9 + ...
 * @author marcelo.cpereira4
 */
public class SomaImpares {
    public static void main(String[] args) {
        int numero=1;
        int soma=0;
        for(int i=0; i<10000; i++){
            
            soma=soma+numero;
            numero=numero+2;
            
        }
        System.out.println("soma :" +soma);
    }
    
}
