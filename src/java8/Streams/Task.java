package java8.Streams;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Task {
    static Scanner scan=new Scanner(System.in);
    public static void task1(){
        // 1 - 100 random values (10)

        Stream.iterate(1.0 ,x->(x+Math.random()*100))
                .filter(x->  x<=100 )
                .limit(10)
               .forEach(System.out::println);
    }
    public static void task2(){
        System.out.println("Enter the range : ");
        int n=scan.nextInt();
        Supplier<Double> sup= () -> Math.random()*100 ;
                Stream.generate(sup)
                        .filter( x -> x<=n )
                        .limit(10)
                        .forEach(System.out::println);



    }
    public static void task3(){
        Stream.iterate(1, x-> x+1)
                .map(x -> x%2 ==0 ? x+" -> Even": x+" -> Odd" )
                .limit(50)
                .forEach(System.out::println);

    }
    public static void task4(){
        Stream.of("Malai","Mohan","Naveen")
                .map(x->"Student_Name :"+x)
                .forEach(System.out::println);
    }
    public static void task5(){
        Stream.of("Malai","Mohan","Naveen")
                .map(x->x.toLowerCase())
                .forEach(System.out::println);
    }
    public static void task6(){
        Stream.of("Malai","Mohan","Naveen")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
    public static void task7(){
        String[] wordsList = {"welcome to java", "The The is programming language", "Compare to python java is more readable"};
            stream(wordsList)
                    .forEach(System.out::println);
    }
    public static void task8(){
        String[] wordsList = {"welcome to to java", "The The is programming language", "Compare to python java is more readable"};
            stream(wordsList)
                    .flatMap(x-> stream(x.split(" ")))
                    .distinct()
                    .forEach(System.out::println);
    }
    public static void task9(){
        String[] wordsList = {"welcome to to java", "The The is programming language", "Compare to python java is more readable"};
        stream(wordsList)
                .flatMap(x-> stream(x.split(" ")))
                .distinct()
                .map(x-> {
                        StringBuilder sb=new StringBuilder(x.substring(0,1).toUpperCase()+x.substring(1));
                         return   sb.reverse();
                         })
                .forEach(System.out::println);
    }

//    1. String[] words = {"listen", "silent", "enlist",
//     "rat", "tar", "art", "tenet","java", "stream"};
//the result should be only anagram list

//2. ["level", "hello", "madam", "world", "noon"]
//only the words that are palindromes
public static void palindrome(){
        List list =  Arrays.asList("level", "hello", "madam", "world", "noon");
        list = list.stream()
             .map(s-> s.equals( new StringBuilder(s.toString()).reverse()))
             .toList();
    System.out.println(list);}

//3. [2, 3, 4, 5, 10, 11, 15, 17]
//only number are prime numbers
    
    //4. ["java", "stream", "powerful", "api", "rocks"]
//only print which is longest string
    public static void longStr(){
        
        List<String> list = Arrays.asList("java", "stream", "powerful", "api", "rocks");
        list.stream()
                .max(Comparator.comparingInt(String::length));

    }
    
//5. [10, 20, 30, 20, 40, 10, 50]
//print only duplicated values

//6. "stream" and "master"
//print the common characters
//
    public static void t1(){}
    public
    static void t2(){}
    public static void t3(){
        //only the word that are palindrome
//        String[] arr={"listen","silent","enlist","rat","tar","java","stream"};
        String[] arr={"level","hello","madam","world","noon"};
        stream(arr)
                .filter(x-> {
                    StringBuilder rev = new StringBuilder(x);
                    return rev.reverse().toString().equals(x);
                })
                .forEach(System.out::println);



    }
    public static void t4(){
        //only print which is longest string
        String[] str={"java","stream","powerful","api","rocks"};
        stream(str)
                .sorted((x,y) ->x.length()>y.length()?-1:y.length()>x.length()?1:0)
                .limit(1)
                .forEach(System.out::println);
    }
    public static void t5(){
        int[] nums={10, 20, 30, 20, 40, 10, 50};

//        Arrays.stream(nums)
//                .filter(x->{boolean b=true;for(Integer n : nums)if(x==n)
//
//                    })


    }
    public static void t6(){
        //"stream" and "master" print the common characters.
        String s1 = "stream";
        String s2 = "malai";

        Stream.iterate(0,x->x+1)
                .limit(s1.length())
                .map(x->s1.charAt(x))
                .filter(x->s2.contains(x+""))
                .forEach(System.out::println);




    }


    public static void main(String[] args) {
        longStr();
//        palindrome();
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        t1();
//        t2();
//        t3();




//        System.out.println(revearseStr("the pro"));

    }

}
