package swing;

import javax.swing.*;
import java.awt.*;

public class ToolTipAppIconExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton b1 = new JButton("Click me");
        b1.setToolTipText("Kliknij mnie");
        Image icon = (new ImageIcon("files\\flowers.jpg")).getImage();
        frame.add(b1);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
