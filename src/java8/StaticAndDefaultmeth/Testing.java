package java8.StaticAndDefaultmeth;


@FunctionalInterface
interface Network{
    public static final String TYPE = "AIRTEL";
    public abstract void internet();
    default void details(){
        //not force to override in subclass.
    }
    static void details1(){
        //write common logic and use it in all subclasses
    }
    default void wifi(){
        System.out.println("Airtel wifi");
    }
}

interface Network2{
    default void wifi(){
        System.out.println("Jio wifi");
    }
}
class Airtel implements Network,Network2{
    public void internet(){
    }
    @Override
    public void details(){}
    public void wifi(){
        Network.super.wifi();
        Network2.super.wifi();
    }
}

public class Testing {
    public static void main(String[] args) {
        Network n1 = new Network(){
            public void internet(){
                System.out.println("bsnl network");
            }
        };
        //lambda syntax ()->{}
        Network n2 = ()->{
            System.out.println("bsnl network");
        };
    }
}


class Dummy{
    public static void m1(){}
}
interface Dummy1{
    public static void m1(){}
}
