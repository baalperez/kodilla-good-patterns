package swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JEditorPaneExample extends JFrame {
    public static void main(String[] args) {
        JEditorPaneExample frame = new JEditorPaneExample();
        JEditorPane editor = new JEditorPane(
                "text/html",
                "<html><h5>Title</h5><p>Lorem ipsum</p><p>Lorem ipsum</p></html>"
        );
        editor.setEditable(true);
        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insert update");
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("remove update: " + editor.getText());
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("change update");
            }
        });
        JScrollPane scrollPane = new JScrollPane(editor);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
