package zadanie13_5;

import java.util.Scanner;

public class UserChoice {

    FlightsSearch flights = new FlightsSearch();

    public UserChoice() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println();
            System.out.println("Choose an option:");
            System.out.println("1. Search flight from (city) to (city)");
            System.out.println("2. Search all flights from (city)");
            System.out.println("3. Search all flights to (city)");
            System.out.println("4. Show all airports in the database");
            System.out.println("5. EXIT");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Write from where do you want to fly");
                    String departure = scanner.next().toUpperCase();
                    System.out.println("Write where do you want to fly");
                    String arrival = scanner.next().toUpperCase();
                    flights.flightFromTo(departure, arrival);
                    break;
                case 2:
                    System.out.println("Write from where do you want to fly");
                    departure = scanner.next().toUpperCase();
                    flights.showFlightFrom(departure);
                    break;
                case 3:
                    System.out.println("Write where do you want to fly");
                    arrival = scanner.next().toUpperCase();
                    flights.showFlightTo(arrival);
                    break;
                case 4:
                    System.out.println(flights.showAllAirports());
                    break;
                case 5:
                    shouldContinue = false;
                    break;
            }
        }
    }
}
