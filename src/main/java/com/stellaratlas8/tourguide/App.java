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
    Hotel hotel;
    Hotel.Offer offer;
    int lengthOfStay;
    ArrayList<TouristSpot> destinations = new ArrayList<>();
    double cost = 0;

    public void run() {
        // Decided to use the names for input instead
        String reset;
        do {
            // Opening screen
            welcomeScreen();

            // Area select
            promptArea();
            promptPreview();

            // Lodging
            promptLodging();
            promptPreview();

            // Location selection
            promptDestinations();
            promptPreview();

            // End
            printState();

            println("Would you like to go back to the start of the program?");
            print("Yes, No : ");
            reset = scan.nextLine().toLowerCase();
        } while (reset.equals("yes"));
        println("Program Ended");
    }

    public void welcomeScreen() {
        clear();
        println("########################################");
        println("Welcome to the tour planning program!");
        println("----------------------------------------");
        println("Instructions");
        println("\tType the options in the input area and press enter");
        println("\tYou can choose to preview the trip after every entry");
        println("\tThe prompt will repeat if the input is invalid!");
        println("\tYou can type anything or just press enter for 'No'");
        println("\tRead Carefully!");
        println("########################################");
        print("Press enter to continue... ");
        scan.nextLine();
    }

    public void promptArea() {
        while (selectedArea == null) {
            clear();
            println("########################################");
            println("To begin, please select an area by typing the name of the area below, the names can be in lowercase");
            println("----------------------------------------");
            println("Areas");
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
            // The loop will reset if input was not valid
        }
    }

    public void promptLodging() {
        while (hotel == null) {
            clear();
            println("########################################");
            println("These are the hotels in the area. Select one to show information about them");
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
            if (hotel == null) // Resets loop if input was not valid
                continue;

            // Offer selection
            while (offer == null) {
                clear();
                println("########################################");
                printf("\t%s\n%s\n", hotel.name, hotel.description);
                println("----------------------------------------");
                if (hotel.offers.length != 0) {
                    println("These are the available offerQs for the selected hotel.\n");
                    for (Hotel.Offer offers : hotel.offers) {
                        printf("\t%s\tRates :\t%.2f/day\n%s\n", offers.name, offers.rates, offers.description);
                    }
                } else {
                    println("There are no offers available for this hotel at this time!");
                }
                println("########################################");

                if (hotel.offers.length == 0) {
                    println("The program will now return to the hotel selection menu.\n");
                    print("Press enter to proceed... ");
                    scan.nextLine();
                    hotel = null;
                    break;
                }

                println("Would you like to pick another hotel?\n");
                print("Yes, No : ");
                input = scan.nextLine().toLowerCase();
                if (input.equals("yes")) {
                    hotel = null;
                    break;
                }

                clear();
                println("########################################");
                println("Please select an offer below");
                println("----------------------------------------");
                for (Hotel.Offer offer : hotel.offers) {
                    /*
                     * Name Rates : P00.00
                     * Description Lorem ipsum dolor sit amet
                     */
                    printf("\t%s\tRates :\tP%.2f/day\n%s\n", offer.name, offer.rates, offer.description);
                }
                println("########################################");
                print("\n : ");
                input = scan.nextLine().toLowerCase();
                for (Hotel.Offer offer : hotel.offers) {
                    if (offer.name.toLowerCase().equals(input)) {
                        this.offer = offer;
                        break;
                    }
                }
            }
        }

        while (lengthOfStay == 0 && offer != null) {
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
            cost += lengthOfStay * offer.rates;
        }
    }

    public void promptDestinations() {
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
                println("Would you like to go to another location?.\n");
                print("Yes, No :");
                input = scan.nextLine().toLowerCase();
                if (input.equals("yes")) {
                    selecting = true;
                }
            }
        }
    }

    public void promptPreview() {
        println("----------------------------------------");
        println("Would you like to view an overview of the trip?");
        print("Yes, No : ");
        String input = scan.nextLine().toLowerCase();
        if (input.equals("yes")) {
            printState();
        }
        println("########################################");
        print("Press enter to proceed... ");
        scan.nextLine();
    }

    public void printState() {
        clear();
        println("########################################");
        printf("Traveling in %s\n", selectedArea.name);
        if (!destinations.isEmpty()) {
            print("\nTrips");
            for (TouristSpot touristSpot : destinations) {
                printf("\n\t%s", touristSpot.name);
            }
        }

        if (hotel != null) {
            printf("\nLodging :\t%s from %s\n", offer.name, hotel.name);
        }
        if (cost > 0) {
            println("----------------------------------------");
            println("The costs for this trip will be");
            if (offer != null)
                printf("Lodging :\tP%.2f\n", offer.rates * lengthOfStay);
            printf("Total :\tP%.2f", cost);
        }
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

    /**
     * Clears screen and sets cursor to beginning of the window
     */
    public static void clear() {
        System.out.print("\033[2J\033[1;1H");
    }
}
