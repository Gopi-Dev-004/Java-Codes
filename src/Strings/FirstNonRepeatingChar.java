package Strings;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "programming";

     Character ch =   str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue()==1)
                .findFirst()
                .map( s-> s.getKey())
                .orElse(null);
     if(ch == null){
         System.out.println("No non repeating character found!!!");return;}
         System.out.println("The repeating character is : "+ch);



//        for (int i = 0; i < str.length() - 1; i++) {
//            boolean unique=true;
//            for (int j = 0; j < str.length(); j++) {
//                if(i==j)continue;
//                if(str.charAt(i)==str.charAt(j)){
//                    unique=false;
//                    break;
//                }
//                }
//            if(unique){
//                System.out.println(str.charAt(i));
//                return;
//            }
//            }
//        System.out.println("Not Found");
        //way to
//        int[] freq=new int[256];
//        for(char c1 : str.toCharArray()){
//            freq[c1]++;
////            System.out.println(freq[c1]);
//
//        }for(char c2 : str.toCharArray()){
//            if(freq[c2]==1 ){
//                System.out.println("The non repeating character is :"+c2);
//                return;
//            }
//        }
//        System.out.println("Not found");
    }
}
