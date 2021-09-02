package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogExample extends JFrame {
    public static void main(String[] args) {
        JDialogExample frame = new JDialogExample();
        JDialog dialog = new JDialog(frame, "Dialog frame", true);
        dialog.setLayout(new FlowLayout());
        JButton button = new JButton("Close dialog");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
        dialog.add(button);
        dialog.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        dialog.setVisible(true);
    }
}
