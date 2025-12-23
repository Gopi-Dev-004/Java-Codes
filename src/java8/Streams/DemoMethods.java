package java8.Streams;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

public class DemoMethods {
    //STATIC METHODS
    public static void of1(){
        Stream<String> s1 = Stream.of("Apple","bal","cat","dimand","elipand");//source flow
        Stream<String> s2 = s1.filter(x-> {return 3<x.length();});      //intermediate process
        s2.forEach(System.out::println);      //destination
    }
    public static void generate1(){
        Supplier<Double> sup=()->{ return (Math.random() *100)+1; };
        Stream<Double> s1=Stream.generate(sup).limit(10);
        Stream<Double> s2=s1.filter(x->x>50);
        Stream<Integer> s3=s2.map(x->x.intValue());
        s3.forEach(System.out::println);
    }
    public static void iterate1(){
        int n=2;
    Stream.iterate(1,x->x+1)
            .map(x->  x+" X " +n+" = "+(x*n))
            .limit(10).forEach(System.out::println);
    }
    public static void contcat1(){
        //pending
        Stream<String> s1 =    Stream.of("Hellow" ,"World" ,"Good" ,"Morning" );
        Stream<String> s2 = Stream.of("Hellow" ,"World" ,"Good" ,"Morning" );
        Stream<String> ss1 = s1.map(x-> x.toUpperCase());
        Stream<String> ss2 = s2.map(x -> x.toUpperCase()) ;
        Stream.concat(ss1,ss2)
                .forEach(System.out::println);
    }
    //INTERMEDIATED METHODS
    public static void filter1(){
        Stream.of(20,22,30,21,40,41,50)
                .filter(x -> x %2 == 0 )
                .forEach(System.out::println);

//        Stream.iterate(1,x -> x+1)
//                .filter(x -> x %2 !=0 && x<10)
//                .limit(10)
//                .forEach(System.out::println);
    }
    public static void map1(){
        Stream.of("Hellow" ,"World" ,"Good" ,"Morning" )
                .map(x -> "Name is : "+ x)
                .forEach(System.out::println);
    }
    public static void mapToInt(){
        Stream.of(2.3,5.43,3.54).mapToInt(x->x.intValue())
                .forEach(System.out::println);
    }
    public static void sorted1(){
        //natural sorting
//        Stream.of(10,20,5,15)
//                .sorted()
//                .forEach(System.out::println);
       // custom soring
        Stream.of(10,20,5,15).sorted((x,y)->y.compareTo(x))
//                .sorted((x,y)->x<y?1:x>y?-1:0)
                .forEach(System.out::println);
    }
    public static void distinct1(){
        Stream.of(1,1,2,2,3,3,4,5,2)
                .distinct()
                .forEach(System.out::println);
    }
    public static void useArray(){
        int[] arr ={1,5,3,2,5,6,7,5};
        Arrays.stream(arr).boxed()
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
    public static void subList(){
        //using flatmap
            List<Integer> l1= Arrays.asList(1,2,3,4,5);
            List<Integer> l2= Arrays.asList(6,7,8,9,10);
            List<Integer> l3= Arrays.asList(11,12,13,14,15);

            List<List<Integer>> subList = Arrays.asList(l1,l2,l3);
            subList.stream()
                    .flatMap(x-> x.stream().sorted())
                    .forEach(System.out::println);


    }
    public static void subList2(){
            //using map key value pair
        Map<Integer,String> m1=new HashMap();
        m1.put(1,"Gopi");
        m1.put(2,"malai");
        m1.put(3,"Moha");
        m1.put(4,"Raja");
        m1.put(5,"Ravi");

        Map<Integer,String> m2=new HashMap();
        m2.put(1,"Gopi");
        m2.put(2,"Gopi");
        m2.put(3,"Gopi");
        m2.put(4,"Gopi");
        m2.put(5,"Gopi");

        List<Map<Integer,String>> subMap=Arrays.asList(m1,m2);
        subMap.stream()
                .flatMap(x->x.keySet().stream())
                .sorted((a,b)-> a>b?-1:a<b?1:0)
                .forEach(System.out::println);

    }
    //TERMINAL METHODS
    public static void min1(){
        Integer[] nums={20,1,3,4,5};
        Optional<Integer> min = Arrays.stream(nums)
                .min((x,y)->x>y?1:x<y?-1:0);
        min.ifPresent(x -> System.out.println(x));

    }
    public static void max1(){

//      Integer[] nums={20,1,3,4,5};

        List<Integer> list= Arrays.asList(1,2,4,2,0,3);
        Optional<Integer> max= list.stream()
                .min((x,y)->x>y?1:x<y?-1:0);
                max.ifPresent(x-> System.out.println(x));
    }
    public static void toArray1(){
       List<String> list= Arrays.asList("one","tow","three");
        Object[] str =   list.stream()
                .toArray();
        System.out.println(Arrays.toString(str));


    }
    public static void subl(){
        String str = "java programming developer java programming deveop is is the";
     List<String>    res =  Stream.of(str)
                .flatMap(s ->
                        Arrays.stream( s.split(" ")))
                .distinct().toList();
        System.out.println(res);
    }
    public static void peekM(){
        List<String> name = Arrays.asList("Gopi","EzhuMalai","Achu","Ravi","Mohan Raj");
        name.stream().filter(x-> x.length()>4)
                .peek(x-> System.out.println(x))
                .map(String::toUpperCase)
                .peek(x-> System.out.println(x))
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
//        peekM();
//        subl();
//        of1();
//        generate1();
//        iterate1();
//        contcat1();
//        filter1();
//        map1();
//        mapToInt();
//        sorted1();
//        distinct1();
//        useArray();
//        subList();
//        subList2();
//        min1();
//        max1();
//        toArray1();


    }
}
