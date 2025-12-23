package Collection1.Queues;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.DelayQueue;

public class DeQ {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        ad.offer(30);
        ad.addLast(40);
        ad.addFirst(50);
        ad.poll();
        ad.pollLast();
        ad.pollFirst();
        ad.peek();
        ad.peekFirst();
        ad.peekLast();

        ad.addFirst(18);
        ad.addLast(30);
        ad.addLast(30);
        ad.addLast(30);
        ad.addLast(40);
        System.out.println(ad);
//        ad.remove(30);
        ad.removeFirstOccurrence(30);
        ad.removeLastOccurrence(30);
//        System.out.println(ad.descendingIterator());
        Iterator it=ad.descendingIterator();
        while(it.hasNext()){
//            it.next();
            System.out.println(it.next());
        }
        System.out.println(ad);

    }
}
