
package atividade03;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Exercicio4 {
    
    public  static JPanel ListaJogos(){
        
        ArrayList<String> lista = new ArrayList();
        
        final String [] itens = new String[7];
        itens[0]="Esolha um item";
        itens[1]="Ação";
        itens[2]="Adventure";
        itens[3]="FPS";
        itens[4]="Simulação";
        itens[5]="Estratégia";
        itens[6]="RPG";
        
        final String [] finalizado = new String[3];
        finalizado[0]="";
        finalizado[1]="SIM";
        finalizado[2]="NÃO";
        
        final CardLayout card = new CardLayout();
        JPanel jpExec04 = new JPanel();
        jpExec04.setBorder(BorderFactory.createTitledBorder("Cadastrar Jogos"));
        jpExec04.setLayout(new BoxLayout(jpExec04, BoxLayout.Y_AXIS));
        //jpExec04.setLayout(card);
        JPanel jpLadoEsq = new JPanel();
        jpLadoEsq.setLayout(new BoxLayout(jpLadoEsq, BoxLayout.Y_AXIS));
        jpExec04.add(jpLadoEsq);
        JPanel jpLadoDir = new JPanel();
        jpLadoDir.setLayout(new BoxLayout(jpLadoDir, BoxLayout.Y_AXIS));
        jpExec04.add(jpLadoDir);
        
        JPanel jpCamposLE = new JPanel();
        jpLadoEsq.add(jpCamposLE);
        JPanel jpCamposLD = new JPanel();
        jpLadoDir.add(jpCamposLD);
        
        
        JLabel jlNome = new JLabel("Nome");
        jpCamposLE.add(jlNome);
        final JTextField jtNome = new JTextField(20);
        jpCamposLE.add(jtNome);
        
        JLabel jlAno = new JLabel("Ano de lançamento");
        jpCamposLE.add(jlAno);
        final JTextField jtAno = new JTextField(5);
        jpCamposLE.add(jtAno);
        
        JLabel jlTipo = new JLabel("Tipo");
        jpCamposLD.add(jlTipo);
        final JComboBox jcTipo = new JComboBox(itens);
        jpCamposLD.add(jcTipo);
        
        JLabel jlFinalizado = new JLabel("Finalizado");
        jpCamposLD.add(jlFinalizado);
        final JComboBox jcFinalizado = new JComboBox(finalizado);
        jpCamposLD.add(jcFinalizado);
        
         JLabel jlNota = new JLabel("Nota");
        jpCamposLD.add(jlNota);
        final JTextField jtNota = new JTextField(5);
        jpCamposLD.add(jtNota);
        
        JPanel jpBotoes = new JPanel();
        jpExec04.add(jpBotoes);
        
        /*JPanel jpLista = new JPanel();
        jpExec04.add(jpLista);
        
        JTable jtTabela = new JTable();*/
               
        final JButton btSalvar = new JButton("Salvar");
        jpBotoes.add(btSalvar);
        final JButton btVoltar = new JButton("Voltar");
        jpBotoes.add(btVoltar);
        final JButton btExibir = new JButton("Exibir");
        jpBotoes.add(btExibir);
        
         // ActionListenner
         ActionListener acaoClicar;
        acaoClicar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String nome = "", endereco = "", telefone = "";

                if (e.getSource() ==btVoltar ) {
                    CriarGUI.criarFrame();
                }
                if (e.getSource() == btSalvar) {
                    lista.add(jtNome.getText());
                    lista.add((String) jcTipo.getSelectedItem());
                    lista.add(jtAno.getText());
                    lista.add((String) jcFinalizado.getSelectedItem());
                    lista.add(jtNota.getText());
                    
                    jtNome.setText(null);
                    jcTipo.setSelectedItem(itens[0]);
                    jtAno.setText(null);
                    jcFinalizado.setSelectedItem(finalizado[0]);
                    jtNota.setText(null);
                    
                }
                if(e.getSource()==btExibir){
                    ImprimirLista.Imprimir(lista);
                }
            }

        };
        btSalvar.addActionListener(acaoClicar);
        btVoltar.addActionListener(acaoClicar);
        btExibir.addActionListener(acaoClicar);
        
        return jpExec04;
    }
    
}
