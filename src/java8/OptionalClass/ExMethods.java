package java8.OptionalClass;

import java.util.Optional;
import java.util.function.Supplier;

public class ExMethods {
    /*
    OPTIONAL CLASS:
---------------
-> Optional<T> is a container object introduced in Java 8 in the java.util package.
-> It may or may not contain a non-null value of type T.
-> It’s mainly used to avoid NullPointerException and make 
	null-handling more explicit.
-> Instead of returning null from a method,
	you return Optional.empty() or Optional.of(value).
-> Works well with streams.

Optional("hello")

Static Methods in Optional
--------------------------
1. Optional.empty()
> Returns an empty Optional.
example:
--------
Optional<String> op = Optional.empty();

2. Optional.of(value)

> Returns an Optional with the given non-null value. 
> Throws NullPointerException if value is null.
example :
---------
Optional<String> op = Optional.of("Hello");
op.get() // return given value

Optional<String> op = Optional.of(null);
op.get() // throws NullPointerException

3. Optional.ofNullable(value)

> Returns an Optional with the given value, or Optional.empty if value is null. 

Optional<String> op = Optional.ofNullable(name); 
op.get() // return given value

Optional<String> op = Optional.ofNullable(null); 
op.get() // return Optional.empty


non-static methods:
-------------------


Value Presence Check
--------------------
isPresent() -> boolean
isEmpty() -> java 11

Conditional Execution
---------------------
ifPresent(Consumer)

ex:
Optional<String> obj = Optional.ofNullable(null);
		// Consumer<String> ref = x -> System.out.println(x);
	
		obj.ifPresent(x -> System.out.println(x));



retrieve the value
------------------
get()
orElse(T)
orElseGet(Supplier)
orElseThrow(Supplier)

try 
		{ 
		    String name = obj.orElseThrow(()-> { throw new RuntimeException("No Data Found");});
		    System.out.println(name);
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}

Transformation
--------------
map(Function) 
filter(Predicate)

other methods
--------------
stream()
     */
    public static void main(String[] args) {

//=== Static methods
        //The empty method create object for Optional class
//        Optional<String> op=Optional.empty();
//        System.out.println(op);//Optional.empty
//        System.out.println(op.get());//NoSuchElementException

//        return optional with the given non-null value
//        Optional<String> op=Optional.of(null);
//        System.out.println(op);//NullPointerException
//        System.out.println(op.get());//NullPointerException
//
//        Optional<String> op=Optional.ofNullable(null);
//        System.out.println(op);//Optional.empty
//        System.out.println(op.get());//NullPointerException

//=== non static methods
////
//        Optional<String> op=Optional.ofNullable(null);
//        System.out.println(op);//Optional.empty
//        System.out.println(op.isPresent());//false

//
//        Optional<String> op=Optional.ofNullable("null");
//        System.out.println(op);//Optional[null]
//        System.out.println(op.isPresent());//true


//        Optional<String> op=Optional.ofNullable(null);
//        System.out.println(op);//Optional.empty
//        System.out.println(op.isEmpty());//true

//        Optional<String> op=Optional.ofNullable("hi");
//        System.out.println(op);//Optional[hi]
//        System.out.println(op.isEmpty());//false
//
         // if the element is present return it otherwise it is lazy don't work
//        Optional<String> op=Optional.ofNullable("hi");
//        System.out.println(op);//Optional[hi]
//        op.ifPresent(x-> System.out.println(x));//hi

//        Optional<String> op=Optional.ofNullable(null);
//        System.out.println(op);//Optional.empty
//        op.ifPresent(x-> System.out.println(x));//hi

//        Optional<String> op=Optional.ofNullable("HI");
//        System.out.println(op);//Optional.[HI]
//        System.out.println(op.orElse("default values"));//HI

//        Optional<String> op=Optional.ofNullable(null);
//        System.out.println(op);//Optional.empty
//        System.out.println(op.orElse("default values"));//default values
//
//        Optional<String> op=Optional.ofNullable("HI");
//        System.out.println(op);//Optional.[HI]
//        System.out.println(op.orElseGet(()-> "Unknown "));//HI
//
//        Optional<String> op=Optional.ofNullable("HI");
//        System.out.println(op);//Optional.[HI]
//        System.out.println(op.orElseGet(()-> "Unknown "));//Unknown

//
//        Optional<String> op=Optional.ofNullable(null);
//        System.out.println(op);//Optional.empty
//        System.out.println(op.orElseGet(()-> "Unknown "));//HI

//try {
//    Optional<String> op = Optional.ofNullable("HI");
//    System.out.println(op);//
//    String s=op.orElseThrow( ()->{ throw new RuntimeException("my exception");});
//    System.out.println(s);
//}catch (Exception e){
//    System.out.println(e.getMessage());
//}


//        try {
//            Optional<String> op = Optional.ofNullable(null);
//            System.out.println(op);//Optional.empty
//            String s=op.orElseThrow( ()->{ throw new RuntimeException("the str is null");});
//            System.out.println(s);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        Optional<String> op = Optional.ofNullable("Ezhumalai");
//        System.out.println(op);//Optional[Ezhumalai]
//        Optional op2= op.map(x->x.toUpperCase());
//        System.out.println(op2);//Optional[EZHUMALAI]
//        Optional op3= op2.map(x->"HI"+x);
//        System.out.println(op3);//Optional[HIEZHUMALAI]
//        op3.ifPresent(x-> System.out.println(x));//HIEZHUMALAI

//        Optional<String> op = Optional.ofNullable(null);
//        System.out.println(op);//Optional.empty
//        Optional op2= op.map(x->x.toUpperCase());
//        System.out.println(op2);//Optional.empty
//        Optional op3= op2.map(x->"HI"+x);
//        System.out.println(op3);//Optional.empty
//        op3.ifPresent(x-> System.out.println(x));//HIEZHUMALAI

        Optional<String> op = Optional.ofNullable(null);
        System.out.println(op);//Optional.empty
        Optional op2= op.map(x->x.toUpperCase());
        System.out.println(op2);//Optional.empty
        Optional op3= op2.map(x->"HI"+x);
        System.out.println(op3);//Optional.empty
        op3.ifPresent(x-> System.out.println(x));//HIEZHUMALAI









    }
}
