package Collection1.Tasks;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/*
1.find Maximum & Minimum In A List
2.Sort The List In Reverse Order without in build method.
3.Remove duplicates in arraylist
4.wajp to copy one array list into another.
5.Merge Two Unsorted list Into Single Sorted list
6. find second largest element in arraylist
7.Sort List of Strings In ascending Order Of their Length based
8.Find Strings Which Start With Number
9.Frequency of Each Number
10.Frequency of Each Character In String
 */

public class Task1 {

    public void task1(){
/*
        Find maximum and minimum in a list
 */
        ArrayList<Integer> al=new ArrayList();
        al.add(20);al.add(30);al.add(35);
        al.add(50);al.add(60);al.add(80);
        int n=0;
        int large=Integer.MAX_VALUE;
        int small=Integer.MIN_VALUE;
//        Iterator it=al.iterator();
//        while(it.hasNext()){
//            n=(int)it.next();
//          if( n>large){
//              large=n;
//          }
//          if(n<small){
//              small=n;
//          }
        //}
        for(Integer i : al){
            if(i>large){
                large=i;
            }
            if(i<small){
                small=i;
            }
        }
        System.out.println("Max number "+large);
        System.out.println("Min number: "+small);
    }
    public void task2(){
        /*
        Sort the list in reverse order without in build method.
         */

        ArrayList<Integer> al=new ArrayList();
        al.add(20);al.add(30);al.add(35);
        al.add(50);al.add(50);al.add(80);
        System.out.println(al);
        int len=al.size();
//        System.out.println(len);
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++) {
                if (al.get(i) < al.get(j)) {
                    Integer temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        System.out.println(al);
    }
    public void task3(){
        /*
        Remove the duplicates in arraylist
         */

        ArrayList<Integer> al=new ArrayList();
        al.add(20);al.add(30);al.add(35);
        al.add(50);al.add(50);al.add(80);
        TreeSet ts=new TreeSet(al);
        System.out.println("Befor  : "+al);
        System.out.println("After  : "+ts);

    }
    public void task4(){
        /*
        wajap to copy one array list into another.
         */

        ArrayList<Integer> al=new ArrayList();
        al.add(20);al.add(30);al.add(35);
        al.add(50);al.add(50);al.add(80);
        ArrayList<Integer> al2=new ArrayList(al);
        System.out.println("Original  : "+al);
        System.out.println("Copy  : "+al2);


    }
    public void task5(){
        /*
        Merge two unsrted list into single sorted list
         */
        ArrayList<Integer> al=new ArrayList();
        ArrayList<Integer> al2=new ArrayList();
        al.add(20);al.add(30);al.add(35);
        al2.add(50);al2.add(50);al2.add(80);
        TreeSet ts=new TreeSet();
        ts.addAll(al);
        ts.addAll(al2);
        ArrayList<Integer> n=new ArrayList(ts);
        System.out.println("The first Arraylist : "+al);
        System.out.println("The second Arraylist : "+al2);
        System.out.println("The sorted one Arraylist : "+n);


    }
    public void task6(){
        /*
        Find second largest element in arraylist
         */
        ArrayList<Integer> al=new ArrayList();
        al.add(1);al.add(12);al.add(3);
        al.add(11);al.add(2);al.add(30);
        Integer max=0;
        Integer min=0;
        for(int i=0;i<al.size();i++){
           if(al.get(i)>max){
               max=al.get(i);
           }
        }
        for(int i=0;i<al.size();i++){
                if(al.get(i)>min && max != al.get(i)){
                    min= al.get(i);
            }
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
        }
    public void task7(){
    }
    public void task8(){
       /*
       Find Strings Which Start With Number
        */
ArrayList<String > al=new ArrayList();
al.add("mano");
al.add("12gopi");
al.add("mani");
al.add("malai");
for(String s: al) {
//    System.out.println(s.charAt(0));
    String s1=s.substring(0,1);
    if ("0 1 2 3 4 5 6 7 8 9 ".contains(s1)) {
        System.out.println(s);
        return;
    }
    }
        System.out.println("Not found");
    }
    public void task9(){
        ArrayList<Integer> al=new ArrayList();
        al.add(20);al.add(30); al.add(20);
        al.add(25); al.add(30); al.add(250);
        int count;
        ArrayList<Integer> al1=new ArrayList(al);
        for(int i=0;i<al1.size();i++){
             count=0;
             for(int j=i+1;j<al1.size();j++) {
                 if (al1.indexOf(i) == al1.indexOf(j)) {
                     count++;
                     al1.remove(j);
                     j--;
//                     j=i+1;
                 }
                 if (j+1 == al1.size()) {
                     System.out.println("The num is : " + al1.get(i) + "frequancy  is : " + count);
                 }
             }
        }
    }

    public static void main(String[] args) {

        Task1 obj=new Task1();
        //obj.task1();
//        obj.task2();
       // obj.task3();
       // obj.task4();
       // obj.task5();
//        obj.task6();
//        obj.task8();
        obj.task9();
//        Integer min=Integer.MIN_VALUE;
//        Integer max=Integer.MAX_VALUE;
//        System.out.println(min);
//        System.out.println(max);
    }
}
