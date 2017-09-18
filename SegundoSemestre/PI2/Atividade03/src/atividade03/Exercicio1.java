package atividade03;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio1 {

    public static JPanel cadastrarUsuario() {

        // Objeto do tipo Pessoa com nome, endereço e telefone
        Pessoa pessoa = new Pessoa();
        JPanel jpExec01 = new JPanel();
        jpExec01.setLayout(new BoxLayout(jpExec01, BoxLayout.Y_AXIS));
        JLabel jlExec01 = new JLabel("Cadastro Usuário");
        jpExec01.add(jlExec01);

        JPanel jlExec01Nome = new JPanel();
        //jlExec01Nome.setSize(400,50);
        //jlExec01Nome.setBorder(BorderFactory.createEtchedBorder());
        jpExec01.add(jlExec01Nome);
        JLabel jlnome = new JLabel("Nome");
        jlExec01Nome.add(jlnome);
        final JTextField jtNome = new JTextField(30);
        jlExec01Nome.add(jtNome);

        JPanel jlExec01Endereco = new JPanel();
        jpExec01.add(jlExec01Endereco);
        JLabel jlEndereco = new JLabel("Endereco");
        jlExec01Endereco.add(jlEndereco);
        final JTextField jtEndereco = new JTextField(29);
        jlExec01Endereco.add(jtEndereco);

        JPanel jlExec01Telefone = new JPanel();
        jpExec01.add(jlExec01Telefone);
        JLabel jlTelefone = new JLabel("Telefone");
        jlExec01Telefone.add(jlTelefone);
        final JTextField jtTelefone = new JTextField(29);
        jlExec01Telefone.add(jtTelefone);

        JPanel jpBotoes = new JPanel();
        jpExec01.add(jpBotoes);

        final JButton botaoVoltar = new JButton("Voltar");
        jpBotoes.add(botaoVoltar);
        final JButton botaoSalvar = new JButton("Salvar");
        jpBotoes.add(botaoSalvar);
        final JButton botaoExibir = new JButton("Exibir");
        jpBotoes.add(botaoExibir);

        ActionListener acaoClicar;
        acaoClicar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String nome = "", endereco = "", telefone = "";

                if (e.getSource() == botaoVoltar) {
                    CriarGUI.criarFrame();
                }
                if (e.getSource() == botaoSalvar) {

                    pessoa.salvarDados(jtNome.getText(), jtEndereco.getText(), jtTelefone.getText());
                    //System.out.println(nome); 
                    jtNome.setText(null);
                    jtEndereco.setText(null);
                    jtTelefone.setText(null);

                }
                if (e.getSource() == botaoExibir) {
                    JOptionPane.showMessageDialog(null, "Nome: " + pessoa.nome + "\nEndereço: " + pessoa.endereco + "\nTelefone :" + pessoa.telefone);
                }
            }

        };
        botaoVoltar.addActionListener(acaoClicar);
        botaoExibir.addActionListener(acaoClicar);
        botaoSalvar.addActionListener(acaoClicar);

        return jpExec01;
    }

}
