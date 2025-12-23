package Collection1.List;

import java.util.Arrays;
import java.util.List;


public class List1 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,20,30);
        l.add(40); //we cannot add this like becous it is interface
       //it thrwos the UnsuportedOperationException
        System.out.println(l);

    }
}
