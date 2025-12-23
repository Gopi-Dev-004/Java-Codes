package java8.DateTimes;

import java.time.LocalTime;

public class SampleLocalTime {
    public static void main(String[] args) {
//        LocalTime t = LocalTime.now();
//        System.out.println(t);//13:04:35.937939800
//        LocalTime t = LocalTime.of(12,55);
//        LocalTime t = LocalTime.of(12,55,21);
//        LocalTime t = LocalTime.of(12,55,32,3222222);
//        System.out.println(t);//12:55:32.003222222

//        LocalTime t = LocalTime.parse("13:20:55");
//        System.out.println(t);//13:20:55
         LocalTime t = LocalTime.now();//13
        //for get
        System.out.println(t.getHour());//
        System.out.println(t.getMinute());//12
        System.out.println(t.getSecond());//56
        System.out.println(t.getNano());//219054400
        //for adding
        System.out.println(t.plusHours(1));//14:14:40.087239500
        System.out.println(t.plusMinutes(2));
        System.out.println(t.plusSeconds(3));
        System.out.println(t.plusNanos(5));
        System.out.println();



    }
}
