package com.stellaratlas8.tourguide;

public final class Areas {
    public static final Area[] areas = { // All hotel information is taken from their website unless specified
            new Area("San Pablo")
                    .spots(
                            new TouristSpot("Sampaloc Lake", // https://web.archive.org/web/20220921214028/https://en.wikipedia.org/wiki/Lake_Sampaloc
                                    "Lake Sampaloc is a volcanic crater lake on the island of Luzon, Philippines. It is the largest of the Seven Lakes of San Pablo, Laguna. Nearly half of the lake's depth has a shallow depression at the bottom, indicating its volcanic origin."),
                            new TouristSpot("Lake Pandin and Yambo", // https://web.archive.org/web/20220607104538/https://en.wikipedia.org/wiki/Lakes_Pandin_and_Yambo
                                    "Pandin and Yambo are twin crater lakes separated by a narrow strip of land. They are part of the Seven Lakes system in San Pablo, Pandin being the most pristine."),
                            new TouristSpot("Bato Springs Resort", // Me
                                    "An ice-cold water resort with water coming from a natural spring."),
                            new TouristSpot("Saint Paul Cathedral", // https://web.archive.org/web/20220617164803/https://en.wikipedia.org/wiki/Saint_Paul_the_First_Hermit_Cathedral
                                    "The Cathedral Parish of Saint Paul the First Hermit, also known as the San Pablo Cathedral, is the see of the Bishop of the Roman Catholic Diocese of San Pablo."),
                            new TouristSpot("Forest Wood Gardens", // https://www.agriculture.com.ph/2020/03/01/forest-wood-garden-farm-tourism-destination-with-a-culinary-twist/
                                    "The lush Forest Wood Garden at the foot of Mount San Cristobal, a dormant volcano rising 4,820 feet beside the mystical Mount Banahaw, at the southern fringes of San Pablo City in Laguna blossomed from a simple garden of colorful ornamental plants in mid-2000 into a full working farm today."))
                    .hotels(
                            new Hotel("Casa San Pablo",
                                    "A friendly and comfortable B&B within easy reach of some of San Pablo City's many attractions. We like to call ourselves a “house of stories” because we try our best to give you space to recharge your spirits through the uplifting power of stories.Unwind with us and find the perfect nook to catch up with family and friends. Extra beds are P1,100",
                                    new Hotel.Suite("Room 1", "Standard Double Room", 3900.),
                                    new Hotel.Suite("Room 2", "Family Rooms, Triple sharing", 4950.),
                                    new Hotel.Suite("Room 3", "Twin sharing room", 3900.)),
                            new Hotel("Sulyap Gallery Cafe",
                                    "Experience a sumptuous “taste of the past” with the best traditional and modern Filipino Cuisine as you explore the classical picturesque halls of multi-awarded and world-renowned Sulyap Gallery Cafe",
                                    new Hotel.Suite("Ground level", "2 rooms with Queen Bed and 1 room with Single bed",
                                            2200.),
                                    new Hotel.Suite("Ground level 2 guest",
                                            "2 rooms with Queen Bed and 1 room with Single bed (two guests)", 3200.),
                                    new Hotel.Suite("2nd level", "2 rooms both with Queen Bed", 2300.),
                                    new Hotel.Suite("2nd level 2 guest", "2 rooms both with Queen Bed (two guests)",
                                            3400.)),
                            new Hotel("Ang Tahanan ni Aling Meding", // Information taken from various sites
                                    "Look forward to a terrace, a garden, and dry cleaning/laundry services at Ang Tahanan ni Aling Meding Hotel. In addition to a bar and conference space, guests can connect to free in-room WiFi.",
                                    new Hotel.Suite("Standard", "For two adults", 4168.54)),
                            new Hotel("Sanctuario de San Pablo",
                                    "The unique architecture, landscape and interior design elements of this luxury resort and spa combined with the cozy comfort of the wooden bungalows, the welcoming landscape, the sense of freedom and safety are what makes Sanctuario de San Pablo",
                                    new Hotel.Suite("Casitas Premiere One Bedroom",
                                            "For two guests, one bedroom and one queen sized bed.", 4500.),
                                    new Hotel.Suite("Casitas Premiere Two Bedrooms",
                                            "For four guests, two bedrooms and one queen sized bed and two single beds.",
                                            9000.),
                                    new Hotel.Suite("Casitas De Luxe",
                                            "For six guests, one bedroom and a loft with one queen sized bed, 1 single bed or three single beds.",
                                            8200.)),
                            new Hotel("Auravele Grande",
                                    "Auravel Grande Hotel and Resort is situated at Maharlika Highway, Brgy. San Francisco, Calihan, San Pablo City, Laguna. This hotel and resort is also located near other places of interest in San Pablo City. Inquire for rates")),
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
                            new Hotel("Azalea Residences",
                                    "Azalea Hotels & Residences Baguio enlivens the essence of your Baguio holiday experience, matching the cool climes with multi-use hotel rooms and serviced apartments, with a wide array of amenities and well-appointed living, dining and kitchen spaces.",
                                    new Hotel.Suite("Superior Room",
                                            "Ideal for small families or couples on a short Baguio break. For two adults.",
                                            2767.86),
                                    new Hotel.Suite("Deluxe Room",
                                            "All the comforts of a grand hotel that is perfectly sized for a small family. For three adults.",
                                            3035.75)),
                            new Hotel("City Center Hotel",
                                    "The first business hotel in town, offering 40 well-equipped, comfortable and relaxing rooms for leisure and business traveler-alike. City Center Hotel is the perfect place to stay as it is situated right proximate in the business street of Baguio, Session Road.",
                                    new Hotel.Suite("Standard Double",
                                            "Convenient and comfortable standard room for corporate and leisure travelers. Ensuite with one double bed. Room can accommodate 2 guests.",
                                            2300.),
                                    new Hotel.Suite("Standard Twin",
                                            "Convenient and comfortable standard room for corporate and leisure travelers. Ensuite with two single beds. Room can accommodate 2 guests.",
                                            2300.),
                                    new Hotel.Suite("Deluxe Room",
                                            "Convenient and comfortable deluxe room for corporate and leisure travelers. Ensuite with one queen sized bed and one single bed. Room can accommodate 3 guests.",
                                            2800.),
                                    new Hotel.Suite("Family Room",
                                            "Convenient and comfortable family room for corporate and leisure travelers. Ensuite with two queen sized beds and one single bed. Room can accommodate 5 guests.",
                                            3800.)),
                            new Hotel("Hotel Elizabeth Baguio",
                                    "Situated upon the lush mountains of Baguio and within walking distance from top tourist attractions, guests of Hotel Elizabeth are in for a different kind of pampering - from a host of fine dining options, beautiful landscapes and luxury accommodations that is Mediterranean in every way.",
                                    new Hotel.Suite("Deluxe Queen",
                                            "Individually and stylishly furnished with one queen sized-bed and is equipped cable TV, telephone, in-room safe, coffee and tea making facilities and other amenities to make your stay enjoyable.",
                                            6000.),
                                    new Hotel.Suite("Deluxe Double",
                                            "Individually and stylishly furnished with one queen sized-bed and is equipped cable TV, telephone, in-room safe, coffee and tea making facilities and other amenities to make your stay enjoyable.",
                                            6000.)),
                            new Hotel("Chalet Baguio",
                                    "An exquisite boutique hotel distinctively located close to the numerous tourist attractions in Baguio City.",
                                    new Hotel.Suite("Standard Room",
                                            "Ideal for transient guests on a budget who wish to have a clean and comfortable stay. 2 single beds.",
                                            2800.),
                                    new Hotel.Suite("Superior Room",
                                            "Ideal for leisure or business travelers who wish to have a pleasant and comfortable stay. 1 king bed.",
                                            3400.),
                                    new Hotel.Suite("Deluxe Room Double",
                                            "Each of our Deluxe Double comes equipped with a queen size bed and sofa bed, LCD cable TV, air-conditioning, hot and cold shower, bathroom amenities, bathrobe, safety deposit box, telephone and free WiFi access.",
                                            3800.)),
                            new Hotel("Paladin Hotel", "",
                                    new Hotel.Suite("Economy Double Room ",
                                            "Fan-cooled room features a cable TV and private bathroom with free toiletries. 1 full bed",
                                            2366.),
                                    new Hotel.Suite("Deluxe Twin Room",
                                            "This twin room features a cable TV. 2 twin bed or one queen bed", 3126.),
                                    new Hotel.Suite("Quadruple Room",
                                            "This quadruple room has a cable TV, seating area and air conditioning. Two full beds",
                                            5036.))),
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
                                    "The karst landscape of the Philippines' Coron Island can best be seen in the brilliantly blue lagoons on its northwestern end: framed by stark limestone walls rising vertically from the sea, the Twin Lagoons invite visitors to swim in its clear waters and take in the breathtaking view. "))
                    .hotels(
                            new Hotel("Astoria Palawan",
                                    "Astoria Palawan kisses the shores of the majestic Sulu Sea and is a peaceful enclave of emerald virgin forests, grasslands, and mountain ranges.",
                                    new Hotel.Suite("Deluxe Room",
                                            "Deluxe Room is packed with everything you need to feel right at home, from its sink-into beds to the perfect-for-me-time bathtub, a sublime stay is a guarantee.",
                                            6750.)),
                            new Hotel("Canvas Boutique Hotel",
                                    "Canvas Boutique Hotel boasts of gorgeous, light-filled spaces in an unbeatable location",
                                    new Hotel.Suite("Deluxe Twin", "Two queen sized bed", 6000.),
                                    new Hotel.Suite("Deluxe King", "One king sized bed", 6000.),
                                    new Hotel.Suite("Premier Twin", "Two queen sized bed", 7000.),
                                    new Hotel.Suite("Premier King", "One king sized bed", 7000)),
                            new Hotel("Outpost Beach Hostel",
                                    "A fun and social hostel located on El Nido's sunset beach. It's all about comfort and being part of the lively vibe here! Laze out in the sun on our beach, chill in our beautiful lounge, go island hopping with us and your fellow hostel friends during the day, and join the nightly events at our fully open bar!",
                                    new Hotel.Suite("Superior 3 Bed Family Room Ensuite",
                                            "Private room with one queen size bed and one single bed located above it.",
                                            6400.02),
                                    new Hotel.Suite("Deluxe 4 Bed Mixed Dorm",
                                            "Deluxe room with air-conditioning and fan. Hot shower access. Spacious lockers located inside the room.",
                                            1360.),
                                    new Hotel.Suite("Deluxe 6 Bed Mixed Dorm",
                                            "Deluxe room with air-conditioning unit and fans. Access to hot shower and spacious lockers provided in the room.",
                                            1280.),
                                    new Hotel.Suite("Deluxe 8 Bed Mixed Dorm",
                                            "Deluxe room with air-conditioning unit and fans. Access to hot shower and spacious lockers provided in the room.",
                                            1200.),
                                    new Hotel.Suite("Deluxe 12 Bed Mixed Dorm",
                                            "Deluxe room with air-conditioning unit and fans. Access to hot shower and spacious lockers provided in the room.",
                                            1120.)),
                            new Hotel("Microtel",
                                    "Enjoy a seamless and memorable experience at Microtel by Wyndham Puerto Princesa on your next vacation or special event with the hotel's brilliantly efficient rooms, thoughtful amenities, and warm hospitality.",
                                    new Hotel.Suite("2 Queen Beds",
                                            "Two queen beds, airconditioned, non-smoking, window seat, wardrobe cabinet, desk with mirror and chairs, flat TV, safety deposit box, luggage rack, toilet & bath with amenities, wifi access",
                                            4000.),
                                    new Hotel.Suite("2 Queen Beds, Beach View",
                                            "Two queen beds, beach view, airconditioned, non-smoking, wardrobe cabinet, desk with mirror and chairs, flat TV, safety deposit box, luggage rack, personal refrigerator, toilet & bath with amenities, wifi access",
                                            4000.)),
                            new Hotel("Aziza Paradise Hotel",
                                    "Living up to its name, Aziza Paradise Hotel in Puerto Princesa, Palawan, Philippines gives a taste of a lush and carefree haven through nature-inspired interiors, excellent service, and eco-friendly practices.",
                                    new Hotel.Suite("Superior Premiere",
                                            "An extra elegant space that provides comfort best for partners and traveler couples. Flourished with a tropical ambiance, this room showers an absolute tranquility. 1 Queen Size Bed",
                                            5300.),
                                    new Hotel.Suite("Superior Twin",
                                            "Designed for travelers that requires separate space of leisure, Superior Twin provides serene accommodation while enjoying the magnificent space. 2 Single Beds",
                                            5300.),
                                    new Hotel.Suite("Deluxe Room",
                                            "Sleek-styled room by the pool with a glamorous sight of the façade defines an exquisite stay in our Deluxe Room. 1 Queen Size and 1 Single Bed",
                                            6000.),
                                    new Hotel.Suite("Family Room",
                                            "Perfectly fit for family, this non-pool view room stretches an access for solitude and seamless experience of relaxation while getting together with the family.",
                                            8500.))),
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
                            new Hotel("Seda Nuvali",
                                    "Enjoy the unique harmony of comfort, convenience, and service right next to spectacular landscapes at Seda Nuvali.",
                                    new Hotel.Suite("Deluxe Room",
                                            "Enjoy flexibility from our Best Rate. Includes breakfast and free WiFi",
                                            8000.),
                                    new Hotel.Suite("Executive Deluxe",
                                            "Enjoy flexibility from our Best Rate. Includes breakfast and free WiFi",
                                            8500.),
                                    new Hotel.Suite("Premier Room",
                                            "Enjoy flexibility from our Best Rate. Includes breakfast and free WiFi",
                                            9500.)),
                            new Hotel("Paseo Premiere Hotel",
                                    "Simple luxury , relaxing ambiance and personalized services, the Paseo Premiere Hotel provides guests with the cutting edge in design, cuisine and service.",
                                    new Hotel.Suite("Deluxe Single", "Single bed", 3125.)),
                            new Hotel("Microtel",
                                    "Have a good night's sleep and a brilliantly efficient stay in this 61-room hotel located at South Forbes Golf City, Silang, Cavite.",
                                    new Hotel.Suite("2 Queen Beds",
                                            "Two queen beds, airconditioned, non-smoking , window seat, wardrobe cabinet, desk with mirror and chairs, flat TV, luggage rack, ice bucket and pitcher set, toilet & bath with amenities, wifi access",
                                            4550.)),
                            new Hotel("El Cielito Hotel",
                                    "The hotel is strategically located along Sta. Rosa - Tagaytay Road, City of Sta. Rosa Laguna. There are 74 functionally designed rooms suited for all clientele."),
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