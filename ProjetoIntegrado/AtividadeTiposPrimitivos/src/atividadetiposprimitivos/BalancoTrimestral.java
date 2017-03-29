/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadetiposprimitivos;

/**
 *
 * @author Marcelo Pereira
 */
public class BalancoTrimestral {
    public static void main(String[] args) {
        
        int gastosJaneiro=15000;
        int gastosFevereiro=23000;
        int gastosMarco=17000;
        int gastosTrimestre = (gastosJaneiro+gastosFevereiro+gastosMarco);
        int mediaMensal=gastosTrimestre/3;
        
        System.out.println("Os gastos do primeiro trimestre somam R$ " + gastosTrimestre);
        System.out.println("Valor da média mensal = R$ " + mediaMensal);
        
        
    }
    
}
