package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarExample extends JFrame {
    public static void main(String[] args) {
        JScrollBarExample frame = new JScrollBarExample();
        JScrollBar scroll1 = new JScrollBar();
        scroll1.setValue(20);
        scroll1.setMinimum(0);
        scroll1.setMaximum(100);
        scroll1.setBounds(10, 10, 100, 10);
        scroll1.setPreferredSize(new Dimension(30, 170));
        scroll1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if (e.getValueIsAdjusting()) return;
                System.out.println("scroll1 value: " + e.getValue());
            }
        });
        JScrollBar scroll2 = new JScrollBar(Adjustable.HORIZONTAL);
        scroll2.setValue(20);
        scroll2.setMinimum(0);
        scroll2.setMaximum(100);
        scroll2.setPreferredSize(new Dimension(170, 30));
        scroll2.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if (e.getValueIsAdjusting()) return;
                System.out.println("scroll2 value: " + e.getValue());
            }
        });
        frame.add(scroll1);
        frame.add(scroll2);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
