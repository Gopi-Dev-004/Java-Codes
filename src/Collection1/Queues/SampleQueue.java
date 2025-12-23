package Collection1.Queues;

import java.util.*;

public class SampleQueue {
    public static void main(String[] args) {
        List l= Arrays.asList(8,30,6,5,20,25);
        PriorityQueue pq=new PriorityQueue();
        pq.add(20);
        pq.add(10);
        pq.add(5);
        pq.add(15);
        System.out.println(pq);
        pq.poll();
//        pq.
//        pq.poll();
//        System.out.println(pq);
//        pq.add(null);// throws null pointer exception
//        for(Integer q : pq) {
//            System.out.println(q);
//        }
        ArrayDeque<Integer> ad=new ArrayDeque(l);
        System.out.println(ad);
//        pq.add(null);// throws null pointer exception
//        ad.poll();
//        ad.poll();
//        ad.poll();
        ad.add(100);
        System.out.println(ad);
        for(Integer q : ad) {
            System.out.println(q);
        }
        Stack s=new Stack();
        s.add(1);
        s.add(12);
        s.add(13);
        System.out.println(  s.elementAt(2));

    }
}
