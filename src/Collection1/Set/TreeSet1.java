package Collection1.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();// homogeneous type onlye
        ts.add(20);
//        ts.add("malai");class cast exception
        ts.add(2);
        ts.add(50);
        ts.add(30);
        System.out.println(ts.tailSet(30));
        System.out.println( ts.headSet(30));
        System.out.println(ts.ceiling(30));
        System.out.println( ts.floor(30));;
        System.out.println( ts.lower(30));
        System.out.println( ts.higher(30));
      //null
        System.out.println(ts.ceiling(55));
        System.out.println( ts.floor(0));;
        System.out.println( ts.lower(0));

        System.out.println( ts.higher(55));
//        ts.add("str");
        //natural ordering follow so
// throw class cast exception becaz it is internally use comparator or comparto method to short the  elements so we must be give generic type only.
// priority queue treeset and treemap are not suport the herogeneous element to store!!!
//why: internally use comparator and comparable to sort the element so when we store hetrogeneous element
        System.out.println(ts);
        Iterator it=ts.iterator();
        while(it.hasNext()){
            int n=Integer.parseInt(it.next()+"");
            if(n>20){
              it.remove();
            }
        }
        System.out.println(ts);
    }

}
