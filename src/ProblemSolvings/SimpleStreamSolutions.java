package ProblemSolvings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleStreamSolutions {

    // Separate Odd and Even number
    public static void separateOddAndEven(){

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);

      Map<Boolean,List<Integer>> sepratedNum = nums.stream().collect(Collectors.partitioningBy(n -> n%2 == 0 ));

        System.out.println(sepratedNum);
    }

    //Frequency of each character in a string
    public static void  frequencyChar(){

        String str = "Programming language";

       Map<Character, Long> freq = str.chars()
               .mapToObj(c -> (char)c)
                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Map.Entry<Character,Long> kv : freq.entrySet()){
            System.out.println(kv.getKey() +"->" +kv.getValue());
        }

    }

    //sort list in reverse order
    public static void sortListRevOrd(){
        List<Integer> nums = Arrays.asList(2,5,2,1,52,9,743,2);

        nums.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.println(n));
    }

    //print multiples of 5 from the list
    public static void multipleOfNum(){
        int n = 5;
        List<Integer> list =  Arrays.asList(1,2,4,5,6,349,48,38,90,24,55,75);

        list.stream().filter(e-> e%5 == 0).forEach(System.out::println);
    }

    //merge tow unsorted array to single sorted array
    public static void sortTwoArr(){

        int[] arr1 = {4,2,5,3,56,5};
        int[] arr2 = {4,222,566,33,56,5,21,0};

        IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().forEach(System.out::println);



    }

    public static void main(String[] args) {

        sortTwoArr();
//        multipleOfNum();
//        sortListRevOrd();
//        frequencyChar();
//        separateOddAndEven();
    }

}
