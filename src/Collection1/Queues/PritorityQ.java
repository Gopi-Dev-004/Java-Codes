package Collection1.Queues;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PritorityQ {
    public static void main(String[] args) {
        PriorityQueue<Object> pq=new PriorityQueue();
        // low priority or heigh priority based
        pq.add(30); //add the element return boolean
        pq.add(50);
        pq.add(5);// second priority
        pq.add(1); //first priority
//        pq.add("pro");// class cast exception beze it the comparator or comparable internally sort the onjects so we must only homogeneous elements onl
//        pq.add("java");
//        pq.add("spring");
//        System.out.println( pq.peek());//return first element
//        pq.poll(); //remove first element
        System.out.println(pq.offer(50));
        System.out.println(pq);

    }

}
