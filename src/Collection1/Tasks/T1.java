package Collection1.Tasks;

import javax.swing.text.TabSet;
import java.util.*;

public class T1 {
    //Find second largest in the Array list
    public static void main(String[] args) {
        List l= Arrays.asList(20,31,21,30);
        Set ts=new TreeSet(l);
        ArrayList al=new ArrayList(ts);
        System.out.println(al);
        al.reversed();
        System.out.println(al);


    }
}
