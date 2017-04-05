package diasmesswitch;

import javax.swing.JOptionPane;

public class DiasMesSwitch {

    public static void main(String[] args) {
        
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês \n Em sua representação númerica"));
        if (mes >= 1 && mes <= 12) {
                    switch (mes) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            JOptionPane.showMessageDialog(null, "Este mês contém 31 dias");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Este mês contém 28 dias");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Este mês contém 30 dias");
                            break;
                    }
        }
    }
    
}
