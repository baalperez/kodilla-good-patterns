package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorExample {

    private JLabel screen;

    public CalculatorExample() {
        JFrame frame = new JFrame();
        screen = new JLabel("0", JLabel.RIGHT);
        screen.setFont(new Font("Arial", Font.BOLD, 16));

        frame.add(screen, BorderLayout.NORTH);

        frame.add(makeButtonsPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    private JPanel makeButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
        };
        for (int i = 0; i < buttons.length; i++) {
            panel.add(addButton(buttons[i]));
        }
        return panel;
    }

    private JButton addButton(String name) {
        JButton b = new JButton(name);
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.addActionListener(calcListener);
        return b;
    }

    private ActionListener calcListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String v = ((JButton)e.getSource()).getText();
            System.out.println(v);
        }
    };

    public static void main(String[] args) {
        CalculatorExample calculatorExample = new CalculatorExample();
    }
}
