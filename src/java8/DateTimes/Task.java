package java8.DateTimes;

import java.security.cert.LDAPCertStoreParameters;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Task {
    static Scanner scan= new Scanner(System.in);
    public static void find(){
//        while(true) {
            System.out.println("Enter the year : ");
            int year = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the Month : ");
            int month = scan.nextInt();
            scan.nextLine();

//            if(String.valueOf(year).length()==4  && String.valueOf(month).length()>=12){
//                break;
//            }else {System.out.println("""
//                    Invalid Inputs
//                    -> Year Must be 4 length
//                    -> Month Must be below 12 length
//                    """);}
//        }

        LocalDate d = LocalDate.of(year,month,1);

        int j=1;
        for(int i=1 ; i<=d.lengthOfMonth();i++){
            System.out.println(d.getDayOfWeek()+" , "+d.getDayOfMonth()+" , "+d.getMonth()+" , "+d.getYear());
           d = d.plusDays(1);
        }

    }

    public static void t2(){
        System.out.println("Enter the year : ");
        int year = scan.nextInt();
        scan.nextLine();

        for(int k=1;k<=12;k++) {
            LocalDate d = LocalDate.of(year, k, 1);
            System.out.println("The month of the year :"+d.getMonth()+"\n");

            System.out.println("Mon\tTue\tWen\tThu\tFri\tSat\tSun");

            int lengthOfMonth = d.lengthOfMonth();
            DayOfWeek dof = d.getDayOfWeek();
            int range = dof.getValue();

            for (int i = 1; i < range; i++)System.out.print("\t");
            for (int i = 1; i <= lengthOfMonth; i++) {

                if (d.getDayOfWeek() == dof)System.out.println(i + "\t");
                else  System.out.print(i + "\t");

                d = d.plusDays(1);
            }System.out.println("\n----------------------------------------------\n");
        }

    }
    public static void alam(){
        System.out.println("Enter the Hr : ");
        int hr = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Min : ");
        int mi = scan.nextInt();
        scan.nextLine();
        LocalTime t = LocalTime.of(hr,mi);
        while(true){
            LocalTime now =LocalTime.now();
            System.out.println(t.compareTo(now));
            if(t.compareTo(now)<0)break;
//            System.out.println(t.compareTo(now));
        }
        System.out.println("Alam On");
    }

    public static void main(String[] args) {
        alam();
//        t2();
//        find();
    }
}
