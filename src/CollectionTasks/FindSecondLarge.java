package CollectionTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLarge {
    public static void main(String[] args) {
List l= Arrays.asList(10,25,20,15,60);
        ArrayList<Integer> al=new ArrayList<>(l);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        for(int i=al.size()-1;i>0;i--){
            if(al.get(al.size()-1)!=al.get(i)){
                System.out.println("Second largest Element in Al : "+al.get(i));
           return;
            }
        }

    }
}
