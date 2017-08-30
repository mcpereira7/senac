package switchif;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SwitchIf {

    public static void main(String[] args) {
        
        //Scanner console = new Scanner(System.in);
        String produto = JOptionPane.showInputDialog(null, "Informe o Tipo do produto \n A B C D");
        double temperatura = 0;
        boolean transporte = false;
        if (!produto.equals("A") || !produto.equals("B") || !produto.equals("C") || !produto.equals("C")) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }else{
            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a temperatura ambiente"));
        switch (produto.toUpperCase()) {
            case "A":
                if (temperatura >= 10 && temperatura <= 17) {
                    transporte = true;
                }
                break;
            case "B":
                if (temperatura >= 11 && temperatura <= 16) {
                    transporte = true;
                }
                break;
            case "C":
                if (temperatura >= 12 && temperatura <= 15) {
                    transporte = true;
                }
                break;
            case "D":
                if (temperatura >= 13 && temperatura <= 14) {
                    transporte = true;
                }
                break;
            /*default:
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                break;*/

        }
        
            if (transporte) {
                JOptionPane.showMessageDialog(null, "Produto pode ser transportado nas atuais condições.");
            } else {
                JOptionPane.showMessageDialog(null, "Produto não pode ser transportado nas atuais condições.");
            }
        } 
            
        }

    }


