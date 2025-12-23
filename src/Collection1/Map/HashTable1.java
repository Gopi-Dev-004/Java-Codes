package Collection1.Map;
import java.util.Hashtable;
public class HashTable1 {
    public static void main(String[] args) {
        //legacy class, not allowd null key and values
        // hashtabel methods are synchronized
        //thred safe , slow
        // it dosen't maintain the insertion order
        //intesrnally (array +lindkedlist)
        //default capacity 11
        // same as hashmap but it is synchronized
        Hashtable ht=new Hashtable();
        ht.put(30,"java");
        ht.put(10,"pring");
        ht.put(50,"html");
        ht.put(60,"css");
//        ht.put(null,"css");//null pointer exception
//        ht.put(23,null);

        System.out.println(ht);


    }
}
