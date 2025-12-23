package Task.EmployeeManagemetSystem;

import java.util.Scanner;
/*
Task to create 10 size array and get input from user the
print the sum of even number
print the sum of prime number
 */
public class Programming_World {
    static Scanner scan = new Scanner(System.in);
   static  int[] arr = new int[10];

   public static int sumOfEven(){
       int sum =0;
       for(int i=0; i<arr.length; i++){
             if(arr[i]%2==0)sum += arr[i];
           }
       return sum;
   }
    public static int sumOfPrime(){
        int sum =0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] <= 1 )continue;
            boolean b = false;
            for(int j=2 ;j<=Math.sqrt(arr[i]);j++){
                if(arr[i]%j==0)b=true;
            }
            if(!b)sum+=arr[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Enter the 10 values for array");
        for(int i=0; i<arr.length; i++){
            int n = scan.nextInt();
            arr[i] = n;
        }
        System.out.println("Sum of even number is : "+sumOfEven());
        System.out.println("Sum of prime number : "+sumOfPrime());
    }
}
