package com.stellaratlas8.tourguide;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 */
public class App {
    Scanner scan = new Scanner(System.in);

    Area selectedArea;
    ArrayList<TouristSpot> destinations = new ArrayList<>();
    Hotel hotel;
    Hotel.Suite suite;
    int lengthOfStay = 0;
    double cost;

    public void run() {
        // Decided to use the names for input instead
        // Opening screen
        while (selectedArea == null) {
            clear();
            println("########################################");
            println("Welcome to the tour guide planning program!");
            println("To begin, please select an area by typing the name of the area below");
            println("----------------------------------------");
            println("Areas\n");
            for (Area area : Areas.areas) {
                printf("\t%s\n", area.name);
            }
            println("########################################");
            print("\n : ");
            String input = scan.nextLine().toLowerCase();
            for (Area area : Areas.areas) {
                if (area.name.toLowerCase().equals(input)) {
                    selectedArea = area;
                    break;
                }
            }
        }

        // Lodging
        while (hotel == null) {
            clear();
            println("########################################");
            println("These are the hotels in the area.");
            println("----------------------------------------");
            for (Hotel hotel : selectedArea.hotels) {
                printf("\t%s\n", hotel.name);
            }
            println("########################################");
            print("\n : ");
            String input = scan.nextLine().toLowerCase();
            for (Hotel hotel : selectedArea.hotels) {
                if (hotel.name.toLowerCase().equals(input)) {
                    this.hotel = hotel;
                    break;
                }
            }
            if (hotel == null)
                continue;

            while (suite == null) {
                clear();
                println("########################################");
                printf("\t%s\n%s\n", hotel.name, hotel.description);
                println("----------------------------------------");
                println("These are the available suites for the selected hotel.\n");
                for (Hotel.Suite suite : hotel.suites) {
                    printf("\t%s\tRates :\t%.2f/day\n%s\n", suite.name, suite.rates, suite.description);
                }
                println("########################################");
                print("Would you like to pick another hotel?.\n\nYes, No : ");
                input = scan.nextLine().toLowerCase();
                if (input.equals("yes")) {
                    hotel = null;
                    break;
                }

                clear();
                println("########################################");
                println("Please select a suite below");
                println("----------------------------------------");
                for (Hotel.Suite suite : hotel.suites) {
                    printf("\t%s\tRates :\t%.2f/day\n%s\n", suite.name, suite.rates, suite.description);
                }
                println("########################################");
                print("\n : ");
                input = scan.nextLine().toLowerCase();
                for (Hotel.Suite suite : hotel.suites) {
                    if (suite.name.toLowerCase().equals(input)) {
                        this.suite = suite;
                        break;
                    }
                }
            }
        }

        while (lengthOfStay == 0) {
            clear();
            println("########################################");
            println("For how long? (in days)");
            print(" : ");
            String input = scan.nextLine();
            // Checking for undesired characters and parsing it after to avoid checking for
            // errors
            if (!input.matches("^[0-9]*$"))
                continue;
            lengthOfStay = Integer.parseInt(input);
            cost += lengthOfStay * suite.rates;
        }

        // Location selection
        boolean selecting = true;
        while (selecting) {
            clear();
            println("########################################");
            println("These are the top destinations in the area.");
            println("----------------------------------------");
            for (TouristSpot spot : selectedArea.spots) {
                if (!destinations.contains(spot))
                    printf("\t%s\n%s\n\n", spot.name, spot.description);
            }
            println("########################################");
            print("\n : ");
            String input = scan.nextLine().toLowerCase();
            for (TouristSpot spot : selectedArea.spots) {
                if (spot.name.toLowerCase().equals(input)) {
                    destinations.add(spot);
                    selecting = false;
                    break;
                }
            }
            if (selecting == false && destinations.size() < selectedArea.spots.length) {
                print("Would you like to go to another location?.\n\nYes, No : ");
                input = scan.nextLine().toLowerCase();
                if (input.equals("yes")) {
                    selecting = true;
                }
            }
        }

        clear();
        println("########################################");
        print("Trips");
        for (TouristSpot touristSpot : destinations) {
            printf("\n\t%s", touristSpot.name);
        }

        printf("\nLodging :\t%s\n", hotel.name);
        println("########################################");
        println("The costs for this trip will be");
        printf("Lodging :\tP%.2f\n", suite.rates * lengthOfStay);
    }

    public static void main(String[] args) {
        App app = new App();

        app.run();
    }

    public static void print(String str) {
        System.out.print(str);
    }

    public static void printf(String str, Object... arg) {
        System.out.printf(str, arg);
    }

    public static void println(String str) {
        System.out.println(str);
    }

    public static void clear() {
        System.out.print("\033[2J\033[1;1H");
    }
}
