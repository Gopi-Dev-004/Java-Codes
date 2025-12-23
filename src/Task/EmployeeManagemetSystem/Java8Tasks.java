package Task.EmployeeManagemetSystem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java8 Program
//        1. Check each digit, if all digits are even, then sum the digits?
//        2. Convert 2D Array into single dimentional array and find the second largest number using Java8?
//        3. Identify all integers start with 3 but doesn't contains 2 [13,23,33,43,203,123,93]?
public class Java8Tasks {

  public static void evenNUm(){
//      1. Check each digit, if all digits are even, then sum the digits?

      int n = 461;
     boolean t = String.valueOf(n).chars().allMatch(x-> (x-'0')%2==0);

     if(t){
       System.out.println("All digits are even sum :"+  String.valueOf(n).chars().map(x->((x-'0'))).sum());
     }else System.out.println("Not all are even");



// -- Using core Java
//      int sum=0;
//      String n = String.valueOf(2146);
//      for(int i=0; i<n.length();i++){
//          if(!(n.indexOf(i)%2==0)){
//              System.out.println("It have odd number");
//           return;
//          }
//          sum  = sum+ n.indexOf(i);
//      }
//      System.out.println("The sum of digits is : "+sum);
  }

  public static void arr(){
      //2. Convert 2D Array into single dimentional array and find the second largest number using Java8?

      int[][] arr = {{1,2},{3,4}};
     int[] oneDArray =  Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();

        Optional<Integer> s = Arrays.stream(oneDArray).boxed()
                .sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();

        if(s.isPresent())
        {
            System.out.println("The second large is "+s.get());
        }else System.out.println("SL not found");

      //using core
//      int[][] arr = {{1,2},{3,4}};
//
//      int[] newArr = new int[arr.length*arr[0].length];
//
//      for(int i=0; i<arr[0].length;i++){
//          for(int j=0; j<arr[0].length;j++) {
//                newArr[i]=arr[i][j];
//                }
//          }
//
//      int max = Integer.MIN_VALUE;
//      int min = Integer.MAX_VALUE;
//
//      for(int i=0;i< newArr.length;i++){
//          if(newArr[i]>max)
//          {
//              min = max;
//              max = newArr[i];
//
//          } if (newArr[i]>min && newArr[i]!=max) {
//              min = newArr[i];
//          }
//
//      }
//      System.out.println(min);

  }

  public static void startwith3(){
      // Identify all integers start with 3 but doesn't contains 2 [13,23,33,43,203,123,93]?
      int[] arr = {13,23,33,43,203,123,93,34,35};

     List<Integer> r = Arrays.stream(arr).boxed().
              map(x->String.valueOf(x)).
              filter(s-> s.startsWith("3") && !s.contains("2"))
             .map(x->Integer.valueOf(x)).toList();

     if(r.size()>=1)
         System.out.println("The numbers is : "+r);
     else System.out.println("Not there");

  }

public static void main(String[] args){
//    evenNUm();
//    arr();
    startwith3();
//    int[][] arr = {{1,2},{3,4,6,8}};
//    System.out.println(arr.length*arr[0].length);
//    arr();
}
}
