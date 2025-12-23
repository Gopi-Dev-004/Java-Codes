package SingletonPattern;

public class Eager {
    /*
    The Eager initialization create object at the time of class loading
    Adv:
    very simple, no synchronization issues.
    Deadv:
    Instance is created even if not used ...so waste of resources.


     */

    public static void main(String[] args) {
        EagerInitial obj1=EagerInitial.getInstance();
        EagerInitial obj2=EagerInitial.getInstance();
        obj1.show();;
        System.out.println(obj1==obj2);
    }
}
class EagerInitial{
    // instance create at the class loading time
    private static final EagerInitial instance=new EagerInitial();
    private EagerInitial(){
        System.out.println("Eager initialization is created successfully");
    }
    public static EagerInitial getInstance(){
        return instance;
    }
    public void show(){
        System.out.println("This Eager initialization");
    }
}
