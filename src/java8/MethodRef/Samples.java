package java8.MethodRef;

import Collection1.Map.S;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.function.*;

public class Samples {
    public boolean isPositive(int x){
        return x>0;
    }// predicate
    public boolean isEquals(int x, int y){return x==y;}//BiPredicate
    public void displayItems(String s){
        System.out.println(s);
    }//Consumer
    public void displayTwoItems(String s1, String s2){
        System.out.println(s1+" "+s2);
    }//BiConsumer
    public String welMeasage(){return "Welcome to java world";}//suppler
    public float addition(int x, int y){return x+y;} //BiFunction
    public float add10(int x){return x+10; }//Function

    public static void main(String[] args) {
        Samples sam=new Samples();

        Predicate<Integer>  pre1=sam::isPositive;
        boolean b1=pre1.test(350);
        System.out.println(b1);

        BiPredicate<Integer,Integer> pre2 = sam::isEquals;
        boolean b2= pre2.test(20,30);
        System.out.println(b2);

        Consumer<String> cons1=sam::displayItems;
        cons1.accept("Hari goukul");

        BiConsumer<String, String> cons2=sam::displayTwoItems;
        cons2.accept("hari","gougl");

        Supplier<String> sub=sam::welMeasage;
        String wel=sub.get();
        System.out.println(wel);

        Function<Integer,Float> f2=sam::add10;
        float x=f2.apply(20);
        System.out.println(x);

        BiFunction<Integer,Integer,Float> fun1=sam::addition;
        float f=fun1.apply(20,30);
        System.out.println(f);




    }

}
