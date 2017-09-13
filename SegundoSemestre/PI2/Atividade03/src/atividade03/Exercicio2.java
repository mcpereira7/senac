package atividade03;

import java.awt.AWTEventMulticaster;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio2 {

    public static JPanel adivinhaNumero() {
        int numero = 5, cont = 1;
        JPanel jpExec02 = new JPanel();
        //   jpExec02.setLayout(new BoxLayout(jpExec02, BoxLayout.Y_AXIS));
        JLabel jlExec01 = new JLabel("Advinha número");
        jpExec02.add(jlExec01);

        JLabel jlExec2 = new JLabel();

        final JTextField jtnumero = new JTextField(10);
        jpExec02.add(jtnumero);

        JButton botaoExec2 = new JButton("OK");
        jpExec02.add(botaoExec2);

        ActionListener acaoBotao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = 5, cont = 1;
                /*  if (numero == Integer.parseInt(jtnumero.getText())) {
                    JOptionPane.showMessageDialog(null, "Acertou!");

                } */

            }
        };
        
        botaoExec2.addActionListener(acaoBotao);

        return jpExec02;
    }
    
}
