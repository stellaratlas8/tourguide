package com.stellaratlas8.tourguide;

public class Hotel {
    String name, description;
    Suite[] suites;

    public Hotel(String name, String description, Suite... suites) {
        this.name = name;
        this.description = description;
        this.suites = suites;
    }

    static public class Suite {
        String name, description;
        double rates;

        public Suite(String name, String description, double rates) {
            this.name = name;
            this.description = description;
            this.rates = rates;
        }
    }
}
