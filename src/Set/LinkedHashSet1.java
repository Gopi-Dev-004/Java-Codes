package Set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        //We can't do operation based on Index
        //It maintain Order
        // not allowe Duplicate values
        //allow null
        // extra method in lhs comper hs (removeFirst, removeLast, getFirst, getLast..)
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(20);
        lhs.add(20);
        lhs.add("Gopi");
        lhs.add(2005);
        lhs.add(50);
        lhs.add(60);
        System.out.println(lhs);
//        System.out.println(lhs.remove("Gopi"));
//        System.out.println(lhs.removeAll(lhs));
//        System.out.println(lhs.removeFirst());
//        System.out.println(lhs.removeLast());
//        System.out.println(lhs.getFirst());
//        System.out.println(lhs.getLast());
//        System.out.println(lhs.addAll(lhs));
//        System.out.println(lhs.);
        System.out.println(lhs);

    }
}
