package Task.EmployeeManagemetSystem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {

    public static void sumArrayValues(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
       int s = Arrays.stream(arr).sum();
        System.out.println(s);
    }

    public static void firstAccur(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,61,2,5);

       int f = list.stream()
                .collect(Collectors
                        .groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream().filter( v -> v.getValue() >= 2).findFirst().get().getKey();

        System.out.println(f);
    }

    public static void secondMin(){
        List<Integer> list = Arrays.asList(1,2,2,3,5,5);
        int n = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(n);
    }

    public static void main(String[] args) {
       sumArrayValues();
       firstAccur();
       secondMin();

    }
}
