package atividade03;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
        frame.setMinimumSize(new Dimension(400,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Atividade 03");
        frame.setLocation(600, 100);
        
        JPanel painelInicial = new JPanel();
        painelInicial.setLayout(new BoxLayout(painelInicial, BoxLayout.Y_AXIS));
        
        JPanel btPainel = new JPanel();
        btPainel.setSize(400, 300);
        btPainel.setBorder(BorderFactory.createEtchedBorder());
        painelInicial.add(btPainel);
        
        JPanel btPainel2 = new JPanel();
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
        
        
        JButton btExec01 = new JButton("exercicio 01");
        btPainel4.add(btExec01);
        JButton btExec02 = new JButton("exercicio 02");
        btPainel4.add(btExec02);
        JButton btExec03 = new JButton("exercicio 03");
        btPainel4.add(btExec03);
        JButton btExec04 = new JButton("exercicio 04");
        btPainel4.add(btExec04);
        JButton btExec05 = new JButton("exercicio 05");
        btPainel4.add(btExec05);
        
        
        frame.getContentPane().add(painelInicial);
        frame.pack();
        frame.setVisible(true);
        
    }

    
}
