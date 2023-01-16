package tourguide;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 */
public class App {
    Scanner scan = new Scanner(System.in);

    // Temporary values
    Area[] areas = {
            new Area("San Pablo")
                    .spots(
                        new TouristSpot("Sampaloc Lake", "none"),
                        new TouristSpot("Lake Pandin", "none"),
                        new TouristSpot("Bato Springs", "none"),
                        new TouristSpot("Saint Paul Cathedral", "none"),
                        new TouristSpot("Forest Wood Gardens", "none")
                    )
                    .hotels(
                        new Hotel("Casa San Pablo", "none", 200),
                        new Hotel("Sulyap Gallery Cafe", "none", 200),
                        new Hotel("Ang Tahanan ni Aling Meding", "none", 200),
                        new Hotel("Sanctuario de San Pablo", "none", 200),
                        new Hotel("A & P Suites and Inn", "none", 200)
                    ),
            new Area("Baguio")
                    .spots(
                        new TouristSpot("Burnham Park", "none"),
                        new TouristSpot("Philippine Military Academy", "none"),
                        new TouristSpot("Session Road", "none"),
                        new TouristSpot("Baguio Botanical Garden", "none"),
                        new TouristSpot("Mines View Park", "none")
                    )
                    .hotels(
                        new Hotel("Azalea Residences", "none", 200),
                        new Hotel("City Center Hotel", "none", 200),
                        new Hotel("Hotel Elizabeth Baguio", "none", 200),
                        new Hotel("Chalet Baguio", "none", 200),
                        new Hotel("Paladin Hotel", "none", 200)
                    ),
            new Area("Palawan")
                    .spots(
                        new TouristSpot("Puerto Princesa Underground River", "none"),
                        new TouristSpot("Tubbataha Reef", "none"),
                        new TouristSpot("Nacpan Beach", "none"),
                        new TouristSpot("Big Lagoon", "none"),
                        new TouristSpot("Twin Lagoon", "none")
                    )
                    .hotels(
                        new Hotel("Astoria Palawan", "none", 200),
                        new Hotel("Canvas Boutique Hotel", "none", 200),
                        new Hotel("Outpost Beach Hostel", "none", 200),
                        new Hotel("Microtel", "none", 200),
                        new Hotel("Aziza Paradise Hotel", "none", 200)
                    ),
            new Area("Sta Rosa")
                    .spots(
                        new TouristSpot("Fun Farm", "none"),
                        new TouristSpot("Solenad", "none"),
                        new TouristSpot("Enchanted Kingdom", "none"),
                        new TouristSpot("Nuvali", "none"),
                        new TouristSpot("Museo de Santa Rosa", "none")
                    )
                    .hotels(
                        new Hotel("Seda Nuvali", "none", 200),
                        new Hotel("Paseo Premiere Hotel", "none", 200),
                        new Hotel("Microtel", "none", 200),
                        new Hotel("El Cielito Hotel", "none", 200),
                        new Hotel("Madie's Place Guest House", "none", 200)
                    ),
            new Area("Cebu")
                    .spots(
                        new TouristSpot("Magellan's Cross", "none"),
                        new TouristSpot("Taoist Temple", "none"),
                        new TouristSpot("Cebu Ocean Park", "none"),
                        new TouristSpot("Sirao Flower Garden", "none"),
                        new TouristSpot("Casa Gorordo Museum", "none")
                    )
                    .hotels(
                        new Hotel("Mad Monkey Cebu City", "none", 200),
                        new Hotel("Radisson Blu Cebu", "none", 200),
                        new Hotel("Marco Polo Plaza", "none", 200),
                        new Hotel("Seda Central Bloc Cebu", "none", 200),
                        new Hotel("Red Planet Hotel", "none", 200)
                    )
    };
    Area selectedArea;
    ArrayList<TouristSpot> destinations = new ArrayList<>();
    Hotel hotel;
    int lengthOfStay = 0;
    double cost;

    public void run() {
        // Decided to use the names for input instead
        // Opening screen
        while (selectedArea == null) {
            clear();
            println("Welcome to the tour guide planning program!");
            println("To begin, please select an area by typing the name of the area below\nAreas\n");
            for (Area area : areas) {
                printf("%s\n", area.name);
            }
            print("\n : ");
            String input = scan.nextLine().toLowerCase();
            for (Area area : areas) {
                if (area.name.toLowerCase().equals(input)) {
                    selectedArea = area;
                    break;
                }
            }
        }

        // Location selection
        boolean selecting = true;
        while (selecting) {
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
                printf("\t%s\n%s\n\nRates: %f/day\nWould you like to pick another hotel?\n : ", hotel.name, hotel.description, hotel.rates);
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
        printf("Lodging : %s", cost);
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
