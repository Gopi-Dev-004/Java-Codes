package Collection1.Map;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {

        //We can use key and values differen datatype no problem
        HashMap hm=new HashMap();
        HashMap hm2=new HashMap();

            hm2.put("mani","mani");
        // here we can specify the generic type
       // HashMap<Integer,String> hm2=new HashMap<>();
//
        hm.put(2,"gopi");
        hm.put('g',"345");
//        System.out.println(hm);// {2=gopi, g=345}
//        System.out.println( hm.hashCode());
//        //use key to get that values return null when given key not present in the obj
////       System.out.println(hm.get(2));
//        System.out.println(hm.get('g'));
//
//        System.out.println("gopi".hashCode());
//        System.out.println("gopi".hashCode());
//        System.out.println("A".hashCode());//65 assci value

        hm.put(2,"gopi");
        hm.put(5,"gopi");
        hm.put('h',"345");
        hm2.put('v',"345");
        hm2.put('s',"345");
        hm2.put('b',"345");
        hm.put(55,"malai");
        hm.put(56,"gopi");
        hm.put('l',"746");
        hm.put('j',"gopi");
        System.out.println(hm.size());
        System.out.println(hm.get("key"));
        Object o= hm.clone();
        //we can copy the object
        System.out.println(o);
        //return the all values
        System.out.println(hm.values());
        //The set key method return the all  key
        System.out.println(hm.keySet());
        System.out.println();
        //check the given key is present in the hm obj . return true or false
        System.out.println(hm.containsKey('z'));
        //check the given obj is present in the hm onj return true or false
        System.out.println(hm.containsValue("gopi"));
        //remove obj based on key return removed value. return null when given values is not preset in hm obj
//        System.out.println(hm.remove('g'));
        //remove the onj based on key and value  return true when the key and obj is correct
        // return false when unmached return null when empty give empty values
//        System.out.println(hm.remove('c',"gpi"));
    // return key and values same has printin hm object
        System.out.println(hm.entrySet());
        System.out.println(hm.getOrDefault('j',""));
//        System.out.println(hm.computeIfAbsent('j',"");
        System.out.println(hm);
        hm.putAll(hm2);
        hm2.putAll(hm);
        System.out.println(hm);
        System.out.println(hm2);



    }
}

