package java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class

DailyTasks {

    public static void findEvenNum(){

//You have a list of numbers. Use a Stream to filter out the even numbers and print them.

        List<Integer> nums = Arrays.asList(1,2,34,5,6,78,9);
        nums.stream()
                .filter(n -> n%2 ==0 ).forEach(System.out::println);
    }

    public static void strOpe(){
//        Filter names that start with the letter "A".
//        Convert them to uppercase.
//        Sort them alphabetically.
//        Print the final result.
        List<String > names = Arrays.asList("Arun", "Gopi","Malai","Achu","Arjun","Aravindh");
        names.stream()
                .filter( name-> name.startsWith("A"))
                .map(String::toUpperCase)
               // .sorted((x,y)->x.compareTo(y))
                .sorted()
                .forEach(System.out::println);

    }

    public static void numSun(){
        /*
        You have a list of integers. Use a Stream to:
Filter numbers greater than 10.
Multiply each remaining number by 2.
Sort them in descending order.
Calculate the sum of these numbers.
Print the final sum.
         */
        List<Integer> nums = Arrays.asList(10,20,12,1,30,11,5,6,60);
     int sum =   nums.stream()
                .filter(n-> n>=10)
                .map( n-> n*=2)
                .sorted()
                .reduce(0,(old ,newE)-> newE +old);
        System.out.println(sum);
    }
    public static void numSun2(){
        /*

       You have a list of integers. Use a Stream to:

Filter numbers greater than 15.
Multiply each remaining number by 3.
Remove duplicates.
Sort in descending order.
Collect the result into a new list.
Print the new list.

         */
        List<Integer> nums = Arrays.asList(10,20,12,12,20,11,5,6,60);
     List<Integer> l =   nums.stream()
                .filter(n-> n>=15)
                .map( n-> n*=3)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        l.forEach(System.out::println);
        //The smallest individual unit is called tokens
    }


    public static void main(String[] args) {
      numSun2();
//      numSun();
//      strOpe();
//      findEvenNum();
    }
}
