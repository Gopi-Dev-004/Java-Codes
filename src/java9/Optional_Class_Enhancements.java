package java9;

import java.util.Optional;

public class Optional_Class_Enhancements {

    public static void main(String[] args) {
//        ifPresentOrElse();
//        or();
        stream();
    }

    public static void ifPresentOrElse(){
        Optional op = Optional.ofNullable(null);

        op.ifPresentOrElse(v-> System.out.println(v),()-> {
            System.out.println("The value is not present ");

            for(int i=0; i<5; i++){
                System.out.println(i);
            }

        });
    } // Execute different actions if null

    public static void or(){
        //--> we can give another optional value

        Optional<String> op = Optional.ofNullable(null);

        String v= op.or(()->Optional.ofNullable("Default name ")).get();
        System.out.println(v);
    }//Returns the alternate Optional if null

    public static void stream(){
        //Optional to convert  stream

        Optional op = Optional.ofNullable(null);
        op.stream().forEach(System.out::println); // nothing is happen

        Optional op2 = Optional.ofNullable("null");
        op2.stream().forEach(System.out::println);

    }//Convert Optional to Stream , it null do nothing


}
