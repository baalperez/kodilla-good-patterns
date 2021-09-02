package swing;

import javax.swing.*;
import java.awt.*;

public class JSplitPaneExample extends JFrame {
    public static void main(String[] args) {
        JSplitPaneExample frame = new JSplitPaneExample();
        JPanel panel1 = new JPanel();
        String[] cars = {"Ford", "Opel"};
        panel1.add(new JComboBox<String>(cars));
        JPanel panel2 = new JPanel();
        String[] bikes = {"Honda", "Kawasaki", "Suzuki"};
        panel2.add(new JComboBox<String>(bikes));
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        frame.add(splitPane, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
