package Collection1.Set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(10);
        lhs.add(200);
        lhs.add(30);
        lhs.addLast("gopi");
        lhs.addFirst("mani");

        System.out.println(lhs.remove("object based"));
        System.out.println(lhs.removeLast());
        System.out.println(lhs.removeFirst());
        System.out.println(lhs.getLast());
        System.out.println(lhs.getFirst());
//        System.out.println(lhs.);
        System.out.println(lhs);

    }
}
