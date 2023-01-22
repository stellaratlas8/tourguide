package com.stellaratlas8.tourguide;

public class Area {
    String name;
    TouristSpot[] spots;
    Hotel[] hotels;

    public Area(String name){
        this.name = name;
    }

    public Area spots(TouristSpot... spots){
        this.spots = spots;

        return this;
    }

    public Area hotels(Hotel... hotels){
        this.hotels = hotels;

        return this;
    }
}
