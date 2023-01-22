package com.stellaratlas8.tourguide;

public class Areas {
    static Area[] areas = {
            new Area("San Pablo")
                    .spots(
                            new TouristSpot("Sampaloc Lake", // https://web.archive.org/web/20220921214028/https://en.wikipedia.org/wiki/Lake_Sampaloc
                                    "Lake Sampaloc is a volcanic crater lake on the island of Luzon, Philippines. It is the largest of the Seven Lakes of San Pablo, Laguna. Nearly half of the lake's depth has a shallow depression at the bottom, indicating its volcanic origin."),
                            new TouristSpot("Lake Pandin and Yambo", // https://web.archive.org/web/20220607104538/https://en.wikipedia.org/wiki/Lakes_Pandin_and_Yambo
                                    "Pandin and Yambo are twin crater lakes separated by a narrow strip of land. They are part of the Seven Lakes system in San Pablo, Pandin being the most pristine."),
                            new TouristSpot("Bato Springs Resort",
                                    "An ice-cold water resort with water coming from a natural spring."),
                            new TouristSpot("Saint Paul Cathedral", // https://web.archive.org/web/20220617164803/https://en.wikipedia.org/wiki/Saint_Paul_the_First_Hermit_Cathedral
                                    "The Cathedral Parish of Saint Paul the First Hermit, also known as the San Pablo Cathedral, is the see of the Bishop of the Roman Catholic Diocese of San Pablo."),
                            new TouristSpot("Forest Wood Gardens", // https://www.agriculture.com.ph/2020/03/01/forest-wood-garden-farm-tourism-destination-with-a-culinary-twist/
                                    "The lush Forest Wood Garden at the foot of Mount San Cristobal, a dormant volcano rising 4,820 feet beside the mystical Mount Banahaw, at the southern fringes of San Pablo City in Laguna blossomed from a simple garden of colorful ornamental plants in mid-2000 into a full working farm today."))
                    .hotels(
                            new Hotel("Casa San Pablo", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Sulyap Gallery Cafe", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Ang Tahanan ni Aling Meding", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Sanctuario de San Pablo", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("A & P Suites and Inn", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200))),
            new Area("Baguio")
                    .spots(
                            new TouristSpot("Burnham Park", // https://web.archive.org/web/20220422164115/https://en.wikipedia.org/wiki/Burnham_Park_(Baguio)
                                    "Burnham Park, officially known as the Burnham Park Reservation, is a historic urban park, It was designed by eponymous American architect and Baguio city planner, Daniel Burnham."),
                            new TouristSpot("Philippine Military Academy", // https://web.archive.org/web/20221112133551/https://en.wikipedia.org/wiki/Philippine_Military_Academy
                                    "Also referred to by its acronym PMA, it serves as a national historical landmark for historic contribution and its “long and unending line of quality military education”. The campus is a popular tourist destination in Baguio."),
                            new TouristSpot("Session Road", // https://web.archive.org/web/20230105141053/https://en.wikipedia.org/wiki/Session_Road
                                    "Session Road is the main thoroughfare of Baguio in the Philippines and is the main hub of what is called the Baguio Central Business District."),
                            new TouristSpot("Baguio Botanical Garden", // https://baguiohouse.com/the-botanical-garden/
                                    "Baguio's botanical garden, like Burnham Park, is a huge piece of land that is owned by the Philippine government. It is one of those prime pieces of real estate that provides priceless peace and tranquility to a city that is in danger of becoming an urban jungle."),
                            new TouristSpot("Mines View Park", // https://web.archive.org/web/20210911041428/http://en.wikipedia.org/wiki/Mines_View_Park
                                    "Mines View Park overlooks the mining town of Itogon, particularly the abandoned gold and copper mines of the Benguet Corporation, and offers a glimpse of the Amburayan Valley."))
                    .hotels(
                            new Hotel("Azalea Residences", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("City Center Hotel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Hotel Elizabeth Baguio", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Chalet Baguio", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Paladin Hotel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200))),
            new Area("Palawan")
                    .spots(
                            new TouristSpot("Puerto Princesa Underground River", // https://web.archive.org/web/20230110070207/https://en.wikipedia.org/wiki/Puerto_Princesa_Subterranean_River_National_Park
                                    "The river winds through the cave before flowing directly into the West Philippine Sea[4] and is navigable by boat up to 4.3 kilometres (2.7 mi) from the sea. The cave includes major formations of stalactites and stalagmites, and several large chambers"),
                            new TouristSpot("Tubbataha Reef", // https://web.archive.org/web/20220925050851/https://en.wikipedia.org/wiki/Tubbataha_Reef
                                    "The marine and bird sanctuary consists of two huge atolls. A World Heritage Site and a unique example of an atoll reef with a very high density of marine species."),
                            new TouristSpot("Nacpan Beach", // https://guidetothephilippines.ph/destinations-and-attractions/nacpan-beach
                                    "Nacpan Beach is a four-kilometer strip of cream-colored sand and coconut trees with crystal clear turquoise water. It is located 17th kilometers north of El Nido town proper in Palawan. This powdery paradise was one of the secret getaways for some tourists until its beauty was discovered by many and became one of the most sought after destinations in El Nido."),
                            new TouristSpot("Big Lagoon", // https://guidetothephilippines.ph/destinations-and-attractions/big-lagoon
                                    "the crystal-clear blue water, the ray of light peeking through the top of the cliffs, and the luscious calcareous formation. The Big Lagoon of Island-hopping Tour A has become popular for its elegance as seen from drone shots to kayak views in several movies and postcards."),
                            new TouristSpot("Twin Lagoon", // https://www.visitsoutheastasia.travel/top-sights/twin-lagoon/
                                    "The karst landscape of the Philippines’ Coron Island can best be seen in the brilliantly blue lagoons on its northwestern end: framed by stark limestone walls rising vertically from the sea, the Twin Lagoons invite visitors to swim in its clear waters and take in the breathtaking view. "))
                    .hotels(
                            new Hotel("Astoria Palawan", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Canvas Boutique Hotel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Outpost Beach Hostel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Microtel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Aziza Paradise Hotel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200))),
            new Area("Sta Rosa")
                    .spots(
                            new TouristSpot("Fun Farm", // https://www.staelena.com/fun-farm.php
                                    "The Fun Farm at Sta. Elena is an outdoor playground where both kids and grown-ups have access to animals and the natural world."),
                            new TouristSpot("Sta. Rosa De Lima Parish Church", // https://www.facebook.com/sta.rosadelimaparish/about/
                                    "Sta. Rosa de Lima Parish is a Roman Catholic Church located at San Buenaventura Drive, Bagong Ilog, Pasig City, Philippines."),
                            new TouristSpot("Enchanted Kingdom", // https://www.enchantedkingdom.ph/about-ek-affiliations/
                                    "Enchanted Kingdom boasts of rides and attractions unique to the country in size and magnitude. These rides and attractions are located within seven meticulously themed zones interspersed with food and merchandise outlets and kiosks as well as various game stands that add to the “enchanting experience”, away from the day-to-day realities of life."),
                            new TouristSpot("Nuvali", // https://www.nuvali.ph/about-us/
                                    "Nuvali offers nature amenities such as its 35-kilometer mountain bike trail, a multi-functional lake, hiking paths, a wildlife and bird sanctuary, and Camp N teambuilding and camping grounds."),
                            new TouristSpot("Museo de Santa Rosa", // https://www.vigattintourism.com/index.php?/tourism/articles/Museo-de-Santa-Rosa
                                    "Museo de Santa Rosa provide a proper home for the important materials and artworks that are of cultural and historical significance to Santa Rosa."))
                    .hotels(
                            new Hotel("Seda Nuvali", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Paseo Premiere Hotel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Microtel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("El Cielito Hotel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Madie's Place Guest House", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200))),
            new Area("Cebu")
                    .spots(
                            new TouristSpot("Magellan's Cross", // https://www.hawaii.edu/cps/magellancross.html
                                    "The cross signifies the event of propagation of the Roman Catholic faith in what is now Cebu, in central Philippines."),
                            new TouristSpot("Taoist Temple", // https://www.cebucitytour.com/cebu-destinations/cebu-taoist-temple/
                                    "The Taoist Temple is the center of worship for Taoism. Along with a spacious balcony that has an access to the scenic of the city, The temple includes a chapel, library, souvenir shop, and a wishing well."),
                            new TouristSpot("Cebu Ocean Park", // https://www.cebuoceanpark.com/
                                    "The Largest Oceanarium in the Philippines"),
                            new TouristSpot("Sirao Flower Garden", // https://cebuinsights.com/explore-cebu/gardens/sirao-flower-garden-cebu/
                                    "The quiet village of Sirao is a flower farm hotspot. Two of the biggest flower gardens in Cebu City call this quiet mountain town home."),
                            new TouristSpot("Casa Gorordo Museum", // https://casagorordomuseum.org/
                                    "Casa Gorordo is a house museum located in the historic Parian area of Cebu, the oldest city in the Philippines."))
                    .hotels(
                            new Hotel("Mad Monkey Cebu City", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Radisson Blu Cebu", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Marco Polo Plaza", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Seda Central Bloc Cebu", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)),
                            new Hotel("Red Planet Hotel", "none",
                                    new Hotel.Suite("Small", "The cheapest suite", 200)))
    };
}