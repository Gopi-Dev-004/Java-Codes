package WrapperClasses;


import java.util.Arrays;

public class Sam {
    public  static void  removeDup(String[] arr) {
            String[] tem=new String[arr.length];
           int uniqucount=0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<uniqucount;j++){
                if(arr[i].equals(arr[j])){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+" ");
                uniqucount++;
            }
        }


    }

    @Override
    public String toString() {
        return "Sam{}";
    }

    public static void main(String[] args) {
        String[]arr={"1","2","1","4","5","2","7","8","5","10"};
        System.out.println("Before revice dup : ");
        for(String s: arr){
            System.out.print(s+" ");
        }
        System.out.println();
        removeDup(arr);
    }
}

