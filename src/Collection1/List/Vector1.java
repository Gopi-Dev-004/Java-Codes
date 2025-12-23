package Collection1.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector();
        v.ensureCapacity(50);// we can put the capascity
        v.add(30);
        v.add(20);
        System.out.println(v.capacity());
        v.addElement(309);
        Integer[] arr={1,2,3};
        v.copyInto(arr);
        System.out.println(v);
        v.reversed();
        System.out.println(v.reversed());
        System.out.println(v.elements());

        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        ListIterator<Integer> ii=v.listIterator();
        while (ii.hasNext()){
            System.out.println(ii.next());
        }
    }
}
