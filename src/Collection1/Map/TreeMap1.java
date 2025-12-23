package Collection1.Map;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        //in key nupll not allowed but in values allowed
        //internally use Red Block Tree (Self Balancing BST)
        //nalural oedering or custom comparator
        // key must be generic or homongeneous
        //other wise class exception
        tm.put("malai",55);
        tm.put("a",55);
        tm.put("b",55);
        tm.put("c",5);
        tm.put("d",15);
        tm.put("e",32);
        tm.put("mani",25);
        tm.put("race",235);
        tm.put("achu",2233);

        System.out.println(tm);
//        tm.putFirst("aaaaaa",34);//throws unsupported operation exception
        //gets
//        System.out.println(tm.get("malai"));
//        System.out.println(tm.getOrDefault("mala",0));
        // contains check
//        System.out.println(tm.containsKey("achu"));
//        System.out.println(tm.containsValue(25));
        //special methods
//        System.out.println(tm.firstEntry());
//        System.out.println(tm.lastEntry());
//        System.out.println(tm.ceilingEntry(3));//class cast exception bcoz 3 is number but key is tring
//        System.out.println(tm.ceilingEntry("g"));// g next m , if g is present the return g
//        System.out.println(tm.floorEntry("g")); //g before f ,if g is present the return g
//        System.out.println(tm.ceilingKey("g")); // return key
//        System.out.println(tm.floorKey("g")); //return key
//        System.out.println(tm.higherEntry("g")); //return g after m key ans value
//        System.out.println(tm.lowerEntry("c")); //return key c before b key and value
//        System.out.println(tm.lastEntry());
//        System.out.println(tm.firstEntry());
//        System.out.println(tm.keySet());
//        System.out.println(tm.values());
//        System.out.println(tm.entrySet());
        //sum maps

        System.out.println(tm.headMap("c"));//{a=55, achu=2233, b=55}
        System.out.println(tm.tailMap("m"));//{malai=55, mani=25, race=235}
        System.out.println(tm.subMap("a","c"));//{a=55, achu=2233, b=55}
        System.out.println(tm);

    }
}
