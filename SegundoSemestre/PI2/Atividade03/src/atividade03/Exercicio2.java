package atividade03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio2 {

    public static JPanel adivinhaNumero() {
        // Objeto do tipo Numero
        Numero numero = new Numero();
        numero.numerooculto();

        // Criando o Painel
        JPanel jpExec02 = new JPanel();
        JLabel jlExec01 = new JLabel("Advinha número");
        jpExec02.add(jlExec01);

        final JTextField jtnumero = new JTextField(10);
        jpExec02.add(jtnumero);

        JButton botaoExec2 = new JButton("OK");
        jpExec02.add(botaoExec2);

        ActionListener acaoBotao = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                if (numero.contador < 3) {
                    if (numero.numero == Integer.parseInt(jtnumero.getText())) {
                        JOptionPane.showMessageDialog(null, "Acertou!");

                    } else {
                        JOptionPane.showMessageDialog(null, "Tente novamente");
                        numero.contador += 1;

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi desta vez! \nO Programa será encerrado.");
                    System.exit(0);
                }
            }
        };

        botaoExec2.addActionListener(acaoBotao);

        return jpExec02;
    }

}
