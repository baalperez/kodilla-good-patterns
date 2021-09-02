package TicTacToeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Gamee {

    private JButton[] buttons = new JButton[10];
    private String v;
    private List<Integer> list = new ArrayList<>();
    private List<Integer> lista = new ArrayList<>();
    private JButton button;

    public JPanel makeButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(120, 120));
        panel.setBounds(100, 150, 250, 250);
        panel.setVisible(true);
        panel.setLayout(new GridLayout(3, 3));
        /*
        for (int i = 1; i < buttons.length; i++) {
            panel.add(addButton(""));
            addButton("").setName(String.valueOf(i));
        }
        */
        for (int i = 1; i < buttons.length; i++) {
            panel.add(addButtons());
        }
        return panel;
    }

    public JLabel makeResultsLabel() {
        JLabel label = new JLabel("XXX");
        label.setForeground(Color.YELLOW);
        label.setPreferredSize(new Dimension(120, 120));
        label.setBounds(450, 150, 50, 50);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        return label;
    }

    private JButton addButtons() {
        JButton jButtons = new JButton();
        jButtons.setFont(new Font("Arial", Font.BOLD, 16));
        jButtons.addActionListener(calcListener);
        return jButtons;
    }

    private JButton addButton(String name) {
        JButton b = new JButton(name);
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.addActionListener(calcListener);
        return b;
    }

    public final ActionListener calcListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            v = ((JButton) e.getSource()).getText();
            ((JButton) e.getSource()).setEnabled(false);


            ((JButton) e.getSource()).setText("X");
            ((JButton) e.getSource()).setFont(new Font("Arial", Font.BOLD, 22));

            System.out.println("Wybrano: " + v);
            list.add(Integer.parseInt(v));
            System.out.println(list);
            list.add(compMove());
            for (JButton button : buttons) {
                System.out.println(button);
            }


        }

    };

    public int compMove() {
        for (int i = 1; i < 10; i++) {
            lista.add(i);
        }
        lista.removeAll(list);
        System.out.println(lista);

        Random random = new Random();
        int a = 0;
        Iterator<Integer> iter = lista.iterator();
        while (iter.hasNext()) {

            a = lista.get(random.nextInt(lista.size()));
            iter.next();
        }
        System.out.println("Random: " + a);
        list.add(a);
        lista.clear();
        return a;
    }






/*
    private JButton[][] buttons = new JButton[3][3];
    public JPanel showBoard() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(120, 120));
        panel.setVisible(true);
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(150, 150, 250, 250);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                int finalI = i;
                int finalJ = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        buttons[finalI][finalJ].setEnabled(false);
                        buttons[finalI][finalJ].setText("X");
                        buttons[finalI][finalJ].setFont(new Font("Arial", Font.BOLD, 22));
                    }
                });
                panel.add(buttons[i][j], i, j);
            }
        }

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setEnabled(false);
                button1.setText("X");
                button1.setFont(new Font("Arial", Font.BOLD, 20));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setEnabled(false);
                button2.setText("X");
                button2.setFont(new Font("Arial", Font.BOLD, 20));
            }
        });

 */

}
