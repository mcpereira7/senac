package atividade03;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class CriarGUI {
// Criando a interface desktop
    public static void criarFrame(){
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(200,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Atividade 03");
        frame.setLocation(600, 100);
        
        final CardLayout cardLayoutATV = new CardLayout();
        
       final  JPanel painelInicial = new JPanel();
        //painelInicial.setLayout(new BoxLayout(painelInicial, BoxLayout.Y_AXIS));
        painelInicial.setLayout(cardLayoutATV);
        JPanel btPainel = new JPanel();
        btPainel.setSize(400, 300);
        btPainel.setBorder(BorderFactory.createEtchedBorder());
        btPainel.setLayout(new BoxLayout(btPainel, BoxLayout.Y_AXIS));
        painelInicial.add(btPainel);
        
        /*JPanel btPainel2 = new JPanel();
        btPainel2.setBorder(BorderFactory.createEtchedBorder());
        painelInicial.add(btPainel2);
        
        
        JPanel btPainel3 = new JPanel();
        btPainel3.setBorder(BorderFactory.createEtchedBorder());
        painelInicial.add(btPainel3);
        
        JPanel btPainel4 = new JPanel();
        painelInicial.add(btPainel4);
        
        
        JLabel lbTelaPrincipal = new JLabel("Escolha uma das opções abaixo:");
       btPainel.add(lbTelaPrincipal);
       /* 
       JTextArea textArea = new JTextArea(5,20);
        btPainel.add(textArea);
       JLabel listaExec1 = new JLabel("");
       btPainel2.add(listaExec1);
        */
        // Adicionando os paineis dos exercicios
        painelInicial.add(Exercicio1.cadastrarUsuario(), "Exec01");
        painelInicial.add(Exercicio2.adivinhaNumero(), "Exec02");
        
        // Botões dos exercicios
       final JButton btExec01 = new JButton("exercicio 01");
        btPainel.add(btExec01).setLocation(200,500);
        final JButton btExec02 = new JButton("exercicio 02");
        btPainel.add(btExec02);
        final JButton btExec03 = new JButton("exercicio 03");
        btPainel.add(btExec03);
        final JButton btExec04 = new JButton("exercicio 04");
        btPainel.add(btExec04);
       final JButton btExec05 = new JButton("exercicio 05");
        btPainel.add(btExec05);
        
        // ActionListener
        ActionListener acaoClicar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btExec01){
                    cardLayoutATV.show(painelInicial, "Exec01");
                }
                if(e.getSource()==btExec02){
                    cardLayoutATV.show(painelInicial, "Exec02");
                }
            }
        };
        
        // Adicionando o ActionListener aos Botões
        btExec01.addActionListener(acaoClicar);
        btExec02.addActionListener(acaoClicar);
        
        frame.getContentPane().add(painelInicial);
        frame.pack();
        frame.setVisible(true);
        
    }

    
}
