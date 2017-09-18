package atividade03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio3 {

    public static JPanel MediaTresValores() {
        
        
        JPanel jpExec03 = new JPanel();
        jpExec03.setBorder(BorderFactory.createTitledBorder("Média de três valores"));
        jpExec03.setLayout(new BoxLayout(jpExec03, BoxLayout.Y_AXIS));
        
        JPanel jpTextCampos = new JPanel();
        jpExec03.add(jpTextCampos);
         JPanel jpBotoes = new JPanel();
        jpExec03.add(jpBotoes);
        
        final JTextField jtCampo01 = new JTextField(5);
        jpTextCampos.add(jtCampo01);
        final JTextField jtCampo02 = new JTextField(5);
        jpTextCampos.add(jtCampo02);
        final JTextField jtCampo03 = new JTextField(5);
        jpTextCampos.add(jtCampo03);
        
        final JButton btCalcMedia = new JButton("Média");
        jpBotoes.add(btCalcMedia);
        final JButton btVoltar= new JButton("Voltar");
        jpBotoes.add(btVoltar);
        
        // ActionListenner
         ActionListener acaoClicar;
        acaoClicar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String nome = "", endereco = "", telefone = "";

                if (e.getSource() ==btVoltar ) {
                    CriarGUI.criarFrame();
                }
                if (e.getSource() == btCalcMedia) {
                    double media = (Double.parseDouble(jtCampo01.getText())+Double.parseDouble(jtCampo02.getText())+Double.parseDouble(jtCampo03.getText()))/3;
                   JOptionPane.showMessageDialog(null,"A média dos valores digitados é: "+ media);
                                       
                }
            }

        };
        
        btCalcMedia.addActionListener(acaoClicar);
        btVoltar.addActionListener(acaoClicar);
        
        
        return jpExec03;
    }

}
