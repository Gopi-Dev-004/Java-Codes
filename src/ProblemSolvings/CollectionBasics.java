package ProblemSolvings;

import java.util.HashMap;
import java.util.HashSet;

public class CollectionBasics {


    // Find the frequency using hashmap
    public static void findFrequency(){
        String str = "Programming language";
        str = str.toLowerCase().replaceAll(" ","");
        HashMap<Character,Integer> hmp = new HashMap<>();

        for(char c : str.toCharArray()){
            hmp.put(c, hmp.getOrDefault(c,0)+1);
        }

        for(var vals : hmp.entrySet()){
            System.out.println(vals.getKey()+" -> "+vals.getValue());
        }

    }

    // Find duplicate using set
    public static void findDupUseSet(){

        int[] nums = {1,1,4,5,6,6,3,2,2};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dupSet = new HashSet<>();

        for(int n : nums){
            if(!set.add(n)){
                dupSet.add(n);
            }
        }
        System.out.println(dupSet);
    }

    //two sum
    public static void towSum(){

        int[] arr = {1,5,4,3,4,5};
        int target = 10;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            int dif = target - arr[i];

            if(hm.containsKey(dif)){
                System.out.println(hm.get(dif)+" - "+i);
            }
            hm.put(arr[i],i);
        }
    }

    //recursion
    public static int fun(int n){
        if(n == 0){
            System.out.println("Done!");
            return 0;
        }

        System.out.println("Learning step : "+ n);
       return  fun(n-1);
    }

    public static int sum(int n){
        if(n==0)return 0;
        System.out.println(n);
        return n+sum(n-1);
    }

    public static void printForward(int n){
        if(n==0)return;
        printForward(n-1);
        System.out.println(n);
    }

    public static void printArr(int[] arr, int index){
        if(index == arr.length)return;
        System.out.println(arr[index]);
        printArr(arr,index+1);
    }

    public static int max(int[] arr, int index){
        if(index == arr.length-1) return arr[index];
        int nextMax = max(arr,index+1);
        return Math.max(arr[index],nextMax);
    }

    public static String revStr(String str,int n){
        if(n==-1)return "";
        return str.charAt(n)+revStr(str,n-1);
    }

    public static int fib(int n){
        if(n <=1){
        }
        return 0;
    }


    public static void main(String[] args) {

        String str = "hello";
        System.out.println(revStr(str,str.length()-1));
//        int[] arr = {9,322,1,33};
//        System.out.println(max(arr,0));
//        int[] arr = {1,2,3,4,5};
//        printArr(arr,0);
//        printForward(5);
//        System.out.println(sum(5));
//        System.out.println(fun(4));
//        towSum();
//        findDupUseSet();
//        findFrequency();
    }

}
