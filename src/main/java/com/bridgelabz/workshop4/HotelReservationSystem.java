package com.bridgelabz.workshop4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.*;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Stream;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class HotelReservationSystem {
    Hotel hotel = new Hotel();
    List<Hotel> hotelList = new ArrayList<>();
    public LocalDate dateFormat(String date) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        final LocalDate firstDate = LocalDate.parse(date, formatter);
        return firstDate;
    }
    public int numberOfDayes(final LocalDate startDate, final LocalDate endDate) {
        long day = ChronoUnit.DAYS.between(startDate, endDate);
        int days = (int) day;
        return days;
    }
    public int noOfWorkingDays(final LocalDate startDate, final LocalDate endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Invalid method argument(s) to countBusinessDaysBetween (" + startDate + "," + endDate + "," + ")");
        }
        Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;
        List<LocalDate> businessDays = startDate.datesUntil(endDate).filter(isWeekend.negate()).collect(Collectors.toList());
        return businessDays.size();
    }

    public void lowCostHotelis(int totalWeekDays, int totalWeekends, String regularReward) {
        Map<String, Integer> hotelMap = new HashMap<>();
        try {
            if (regularReward.equals("Regular")) {
                hotelMap = hotelList.stream().collect(Collectors.toMap(x -> x.getHotelName(), x -> x.getWeekDayRegular() * totalWeekDays + x.getWeekendRegular() * totalWeekends));
            } else {
                hotelMap = hotelList.stream().collect(Collectors.toMap(x -> x.getHotelName(), x -> x.getWeekDayReward() * totalWeekDays + x.getWeekendReward() * totalWeekends));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(hotelMap);
        int minValue = hotelMap.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();
        for (Map.Entry<String,Integer> mp : hotelMap.entrySet()) {
            if (mp.getValue() == minValue) {
                for( Hotel h : hotelList){
                    if( h.getHotelName().equalsIgnoreCase(mp.getKey())){
                        System.out.println("Hotel  : " + mp.getKey() + " Minimum Cost : " + mp.getValue() + " Rating : " + h.getRating());
                    }
                }
            }
        }
    }


    public void finalHotelReseravationSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Type ( Regular or Rewarded )");
        String regularReward = scanner.nextLine();
        System.out.println("Enter Start Date (ddmmyyyy)");
        String firstsDate = scanner.nextLine();
        System.out.println("Enter End Date (ddmmyyyy)");
        String secondsDate =scanner.nextLine();
        final LocalDate startDate = dateFormat(firstsDate);
        final LocalDate endDate = dateFormat(secondsDate);
        final LocalDate finalDate = endDate.plusDays(1);
        int totalDays = numberOfDayes(startDate, finalDate);
        int totalWeekDays = noOfWorkingDays(startDate, finalDate);
        int totalWeekends = totalDays - totalWeekDays;
        System.out.println("Total Days " + totalDays);
        System.out.println("Total Week Days " + totalWeekDays);
        System.out.println("Total Weekends " + totalWeekends);
        lowCostHotelis(totalWeekDays, totalWeekends, regularReward);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HotelReservationSystem hrs = new HotelReservationSystem();
        hrs.hotelList.add(new Hotel("Lakewood", 110, 80, 90, 80, 3));
        hrs.hotelList.add(new Hotel("Bridgewood", 160, 110, 60, 50, 4));
        hrs.hotelList.add(new Hotel("Ridgewood", 220, 100, 150, 40, 5));
        hrs.finalHotelReseravationSystem();
    }
}