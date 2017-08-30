package mediaaluno;

import javax.swing.JOptionPane;

public class MediaAluno {

    public static void main(String[] args) {
        
        String p1 = JOptionPane.showInputDialog(null,"Informe P1");
        String p2 = JOptionPane.showInputDialog(null,"Informe P2");
        double media = (Double.parseDouble(p1)+
                       Double.parseDouble(p2))/2;
        if(media<6){
            JOptionPane.showMessageDialog(null, "Sua média está abaixo do mínimo, faça P3");
            String p3 = JOptionPane.showInputDialog(null,"Informe P3");
            
            if (Integer.parseInt(p1)> Integer.parseInt(p2)){
                media = (Double.parseDouble(p1)+Double.parseDouble(p3))/2;
            }else {
                media = (Double.parseDouble(p3)+Double.parseDouble(p2))/2;
                
            }
            boolean aprovado = media >=6;
            if (aprovado){
                JOptionPane.showMessageDialog(null, "Aluno aprovado! Média: " + "6");
            }
            else{
                JOptionPane.showMessageDialog(null, "Aluno reprovado! Média: " + media);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Parabéns Aluno aprovado! Média: " + media);
        }
        
    }
    
}
