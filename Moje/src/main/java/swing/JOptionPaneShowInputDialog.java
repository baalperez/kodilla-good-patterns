package swing;

import javax.swing.*;

public class JOptionPaneShowInputDialog {
    public static void main(String[] args) {
/*        String result = JOptionPane.showInputDialog(
                null,
                "Wpisz swoje imię:"
        );
        System.out.println(result);
*/
        String[] cars = {"Ford", "Mercedes", "Peugeot", "Dodge"};
        String result2 = (String) JOptionPane.showInputDialog(
                null,
                null,
                "Wybierz samochód",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cars,
                cars[0]
        );
        System.out.println("Wybrane auto: " + result2);
    }
}
