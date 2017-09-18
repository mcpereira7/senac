/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ImprimirLista {
    public static void Imprimir(ArrayList lista){
        for(int i=0; i<lista.size(); i++){
            JOptionPane.showMessageDialog(null, lista.get(i));
        }
    }
    
}
