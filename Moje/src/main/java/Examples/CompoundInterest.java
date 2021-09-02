package Examples;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital;

        System.out.println("Wpisz kapitał początkowy");
        //startCapital = scanner.nextDouble();
        startCapital = Double.valueOf(scanner.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie (np 5 to 5%)");
        //yearlyInterest = scanner.nextDouble();
        yearlyInterest = Double.valueOf(scanner.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczędzania");
        numYears = scanner.nextInt();
        //numYears = Integer.valueOf(scanner.nextLine()).intValue();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest / 100), numYears);

        System.out.println(Math.round(finalCapital));
    }
}
