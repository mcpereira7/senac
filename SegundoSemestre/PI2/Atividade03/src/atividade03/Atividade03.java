package atividade03;

import javax.swing.SwingUtilities;

/**
 *
 * @author Marcelo Pereira
 */
public class Atividade03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                CriarGUI.criarFrame();
            }
        };
        SwingUtilities.invokeLater(thread);
    }
    
    
}
