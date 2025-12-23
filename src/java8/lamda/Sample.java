package java8.lamda;


import java.util.function.*;

public class Sample  {

    public static void main(String[] args) {
//        Thread s=()->{
//            System.out.println("Thread is running....");
//        };
//        s.start();

//        //boolean test(T t);
//        Predicate<Integer > p1=a1->{ System.out.println(a1);return a1>20;};
//        p1.test(10);
//
//        //public interface BiPredicate<T, U>, boolean test(T t, U u);
//        BiPredicate<String, Integer> bp= (a,b)-> {return a.length()>18;};
//        System.out.println(bp.test("Gopi",19));

        //public interface Consumer<T> , void accept(T t);
        Consumer<String> c1=a1->{System.out.println(a1.length()>8);};
             c1.accept("mr.gopi0000@gmail.com");

        //public interface BiConsumer<T, U> ,   void accept(T t, U u);
        BiConsumer<String , String > bc= (a1,a2)-> {
            System.out.println(a1+a2);
        };
        bc.accept("Gopi","Gopal");

        //public interface Function<T, R> ,  R apply(T t);
//                 BiFunction<Integer,String> f1=(a1 )->{ return a1+""; };

        //
    }
}
