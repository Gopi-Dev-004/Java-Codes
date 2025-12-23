package Task.EmployeeManagemetSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramJourney {
    /*
    Create 2D array arr(3x3) then insert values by user
    1. remove duplicate values
    2. find duplicate values
     */

    static Scanner scan = new Scanner(System.in);
    static int [][] arr = new int[3][3];

    public static void insertValues(){
        System.out.println("Enter the values for (3x3) array...");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int n = scan.nextInt();
                arr[i][j] = n;
            }
        }

//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++){
//                System.out.print( arr[i][j] );
//            }
//            System.out.println();
//        }
    }

    public static void removeDup(){
        ArrayList<Integer> nums = new ArrayList<>();

            for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                nums.add(arr[i][j]);
            }
        }
        System.out.println("\n After remove duplicate :");
        nums.stream().distinct().forEach(x-> System.out.print(x+" "));
    }

    public static void findDup(){
        ArrayList<Integer> num = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                num.add(arr[i][j]);
            }
        }

    List<Integer> l = num.stream()
            .collect(Collectors.groupingBy(x->x,Collectors.counting()))
            .entrySet().stream()
            .filter(x-> x.getValue()>=2).
            map(Map.Entry::getKey).toList();
        System.out.println("\nThe duplicate values : "+l);

//                .forEach(n-> System.out.print(n.getKey()+" "));
    }

    public static void main(String[] args) {
        insertValues();
        removeDup();
        findDup();
    }
}
