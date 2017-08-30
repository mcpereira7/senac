package calculadoraswitc;

import javax.swing.JOptionPane;

public class CalculadoraSwitc {

    public static void main(String[] args) {
       
        double calculo=0;
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite primeiro número:"));
        String operador = JOptionPane.showInputDialog(null, "Digite primeiro número:");
        
        
        switch(operador){
            case "+": calculo=n1+n2;
            break;
            case "-": calculo=n1-n2;
            break;
            case "*": calculo=n1*n2;
            break;
            case "/": calculo=n1/n2;
            break;
                            
        }
        JOptionPane.showMessageDialog(null, calculo);
    }
    
}
