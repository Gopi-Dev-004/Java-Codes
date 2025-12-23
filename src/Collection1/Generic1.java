package Collection;

//class Sample <G>{
//    G values;
//      void set(G val) {
//        this.values = val;
//    }
//    public G get(){
//        return values;
//    }
//
//    public void multipara(G... var){
//          for(G v: var){
//              System.out.print(" "+v);
//          }
//    }
//}

//class Sample <G,M>{
//    G values;
//    M values2;
//    void set(G val, M m) {
//        this.values = val;
//        this.values2= m;
//        System.out.println(values);
//        System.out.println(values2);
//    }
//    public G get(){
//        return values;
//    }
//
//    public void multipara(G... var){
//        for(G v: var){
//            System.out.print(" "+v);
//        }
//    }

import java.util.ArrayList;
import java.util.List;

////}   ///uperbounds
//class Sample<G extends Number> {
//
//
//    public void get(G... m){
//        for(Object a : m){
//            System.out.println(a);
//        }
//    }

//lower bounds
class Sample<G> {
    public Sample(G t){
        System.out.println(t);

    }
}
//    public void get(List<? super Integer> list){
//       // list.add();
//
//        for(Object a : list){
//            System.out.println(a);
//        }
//    }


public class Generic1 {
    public static void main(String[] args){
     Sample <Character> obj=new Sample<Character>('h');
//     obj.set(30,"HI");
//        System.out.println(obj.get());
//        obj.set("Gopi","hey");
//        System.out.println(obj.get());
//        obj.set(obj,"bu");
//        System.out.println(obj.get());
//        obj.multipara("gopi",123,20.32F,30.33D);

//        obj.get("gopu",);//string only

    }
}
