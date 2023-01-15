package tourguide;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 *
 */
public class App {
    Scanner scan = new Scanner(System.in);

    Area[] areas = {
            new Area("San Pablo")
                    .spots(new TouristSpot("Sampaloc Lake"), new TouristSpot("Lake Pandin"))
                    .hotels(new Hotel("Casa San Pablo", "none", 200))
    };
    Area selectedArea;
    ArrayList<TouristSpot> destinations = new ArrayList<>();
    Hotel hotel;
    double cost;

    public void run() {
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
            print("\n");
            print(" : ");
            String input = scan.nextLine().toLowerCase();
            for (TouristSpot spot : selectedArea.spots) {
                if (spot.name.toLowerCase().equals(input)) {
                    destinations.add(spot);
                    selecting = false;
                    break;
                }
            }
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

    public static void clear() {
        System.out.print("\033[2J\033[1;1H");
    }
}
