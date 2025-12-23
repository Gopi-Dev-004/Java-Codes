package Collection1.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcornentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap m=new ConcurrentHashMap();
        //defind in import java.util.concurrent.ConcurrentHashMap;
        //each buckert is synchronized
        // perfmance is very fast
        // null key and values are not allowed
        // it doesn't maintain insertion order
        //hashtabel (array+linkedlist)
        //default capacity 16

        //The main advantage of concurent hashmap is it allow insertion or deletion
        //at the time of iteration but hastable is return concorent modification exception
    // hashtable --- when ocour concourexpiton
        //concurethashmap --- when  not accour concurn modificaion exception
    }
}
