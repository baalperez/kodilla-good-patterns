package swing;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerMouseMotionListenerExample extends JFrame implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
        System.out.println("Click count " + e.getClickCount());
        System.out.println("Screen x: " + e.getXOnScreen());
        System.out.println("Screen y: " + e.getYOnScreen());
        String str = "Button clicked: ";
        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                str += " button 1";
                break;
            case MouseEvent.BUTTON2:
                str += " button 2";
                break;
            case MouseEvent.BUTTON3:
                str += " button 3";
                break;
        }
        System.out.println(str);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse passed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }

    public static void main(String[] args) {
        MouseListenerMouseMotionListenerExample frame = new MouseListenerMouseMotionListenerExample();
        frame.addMouseListener(frame);
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse moved "
                    + "x: " + e.getX() + " y: " + e.getY());
            }
        });
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
