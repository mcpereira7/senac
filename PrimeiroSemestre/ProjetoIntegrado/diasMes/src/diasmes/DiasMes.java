package diasmes;

import javax.swing.JOptionPane;

public class DiasMes {

    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês \n Em sua representação númerica"));
        if (mes >= 1 && mes <= 12) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                JOptionPane.showMessageDialog(null, "Este mês contém 31 dias");
            }
            else if(mes==2){
              JOptionPane.showMessageDialog(null, "Este mês contém 28 dias"); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Este mês contém 30 dias");
            }
        }
    }

}
