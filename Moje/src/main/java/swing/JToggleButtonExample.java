package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButtonExample extends JFrame {
    public static void main(String[] args) {
        JToggleButtonExample frame = new JToggleButtonExample();
        JToggleButton toggleButton = new JToggleButton("Click me");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(toggleButton.isSelected());
            }
        });
        frame.add(toggleButton);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
