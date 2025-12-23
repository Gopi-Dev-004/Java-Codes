package Collection1.Map;

import java.util.LinkedHashMap;

public class LHM {
    public static void main(String[] args) {
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put(1,"Gopi");
        lhm.put(2,"Malai");
        lhm.put(3,"Mohan");
        System.out.println(lhm);
//        lhm.put(1,"Reo");
        lhm.put(4,"Reo");
//        System.out.println(lhm);
//        lhm.putFirst(12,"put first");
//        System.out.println(lhm);
//        lhm.putLast(0,"put last");
//        System.out.println(lhm);
//        lhm.put("12",35);
//        System.out.println(lhm);
        //if the key is already exist not add object and return that existing values
        //if the key is not exist then add the object and return null
        System.out.println(lhm.putIfAbsent("200","put if absend"));
//        lhm.clear();//remove all entrys

//        System.out.println(lhm);
//        lhm.remove(1);
//        System.out.println(lhm.remove(1));
//        System.out.println(lhm.remove(224,"Gopis"));
        System.out.println("-------------");
        System.out.println(lhm.entrySet());
//        System.out.println(lhm.values());
//        System.out.println(lhm.pollFirstEntry());
//        System.out.println(lhm.pollLastEntry());
//        lhm=null;
        System.out.println(lhm.firstEntry());
        System.out.println(lhm.lastEntry());
        System.out.println(lhm.keySet());
        System.out.println(lhm.sequencedKeySet());
//        System.out.println(lhm.);


        System.out.println(lhm);


    }
}
