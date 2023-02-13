package com.bridgelabz.workshop4;

public class Hotel {

    private String hotelName;
     private int weekDayRegular;
     private int weekDayReward;
     private int weekendRegular;
     private int weekendReward;
     private int rating;

     Hotel(){}


    public Hotel(String hotelName, int weekDayRegular, int weekDayReward, int weekendRegular, int weekendReward, int rating) {
        this.hotelName = hotelName;
         this.weekDayRegular = weekDayRegular;
        this.weekDayReward = weekDayReward;
        this.weekendRegular = weekendRegular;
        this.weekendReward = weekendReward;
        this.rating = rating;
    }
}
