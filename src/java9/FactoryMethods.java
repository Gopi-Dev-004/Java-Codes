package java9;

import java.util.*;

public class FactoryMethods {

    public static void main(String[] args){
//        list();
//        set();
//        map();
        mapEntrys();

    }

    public static void list(){
        // -> more than  10 it take as var args  multiple elements otherwiese it take 10 only
        List list =  List.of(0,1,2,3,4,5,6,7,8,9,10,11);
        System.out.println(list);

    }

    public static void set(){
        // --> not order maintain
        Set set = Set.of(1,2,3,4,5,6,7,8,9,10,12);
        System.out.println(set);
    }

    public static void map(){
        // --> we can't add morthen 10  if you add use entry (d,v)
        Map map = Map.of(
          1,"Gopi",
          2,"Vinu",
          3,"Vijai"
        );
        System.out.println(map);

    }

    public static void mapEntrys(){
            // --> using ofEntry() method we can create multiple entry but Map.of() allow only 10
        Map map = Map.ofEntries(
                Map.entry(1,"vinu"),
                Map.entry(2,"Vijai"),
                Map.entry(3,"Malai"),
                Map.entry(4,"Gopal"),
                Map.entry(5,"Shathis"),
                Map.entry(6,"Sri"),
                Map.entry(7,"mano"),
                Map.entry(8,"Kavi"),
                Map.entry(9,"Sinu"),
                Map.entry(10,"Mani"),
                Map.entry(11,"Mani"),
                Map.entry(12,"Hari"),
                Map.entry(13,"Neve")
        );
        System.out.println(map);
    }


    
    
}
