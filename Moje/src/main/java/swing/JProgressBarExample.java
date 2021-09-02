package swing;

import javax.swing.*;
import java.awt.*;

public class JProgressBarExample extends JFrame {
    public static void main(String[] args) {
        JProgressBarExample frame = new JProgressBarExample();
        JProgressBar progresBar = new JProgressBar();
        progresBar.setMaximum(0);
        progresBar.setMaximum(200);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 200; i+=20) {
                        Thread.sleep(200);
                        progresBar.setValue(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        frame.add(progresBar);
        t.start();
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
