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
    int lengthOfStay = 0;
    double cost;

    public void run() {
        // Decided to use the names for input instead
        // Opening screen
        while(selectedArea == null){
            clear();
            println("Welcome to the tour guide planning program!");
            println("To begin, please select an area by typing the name of the area below\nAreas\n");
            for (Area area : Areas.areas) {
                printf("%s\n", area.name);
            }
            print("\n : ");
            String input = scan.nextLine().toLowerCase();
            for (Area area : Areas.areas) {
                if (area.name.toLowerCase().equals(input)) {
                    selectedArea = area;
                    break;
                }
            }
        }

        // Location selection
        boolean selecting = true;
        while(selecting){
            clear();
            println("These are the top destinations in the area.\n");
            for (TouristSpot spot : selectedArea.spots) {
                printf("\t%s\n\n%s\n", spot.name, spot.description);
            }
            print("\n : ");
            String input = scan.nextLine().toLowerCase();
            for (TouristSpot spot : selectedArea.spots) {
                if (spot.name.toLowerCase().equals(input)) {
                    destinations.add(spot);
                    selecting = false;
                    break;
                }
            }
        }

        while(hotel == null){
            clear();
            println("These are the hotels in the area.\n");
            for (Hotel hotel : selectedArea.hotels) {
                printf("\t%s\n\n%s\n", hotel.name, hotel.description);
            }
            print("\n : ");
            String input = scan.nextLine().toLowerCase();
            for (Hotel hotel : selectedArea.hotels) {
                if (hotel.name.toLowerCase().equals(input)) {
                    this.hotel = hotel;
                    break;
                }
            }
            if(hotel != null){
                printf("\t%s\n%s\n\nRates: %.2f/day\nWould you like to pick another hotel?\n : ", hotel.name, hotel.description, hotel.rates);
                input = scan.nextLine().toLowerCase();
                if(input.equals("yes")){
                    hotel = null;
                }
            }
        }
        
        while(lengthOfStay == 0){
            clear();
            println("For how long? (in days)\n");
            print(" : ");
            String input = scan.nextLine();
            if(!input.matches("^[0-9]*$")) continue;
            lengthOfStay = Integer.parseInt(input);
            cost += lengthOfStay * hotel.rates;
        }

        clear();
        println("The costs for this trip will be");
        printf("Lodging : %.2f\n", cost);
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
