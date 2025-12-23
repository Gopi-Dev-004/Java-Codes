package Set;
import java.util.*;
public class HasSet1 {
    public static void main(String[] args) {
        //We can't do operation based on Index
        //it dose not maintain order
         //not allowe Duplicate values
        //allow null

        HashSet hs=new HashSet();
        HashSet hs2=new HashSet();
        hs.add(10);
        hs.add("gopi");
        hs.add("gopi");
        hs.add("Gopi");
        hs.add("boy");
        hs.add(null);
        hs.add(11);hs.add(10);
        hs2.add("gopis");
        hs2.add("gopi");
        hs2.add("Gopi");
        hs2.add(null);
        hs2.add(111);
        //We can get values using iterator or forEach loop
//        Iterator it=hs.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        for(Object o:hs){
//            System.out.println(o);
//        }

//        System.out.println(hs.remove(11));
        System.out.println(hs);
        System.out.println(hs2);
//        System.out.println(hs.removeAll(hs2));
//        System.out.println(hs.retainAll(hs2));
//        hs.clear();
//        System.out.println(hs.contains("Gopi"));
//        System.out.println(hs.contains("Gopi"));
//        System.out.println(hs.containsAll());
//
//        Object[] arr=hs.toArray();
////        System.out.println(arr);
//        for(Object o: arr){
//            System.out.println(o);
//        }

        System.out.println(hs);
    }
}
