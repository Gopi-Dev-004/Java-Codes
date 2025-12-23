package java9;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPIHenancements {

    public static void main(String[] args){
//        takeWhile();
//        dropWhile();
//        iterator();
        optional();
    }



    public static void takeWhile(){

        List.of(1,2,3,4,5).stream()
                .takeWhile(n-> n <= 2).forEach(System.out::println);
    }

    public static void dropWhile(){
        List.of(1,20,1,4,5).stream()
                .dropWhile(n-> n <= 2).forEach(System.out::println);
    }

    public static void iterator(){
        Stream.iterate(10,n-> n<=20, n-> n+1)
                .forEach(System.out::println);
    }

    public static void optional(){
        Optional n = Optional.empty();
        n.stream().forEach(System.out::println);
    }



}
