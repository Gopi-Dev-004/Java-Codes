package Collection1.Tasks;
import java.util.Scanner;
import java.util.ArrayList;

public class Task2 {

   static ArrayList<Integer> al=new ArrayList();
    static Scanner scan=new Scanner(System.in);
    public static void max(){
        Integer max=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++){
            if(al.get(i)>max){
                max=al.get(i);
            }
        }
        System.out.println("The maximum value is :"+max);
    }
    public static void min(){
        Integer min=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            if(al.get(i)<min){
                min=al.get(i);
            }
        }
        System.out.println("The maximum value is :"+min);
    }

    public static void display(){
     for(int i=0;i<5;i++){
         System.out.println("Enter the "+i+" value :");
         al.add(scan.nextInt());
     }
     System.out.println(al+"\n");
        int ch;
     do{
         System.out.println("1. Max Num. \n 2. Min Num. \n 3. Sum of all Num \n 4. Average of numbers. " +
                 "5. Remove all even number from the list. \n 6. Exit. \n *Enter your choose: ");
          ch=scan.nextInt();
         switch(ch){
             case 1:
                 max();
                 break;
             case 2:
                 min();
                 break;
             case 3:
                 break;
         }

     }while(ch==5);
 }
        public static void main(String[] task){
     Task2 t=new Task2();
            t.display();
        }
}
