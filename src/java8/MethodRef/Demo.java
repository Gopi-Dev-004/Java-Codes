package java8.MethodRef;
import java.util.function.Consumer;

public class Demo {
    // this using void method

    /*

    Method Reference
    == Instance method reference (Using class object)
    == Static method reference (Using class name)
    == Constructor method reference (Using new keyword)
     */
    public Demo(){
        System.out.println("Default Constructor ");
    }
    public Demo(int x){
        System.out.println("Constructor "+x);
    }

    public void method(int x){
        System.out.println("Method "+x);
    }
    public static void sMethod(int x){
        System.out.println("Static Method "+x);
    }
    public static void main(String[] args) {
        Demo obj=new Demo();
        Consumer<Integer> cons=obj::method;// this instance method reference
        cons.accept(50);

//        Consumer<Integer> cons=Demo::sMethod;// this static method reference
//        cons.accept(25);

//        Consumer<Integer> cons=Demo::new; // this is constructor method reference
//        cons.accept(40);
    }
}
