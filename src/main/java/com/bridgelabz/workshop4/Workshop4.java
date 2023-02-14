//package com.bridgelabz.workshop4;
//import java.util.*;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.*;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//
//
//import java.time.LocalDate;
//public class Workshop4 {
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//    List<Hotel> hotelList = new ArrayList<>();
//
//    hotelList.add(new Hotel( "Lakewood",110, 80, 90, 80, 3 ));
//        hotelList.add(new Hotel( "Bridgewood",160, 110, 60, 50, 4 ));
//        hotelList.add(new Hotel( "Ridgewood",220, 100, 150, 40, 5 ));
//        LocalDate date = LocalDate.now();
//        System.out.println("Enter Starting Date");
//        System.out.println("Enter Day");
//        int day = s.nextInt();
//        System.out.println("Enter Month");
//        int month = s.nextInt();
//        System.out.println("Enter Year");
//        int year = s.nextInt();
//        System.out.println("Enter Endind Date");
//        System.out.println("Enter Day");
//        int day1 = s.nextInt();
//        System.out.println("Enter Month");
//        int month1 = s.nextInt();
//        System.out.println("Enter Year");
//        int year = s.nextInt();
//        System.out.println("Enter Customer Type ( Regular or Reawarded)");
//        String regularRewarde = s.next();
//        Map<String, Integer> mapPrice = new HashMap<>();
//        Long sum = 0;
//        int j = 0;
//        for( int h = 0; h < hotelList.size(); h++){
//            for( int i = 0; i < ( day1 -day); i++) {
//                LocalDate ld1 = LocalDate.of(year, month, day);
//                Long value = 0;
//                boolean isWeekend1 = isWeekEnd(ld1);
//                if( regularRewarde == "Regular" ){
//                    if(isWeekend1 == "True"){
//                        value = hotelList.stream().filter( p -> p.weekendRegular ).map( p -> p.weekendRegular).get();
//                    }
//                    else{
//                        value = hotelList.stream().filter( p -> p.weekDayRegular ).map( p -> p.weekDayRegular).get();
//                    }
//                }
//                else{
//                    if(isWeekend1 == "True"){
//                        value = hotelList.stream().filter( p -> p.weekendReward ).map( p -> p.weekendReward).get();
//                    }
//                    else{
//                        value = hotelList.stream().filter( p -> p.weekDayReward ).map( p -> p.weekDayReward).get();
//                    }
//                }
//                sum = sum + value;
//            }
//            mapPrice.put(hotelList());
//
//        }
//
//
//
//
//        public static boolean isWeekEnd(LocalDate localDate)
//        {
//            String dayOfWeek = localDate.getDayOfWeek().toString();
//            if("SATURDAY".equalsIgnoreCase(dayOfWeek)||
//                    "SUNDAY".equalsIgnoreCase(dayOfWeek))
//            {
//                return true;
//            }
//            return false;
//        }
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
