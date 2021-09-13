package TTT;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Game {

    Position position = new Position();

    public JPanel makeButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(120, 120));
        panel.setBounds(100, 150, 250, 250);
        panel.setVisible(true);
        panel.setLayout(new GridLayout(3, 3));
        Game game = new Game();
        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            final int idx = i;
            JButton button = new JButton();
            buttons[i] = button;
            panel.add(button);
            Border border = BorderFactory.createLineBorder(Color.BLUE, 3);
            button.setBorder(border);
            button.setFont(new Font("Arial", Font.PLAIN, 100));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setText("" + position.turn);
                    ((JButton) e.getSource()).setEnabled(false);
                    game.move(idx);
                    if (!game.position.endGame()) {
                        int best = game.position.bestMove();
                        buttons[best].setText("" + game.position.turn);
                        game.move(best);
                        buttons[best].setEnabled(false);
                    }
                    if (game.position.endGame()) {
                        String message = "";
                        if (game.position.win('x')) {
                            message = "You won!";
                        } else if (game.position.win('o')) {
                            message = "Computer won!";
                        } else {
                            message = "Draw";
                        }
                        JOptionPane.showMessageDialog(null, message);
                        position.closeProgram();
                    }
                }
            });

        }
        return panel;
    }

    private void move(int idx) {
        position = position.move(idx);
    }

    public JLabel makeResultsLabel() {
        JLabel label = new JLabel("PLAYER vs COMPUTER");
        label.setForeground(Color.YELLOW);
        label.setPreferredSize(new Dimension(300, 120));
        label.setBounds(450, 150, 300, 50);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        return label;
    }
}
