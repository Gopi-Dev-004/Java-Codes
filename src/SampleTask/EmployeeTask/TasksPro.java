package SampleTask.EmployeeTask;

import java.util.*;
import java.util.stream.Collectors;


public class TasksPro {
   static Scanner scan = new Scanner(System.in);

//    10.	print the prime numbers based on user given range?
    public static boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){return false;}
        }
        return true;
    }
    public static void t1(){
        System.out.print("Enter the staring number : ");
        int start = scan.nextInt();scan.nextLine();
        System.out.print("Enter the the ending number : ");
        int end = scan.nextInt();
        System.out.print("The prime number between "+start+" to "+end+" Is :");
        for(int i=start; i<= end ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


//11.	Create immutable class?
    public static void t2(){
        //An immutable class is a class whose objects cannot be changed once they are created.
       final class ImutableClass{ // make class as final so sub class can't inherit
           final private int id;
           final private String  name;
           public  ImutableClass(int id, String name){// make public constructor for crate onject
               this.id=id;
               this.name=name;
           }
           public int getId(){return id;}  // set geter methods only
           public String getName(){return name;}

        }
    }


//12.	Create custom exception class?
    class MyException extends RuntimeException{
        MyException(String msg){
            super(msg);
        }
}

//13.	Find 2nd largest number in an array? (Array not possible means try ArrayList )?
    public static void t3(){
        int[] arr = {1,2,4,3,5,7,5,42,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

    }

//14.	Check if String is Palindrome or not without reverse the String?
    public static void pali(){
        String str = "hi";
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("not pali");
                break;
            }
            start++;
            end--;
        }
        System.out.println("pali");
    }
    
//15.	Count occurrences of characters in a String using HashMap?
    public static void t5(){
        String str ="The smallest individual unit is called tokens";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> sets : hm.entrySet()){
            System.out.println("Char : "+sets.getKey()+ " and it's occurrences : "+sets.getValue());
        }
    }

//16.	Find Max & Min from the ArrayList using stream?
    public static void t6() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 53, 2, 3, 2, 42);
        IntSummaryStatistics vals = list.stream()
                .collect(Collectors.summarizingInt(x->x));
        System.out.println("min : "+vals.getMin()+"  max :"+vals.getMax());
    }
//17.	convert the Employee ArrayList into Map using java or java8?
        public static void t7(){
//        employee.stream()
//                .collect(Collectors.toMap);

        }
//18.	Sort the Employee object based on salary using java 8?
    public static void t8(){

    }



    public static void main(String[] args){
        t6();
//            t5();
//            pali();
//        t3();

//    t1();
    }
}




