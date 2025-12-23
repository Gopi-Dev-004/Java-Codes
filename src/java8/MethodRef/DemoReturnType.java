package java8.MethodRef;

import javax.sound.midi.Soundbank;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class DemoReturnType {
    public DemoReturnType(){
        System.out.println("Default method");
    }

    public int gets(){
        return 3;
    }
    public static int sGets(){
        return  5;
    }

    public static void main(String[] args) {

        // this is using instance with return type
//        DemoReturnType obj=new DemoReturnType();
//        Supplier<Integer> sub=obj::gets;
//        int n= sub.get();
//        System.out.println(n);

        // this is using static with return type
//        Supplier<Integer> sub=DemoReturnType::sGets;
//        int n = sub.get();
//        System.out.println(n);

        //this is using constructor return type
//         the constructor create object and  return that objects
        Supplier<DemoReturnType> sub=DemoReturnType::new;
        DemoReturnType obj= sub.get();
        obj.gets();

    }
}
