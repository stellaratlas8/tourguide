package com.stellaratlas8.tourguide;

public class Areas {
    static Area[] areas = {
            new Area("San Pablo")
                    .spots(
                            new TouristSpot("Sampaloc Lake", "none"),
                            new TouristSpot("Lake Pandin", "none"),
                            new TouristSpot("Bato Springs", "none"),
                            new TouristSpot("Saint Paul Cathedral", "none"),
                            new TouristSpot("Forest Wood Gardens", "none"))
                    .hotels(
                            new Hotel("Casa San Pablo", "none", 200),
                            new Hotel("Sulyap Gallery Cafe", "none", 200),
                            new Hotel("Ang Tahanan ni Aling Meding", "none", 200),
                            new Hotel("Sanctuario de San Pablo", "none", 200),
                            new Hotel("A & P Suites and Inn", "none", 200)),
            new Area("Baguio")
                    .spots(
                            new TouristSpot("Burnham Park", "none"),
                            new TouristSpot("Philippine Military Academy", "none"),
                            new TouristSpot("Session Road", "none"),
                            new TouristSpot("Baguio Botanical Garden", "none"),
                            new TouristSpot("Mines View Park", "none"))
                    .hotels(
                            new Hotel("Azalea Residences", "none", 200),
                            new Hotel("City Center Hotel", "none", 200),
                            new Hotel("Hotel Elizabeth Baguio", "none", 200),
                            new Hotel("Chalet Baguio", "none", 200),
                            new Hotel("Paladin Hotel", "none", 200)),
            new Area("Palawan")
                    .spots(
                            new TouristSpot("Puerto Princesa Underground River", "none"),
                            new TouristSpot("Tubbataha Reef", "none"),
                            new TouristSpot("Nacpan Beach", "none"),
                            new TouristSpot("Big Lagoon", "none"),
                            new TouristSpot("Twin Lagoon", "none"))
                    .hotels(
                            new Hotel("Astoria Palawan", "none", 200),
                            new Hotel("Canvas Boutique Hotel", "none", 200),
                            new Hotel("Outpost Beach Hostel", "none", 200),
                            new Hotel("Microtel", "none", 200),
                            new Hotel("Aziza Paradise Hotel", "none", 200)),
            new Area("Sta Rosa")
                    .spots(
                            new TouristSpot("Fun Farm", "none"),
                            new TouristSpot("Solenad", "none"),
                            new TouristSpot("Enchanted Kingdom", "none"),
                            new TouristSpot("Nuvali", "none"),
                            new TouristSpot("Museo de Santa Rosa", "none"))
                    .hotels(
                            new Hotel("Seda Nuvali", "none", 200),
                            new Hotel("Paseo Premiere Hotel", "none", 200),
                            new Hotel("Microtel", "none", 200),
                            new Hotel("El Cielito Hotel", "none", 200),
                            new Hotel("Madie's Place Guest House", "none", 200)),
            new Area("Cebu")
                    .spots(
                            new TouristSpot("Magellan's Cross", "none"),
                            new TouristSpot("Taoist Temple", "none"),
                            new TouristSpot("Cebu Ocean Park", "none"),
                            new TouristSpot("Sirao Flower Garden", "none"),
                            new TouristSpot("Casa Gorordo Museum", "none"))
                    .hotels(
                            new Hotel("Mad Monkey Cebu City", "none", 200),
                            new Hotel("Radisson Blu Cebu", "none", 200),
                            new Hotel("Marco Polo Plaza", "none", 200),
                            new Hotel("Seda Central Bloc Cebu", "none", 200),
                            new Hotel("Red Planet Hotel", "none", 200))
    };
}