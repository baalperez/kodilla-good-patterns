package swing;

import javax.swing.*;

public class JOptionPaneShowConfirmDialog {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(
                null,             // okno
                "Czy zapisać dane?",    // tekst
                "Dane zmodyfikowane",      // tytuł
                JOptionPane.YES_NO_CANCEL_OPTION   // rodzaj opcji
        );
        String str = "";
        switch (result) {
            case JOptionPane.YES_OPTION:
                str = "YES";
                break;
            case JOptionPane.NO_OPTION:
                str = "NO";
                break;
            case JOptionPane.CANCEL_OPTION:
                str = "CANCEL";
                break;
        }
        System.out.println("Wybrana opcja: " + str);
    }
}
