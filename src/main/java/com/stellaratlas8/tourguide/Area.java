package com.stellaratlas8.tourguide;

public class Area {
    String name;
    TourGuide[] tourGuides;
    TouristSpot[] spots;
    Hotel[] hotels;

    public Area(String name) {
        this.name = name;
    }

    public Area spots(TouristSpot... spots) {
        this.spots = spots;

        return this;
    }

    public Area hotels(Hotel... hotels) {
        this.hotels = hotels;

        return this;
    }

    public Area tourGuides(TourGuide... tourGuides) {
        this.tourGuides = tourGuides;

        return this;
    }

    public static class TourGuide {
        String name, description;
        double fee;

        public TourGuide(String name, String description, double fee){
            this.name = name;
            this.description = description;
            this.fee = fee;
        }
    }
}
