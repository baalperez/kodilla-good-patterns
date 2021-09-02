package swing;

import javax.swing.*;

public class JOptionPaneShowMessageDialog extends JFrame {
    public static void main(String[] args) {
        JOptionPaneShowMessageDialog frame = new JOptionPaneShowMessageDialog();
/*        JOptionPane.showConfirmDialog(frame,
                "Hello World",
                "Title",
               JOptionPane.PLAIN_MESSAGE);
*/
        ImageIcon icon = new ImageIcon("files//flowers.jpg");
        JOptionPane.showMessageDialog(null,     // bez okna właściciela
                "<html><u>Hello World</u></html>",     // wiadomość
                "Title",                                  // tytuł okna dialogowego
                JOptionPane.ERROR_MESSAGE,                     // rodzaj komunikatu
                icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
    }
}
