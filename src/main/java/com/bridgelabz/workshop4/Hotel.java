package com.bridgelabz.workshop4;

public class Hotel {

    private String hotelName;
    private int weekDayRegular;
    private int weekDayReward;
    private int weekendRegular;
    private int weekendReward;
    private int rating;

    Hotel() {
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRegular() {
        return weekDayRegular;
    }

    public void setWeekDayRegular(int weekDayRegular) {
        this.weekDayRegular = weekDayRegular;
    }

    public int getWeekDayReward() {
        return weekDayReward;
    }

    public void setWeekDayReward(int weekDayReward) {
        this.weekDayReward = weekDayReward;
    }

    public int getWeekendRegular() {
        return weekendRegular;
    }

    public void setWeekendRegular(int weekendRegular) {
        this.weekendRegular = weekendRegular;
    }

    public int getWeekendReward() {
        return weekendReward;
    }

    public void setWeekendReward(int weekendReward) {
        this.weekendReward = weekendReward;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Hotel(String hotelName, int weekDayRegular, int weekDayReward, int weekendRegular, int weekendReward, int rating) {
        this.hotelName = hotelName;
        this.weekDayRegular = weekDayRegular;
        this.weekDayReward = weekDayReward;
        this.weekendRegular = weekendRegular;
        this.weekendReward = weekendReward;
        this.rating = rating;
    }
}
