package SingletonPattern;

class LazyInitialization {
    /*
    The singleton pattern is a design pattern that ensures.
    1. Only one is instance of a class is created
    2. That single instance is globally accessible throughout the program.
    When use it:
    ---> Useful when exactly one object is needed to coordinate actions across a system.
    How use:
    ---> Private constructor ---> for prevents creating object from outside.
    --->Static instance ---> store the single object.
    ---> Public static method ---> gives a global access point to that object.

    Types :
    They are some type of singleton pattern
    1.lazy initialization
    2.Eager initialization

     */

    //Example for lazy initialization

    //step 1 : Create a private statisc sinstance of the class
    private static LazyInitialization instance;
    //step 2 : Make constructor private so no one can create object outside
    private LazyInitialization(){
        System.out.println("This is lazy initialization of singleton pattern.");
    }
    //step 3 : Provide a public static method to get the instance

    public static LazyInitialization getInstance(){
        if(instance==null){
            instance =new LazyInitialization();
        }
        return instance;
    }

    public void show(){
        System.out.println("This is singleton pattern");
    }

}
public class Lazy{
    public static void main(String[] args) {
    LazyInitialization obj1=LazyInitialization.getInstance();
    LazyInitialization obj2=LazyInitialization.getInstance();
    obj1.show();
        System.out.println(obj1==obj2);
    }
}
