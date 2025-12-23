package CollectionTasks;

import java.util.Arrays;
import java.util.LinkedList;
public class FindStringStartWithNumUseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList(Arrays.asList("abac","1abc","5abc","bcd"));
        System.out.println(ll);
        System.out.println("The elements are start with numbers : ");

        for(String l :  ll){
            if(Character.isDigit(l.charAt(0))){
                System.out.print(l);
            }
        }
    }
}
