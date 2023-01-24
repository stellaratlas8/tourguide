package com.stellaratlas8.tourguide;

public class Hotel {
    String name, description;
    Offers[] offers;

    public Hotel(String name, String description, Offers... offers) {
        this.name = name;
        this.description = description;
        this.offers = offers;
    }

    static public class Offers {
        String name, description;
        double rates;

        public Offers(String name, String description, double rates) {
            this.name = name;
            this.description = description;
            this.rates = rates;
        }
    }
}
