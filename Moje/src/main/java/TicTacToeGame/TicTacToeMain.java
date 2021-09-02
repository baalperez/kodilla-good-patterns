package TicTacToeGame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeMain{

    public TicTacToeMain() {
        JFrame frame = new JFrame();
        frame.setTitle("TicTacToeGame");
        JLayeredPane layeredPane = frame.getLayeredPane();
        JLabel backgroundLabel = new JLabel(new ImageIcon("Files/cover-start.png"));
        frame.add(backgroundLabel);

        Border border = BorderFactory.createLineBorder(Color.black, 2);
        JButton newGameButton = new JButton("NOWA GRA");
        newGameButton.setBackground(new Color(255, 230, 0));
        newGameButton.setBounds(285, 300, 220, 60);
        newGameButton.setBorder(border);
        newGameButton.setFont(new Font("Arial", Font.BOLD, 14));
        layeredPane.add(newGameButton, 2);

        JButton readGamebutton = new JButton("WCZYTAJ GRÊ");
        readGamebutton.setBackground(new Color(255, 200, 0));
        readGamebutton.setBounds(285, 360, 220, 60);
        readGamebutton.setBorder(border);
        readGamebutton.setFont(new Font("Arial", Font.BOLD, 14));
        layeredPane.add(readGamebutton, 3);

        JButton rankingButton = new JButton("RANKING");
        rankingButton.setBackground(new Color(255, 170, 0));
        rankingButton.setBounds(285, 420, 220, 60);
        rankingButton.setBorder(border);
        rankingButton.setFont(new Font("Arial", Font.BOLD, 14));
        layeredPane.add(rankingButton, 4);

        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layeredPane.remove(newGameButton);
                layeredPane.remove(readGamebutton);
                layeredPane.remove(rankingButton);
                frame.remove(backgroundLabel);
                JLabel label = new JLabel(new ImageIcon("Files/game.jpg"));
                label.setBounds(0, -15, 800, 580);
                frame.add(label);
                layeredPane.repaint();
                Gamee game = new Gamee();
                layeredPane.add(game.makeButtonsPanel());
                layeredPane.add(game.makeResultsLabel());
            }
        });



        rankingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ranking ranking = new Ranking();
                ranking.showRanking();
            }
        });

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        TicTacToeMain frame = new TicTacToeMain();

    }
}
