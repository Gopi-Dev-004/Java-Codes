package ProblemSolvings;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayBasic {

    //find small element in an array
    public static void smallElementInArr(){
        int[] arr = {2,4,5,21,5,632,2};

        int small = arr[0];
        for(int i=0; i<arr.length; i++){
        if(arr[i]<small){
            small = arr[i];
        }
        }
        System.out.println(small);
    }

    //find  large element in an array
    public static void largeElementInArr(){
        int[] arr = {2,4,5,21,5,632,2};

        int large = arr[0];
        for(int i=0; i<arr.length; i++){
        if(arr[i]>large){
            large = arr[i];
        }
        }
        System.out.println(large);
    }

    //Move all zero to end in an array
    public static void moveZeroEnd(){
        int[] arr = {0,2,3,0,0,40,0,5};
        int j=0;
        for(int i=0; i<arr.length; i++ ) {

            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }

             }
            while(j<arr.length)arr[j++] = 0;

        System.out.println(Arrays.toString(arr));
    }

    //remove duplicate from an array
    public static void removeDup(){

        int[] arr = {2,4,0,2,5,1,2,1,0,3,45};

        int len = arr.length;

        int j=0;

        int[] newArr = new int[len];

        for(int i=0; i<len; i++){

            boolean isPresent = false;

            for(int k=0; k < i; k++){

                if(newArr[k] == arr[i])
                    isPresent = true;

            }

            if (!isPresent){
                newArr[j++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(newArr,j)));

    }

    //second largest element in an array
    public static void secondLarge(){
        int[] arr = {2,0,2,5,1,2,1,0,3,5};

        int len = arr.length;

        int largestNum =  -1;
        int secondNum = -1;

        for(int i=0; i<len; i++){

            if(arr[i]>largestNum){
                secondNum = largestNum;
                largestNum = arr[i];

            }
            if(arr[i] != largestNum && arr[i] > secondNum){
                secondNum = arr[i];
            }
        }

        System.out.println(secondNum);
    }

    //count frequency of each element in an array
    public static void findFrequency(){

        int[] arr = {2,4,0,2,5,1,2,1,0,3,45};

        int len = arr.length;

        HashMap<Integer,Integer> nums = new HashMap<>();

        for(int n : arr){
            nums.put(n , nums.getOrDefault(n, 0)+1);
        }

        for(var n :nums.entrySet()){
            System.out.println(n.getKey()+" -> "+n.getValue());
        }

    }

    //merge two arrays
    public static void mergeTwoArray(){
        int[] arr1 = {2,4};
        int[] arr2 = {2,4,0};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] newArr = new int[len1+len2];

        for(int i=0; i<len1; i++){
            newArr[i] = arr1[i];
        }
        for(int i=len1; i-len1 < len2 ; i++){
            newArr[i] = arr2[i-len1];
        }

        System.out.println(Arrays.toString(newArr));

    }

    //rotate array
    public static void rotateArray(){
        int[] arr = {1,2,3,4,5};

        int start = 0;
        int end = arr.length-1;
        while(start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        System.out.println(Arrays.toString(arr));
    }

    //left rotate
    public static void rotateArrayLeft(){
        int[] arr = {1,2,3,4,5};

        int temp = arr[0];

        for(int i=1 ; i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }

    //rotate array by one position
    public static void rotateArrByOne(){
        int[] arr = {1,2,3,4,5};

        int temp = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        rotateArrByOne();
//        rotateArrayLeft();
//        rotateArray();
//        mergeTwoArray();
//        findFrequency();
//        secondLarge();
//        removeDup();
//        moveZeroEnd();
//        largeElementInArr();
//        smallElementInArr();

    }
}
