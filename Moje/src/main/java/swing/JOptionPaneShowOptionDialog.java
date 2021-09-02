package swing;

import javax.swing.*;

public class JOptionPaneShowOptionDialog {
    public static void main(String[] args) {
        String[] options = {"Save", "Load", "Compile", "Cancel"};
        int result = JOptionPane.showOptionDialog(
                null,
                "What to do with project?",
                "Project001",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        System.out.println("Wybrano: " + options[result]);
        JTextArea area = new JTextArea(8, 16);
        JTextField email = new JTextField(10);
        Object[] options2 = {
                new JLabel("E-mail"),
                email,
                "Send",
                "Cancel"
        };
        int result2 = JOptionPane.showOptionDialog(
                null,
                area,
                "Send e-mail",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[3]
        );
        System.out.println("text area: " + area.getText());
        System.out.println("email: " + email.getText());
        System.out.println("result2: " + result2);
    }
}
