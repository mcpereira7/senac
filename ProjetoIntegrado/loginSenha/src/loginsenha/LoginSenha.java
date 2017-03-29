package loginsenha;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Escreva um programa que pede um login e uma senha e valide a autorização de
 * acordo com a seguinte tabela: usuário | senha guilherme | 0f5 jair | 0706
 *
 * @author marcelo.cpereira4
 */
public class LoginSenha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String login = JOptionPane.showInputDialog(null, "Login");
        if (login.equals("guilherme") || login.equals("jair")) {

            String senha = JOptionPane.showInputDialog(null, "Senha");

            if (login.equals("guilherme") && senha.equals("0f5")) {
                JOptionPane.showMessageDialog(null, "Acesso Concedido");
            } else if (login.equals("jair") && senha.equals("0706")) {
                JOptionPane.showMessageDialog(null, "Acesso Concedido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado!");
        }

    }
}
