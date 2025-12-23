package java8.FunctionalDefaultAndStaticMeth;

import java.util.function.*;
import java.util.stream.Stream;

public class InPredictInterface {
 public static void pre(){
     Predicate<Integer> p1= a->a>18;
     Predicate<Integer> p2= a->a<50;
//        boolean result= p2.and(p1).test(32);//true
//        boolean result= p2.or(p1).test(2);//true
     boolean result= p2.negate().test(2);//false
     System.out.println(result);
     Predicate<Integer> p= Predicate.isEqual(20);
     System.out.println(20);
 }
 public static void fun(){
//
//     Function<String,String>  f1= a-> a+" Hi";
//     Function<String,String>  f2= a-> " Java "+a;
//     Function<String,String> res=f1.andThen(f2);
//     System.out.println(res.apply("Gopal"));

//     Function<String,String>  f1= a-> a+" Hi";
//     Function<String,String>  f2= a-> " Java "+a;
//     Function<String,String> res=f1.compose(f2);
//     System.out.println(res.apply("Gopal"));

     Function<String,String> f1=Function.identity();
     f1.apply("vijay");
     Stream.of("malai","mani","ganesh").map(f1)
             .forEach(System.out::println);


 }
    public static void main(String[] args) {
       //pre();
        fun();

    }
}
