package Collection1.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Queue qll=new LinkedList();
        qll.offer(30);
        System.out.println(qll);
        qll.peek();
        System.out.println(qll);
        //deque methods'
        ll.addFirst(20);
        ll.addLast(20);
        ll.getLast();
        ll.getLast();
        ll.removeFirst();
        ll.removeLast();
        ll.peek(); //get
        ll.peekFirst();// return null when empty
        ll.peekLast();
        ll.poll(); // return null when empty
        ll.offer(20);//boolean
        ll.offerFirst(50);
    }
}
