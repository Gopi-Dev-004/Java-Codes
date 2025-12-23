package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        //not allow duplicats
        //not allowd null
        //must maintain asending order
        //it hava extra method commper to HS and LHS ( addFirst,addLastm ,first-retrun first val, last,
        // descendingIterator, pollFirst-remove operation ,pollLast )
        //it allows generic type only (specific one datatye) throw ClasCastException


        TreeSet ts = new TreeSet();
        ts.add(12);
        ts.add(14);
        ts.add(13);
        ts.add(60);

//   ts.add("gopi"); throw class cast exception
//       ts.addFirst(1);//throw the UnsupportOperationException
//        ts.addLast(30);//throw the UnsupportOperationException
//        System.out.println(ts.first());
//        System.out.println(ts.last());
////        System.out.println(ts.descendingIterator());
//        ts.pollFirst();
//        ts.pollLast();
        System.out.println(ts);
//        System.out.println(ts.headSet(14)); //retrun below object
//        System.out.println(ts.headSet(14,true));//equqls and below
//        System.out.println(ts.tailSet(13));// return about or equal object
//        System.out.println(ts.tailSet(13,true));
        System.out.println(ts);
//        System.out.println(ts.higher(5));//return 5<values or null
//        System.out.println(ts.lower(50));//return >50 or null
//        System.out.println(ts.ceiling(13));//same has higher but the given obj is present return that obj
//        System.out.println(ts.floor(14));// same has kiwer but the given onj is present return that onj

        System.out.println(ts);


    }
}