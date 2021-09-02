package Examples;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Locale;

public class Example {

    public static void main(String[] args) {

        BigDecimal decimal = new BigDecimal("11111111111111111111111111111");
        decimal = decimal.add(new BigDecimal("22222222222222222222222222222"));
        System.out.println(decimal);

        int a = 3;
        double b = 10.0;
        double c = b / a;
        System.out.println(c);

        String s3 = "Info ".repeat(3);
        System.out.println(s3);

        String s4 = String.join("->", "Elo", "Felo");
        System.out.println(s4);

        char arr[] = {'P', 'O', 'L', 'A', 'N', 'D'};
        String s5 = new String(arr);
        System.out.println(s5);

        String str = "Ala ma kota, a Ola ma psa";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
        String[] strArr = str.split(" ma ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }


    }
}
