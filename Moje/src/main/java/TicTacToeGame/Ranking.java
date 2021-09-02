package TicTacToeGame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ranking {

    public void showRanking() {
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Tekst");
        label1.setText("<html><u>New text</u></html>");
        label1.setBounds(10, 10, 80, 50);
        label1.setForeground(Color.BLUE);
        label1.setOpaque(true);
        label1.setBackground(Color.WHITE);
        label1.setHorizontalAlignment(JLabel.CENTER);
        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        label1.setBorder(border);
        frame.add(label1);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}
