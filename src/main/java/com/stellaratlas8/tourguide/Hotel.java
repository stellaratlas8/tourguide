package com.stellaratlas8.tourguide;

public class Hotel {
    String name, description;
    Offer[] offers;

    public Hotel(String name, String description, Offer... offers) {
        this.name = name;
        this.description = description;
        this.offers = offers;
    }

    static public class Offer {
        String name, description;
        double rates;

        public Offer(String name, String description, double rates) {
            this.name = name;
            this.description = description;
            this.rates = rates;
        }
    }
}
