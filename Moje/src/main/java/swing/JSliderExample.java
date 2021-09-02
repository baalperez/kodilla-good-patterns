package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderExample extends JFrame {
    public static void main(String[] args) {
        JSliderExample frame = new JSliderExample();
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 15);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Slider: " + slider.getValue());
            }
        });
        frame.add(slider);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
