package java8.DateTimes;

import java.time.LocalDate;
import java.time.Month;

public class SampleLocalDate {
    public static void main(String[] args) {
//        LocalDate d =LocalDate.now();
//        System.out.println(d);//2025-09-20
//        LocalDate d =LocalDate.of(0001,12,8);
//        System.out.println(d);//0001-12-08
//        LocalDate d =LocalDate.of(0001, Month.DECEMBER,8);
//        System.out.println(d);//0001-12-08
//        LocalDate d =LocalDate.of(0001,12,8);
//        System.out.println(d);//0001-12-08
//        LocalDate d =LocalDate.parse("2005-12-08");
//        System.out.println(d);//2005-12-08
        LocalDate d =LocalDate.parse("2005-12-08");
        System.out.println(d);//2005-12-08
        System.out.println(d.getYear());//2025
        System.out.println(d.getMonth());//DECEMBER
        System.out.println(d.getDayOfWeek());//THURSDAY
        System.out.println(d.getDayOfMonth());//08
        System.out.println(d.isLeapYear());//false
        System.out.println(d.minusYears(1));//2004-12-08
        System.out.println(d.minusDays(1));
        System.out.println(d.minusMonths(1));
        System.out.println(d.plusDays(1));
        System.out.println(d.plusMonths(1));
        System.out.println(d.plusYears(1));


        //for upadate
        System.out.println(d.withDayOfYear(20));//change date

    }

}
