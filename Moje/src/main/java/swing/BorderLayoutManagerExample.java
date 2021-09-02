package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutManagerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());    // domyślnie
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        JLabel north = new JLabel("NORTH", JLabel.CENTER);
        north.setBorder(border);
        frame.add(north, BorderLayout.NORTH);
        JLabel west = new JLabel("WEST", JLabel.CENTER);
        west.setBorder(border);
        frame.add(west, BorderLayout.WEST);
        JLabel center = new JLabel("CENTER", JLabel.CENTER);
        center.setBorder(border);
        frame.add(center, BorderLayout.CENTER);
        JLabel east = new JLabel("EAST", JLabel.CENTER);
        east.setBorder(border);
        JLabel south = new JLabel("SOUTH", JLabel.CENTER);
        south.setBorder(border);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
