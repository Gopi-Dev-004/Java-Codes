package java10;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Var_Variable {

    public static void main(String[] args) {
//        localVar();
//        inLoops();
//        inCollection();
//        inStream();
        inAnonymousClass();
    }

    public static void localVar(){

    var wish = "Hello world";
        System.out.println(wish);
    }

    public static void inLoops(){
        var list = List.of(1,2,3,4,5,6);
        for(var v : list){
            System.out.println(v);
        }
    }

    public static void inCollection(){
        var map = Map.of(1,"Gopi",2,"Malai");
        System.out.println(map);
    }

    public static void inStream(){
        var map = Map.of(1,"Gopi",2,"Ezhumalai");
       var result = map.entrySet().stream().collect(Collectors.partitioningBy(x-> x.getValue().length()<5));
        System.out.println(result);
    }

    public static void tryWithResource(){
        try(var f = new FileWriter("")){

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void inAnonymousClass(){

        var t = new Thread(){
            public void run(){
                System.out.println("Pro run...");
            }
        };
        t.start();
    }
}
