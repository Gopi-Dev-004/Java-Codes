package java8.Streams;

import com.sun.source.tree.Tree;

import java.lang.ref.SoftReference;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsMethods {

    public static void  tolist1(){
        String[] arr = {"Gopi", "Malai", "Mohan", "Raja", "Naveen"};
        List<String> list = Arrays.stream(arr)
                .collect(Collectors.toList());
        System.out.println(list);

    }

    public static void  toset1(){
        String[] arr = {"Gopi", "Gopi", "Mohan", "Naveen"};
        Set<String> set=Arrays.stream(arr)
                .collect(Collectors.toSet());
        System.out.println(set);
        Set s = Stream.of(1,2,34,5).collect(Collectors.toSet());
        System.out.println(s);
    }

    public static void toMap(){
        List<String> l = Arrays.asList("HI","HI","world");
        Map<String,Integer> map = l.stream().
                collect(Collectors.toMap(n->n, n-> n.length(),(old,ne)->old));
        System.out.println(map);
    }

    public static void  joining1(){
        String[] arr = {"Gopi", "Malai", "Mohan", "Raja", "Naveen"};
        String result = Arrays.stream(arr)
                .collect(Collectors.joining(" ","[","]"));
        System.out.println(result);

        String result2 = Arrays.stream(arr).
                collect(Collectors.joining(" ","[","]"));
        System.out.println(result2);
    }

    public static void  counting1(){

        Long count = Stream.of(1,2,3,4)
        .collect(Collectors.counting());
        System.out.println(count);

        Long c = Stream.of(1,2,3,4).count();

    }

    public static void summingInt1(){

       Integer sum =  Stream.of(1,2,3,4,5)
                .collect(Collectors.summingInt(x->x));
        System.out.println(sum);

        Integer sum2 =  Stream.of(1,2,3,4,5)
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum2);

    }

    public static void summingDuble(){

       double sum =  Stream.of(1,2,3,4,5)
                .collect(Collectors.summingDouble(Integer::intValue));
        System.out.println(sum);
    }

    public static void toList(){
       List<Integer> list= Stream.of(1,2,3,4,5,6)
                .collect(Collectors.toList());
        System.out.println(list);//[1, 2, 3, 4, 5, 6]

    }

    public static void toSet(){
      Set<String> names=  Stream.of("Gopi","Malai","Mohan","Raja","Gopi")//duplicated removed!!
                .collect(Collectors.toSet());
        System.out.println(names);//[Gopi, Raja, Mohan, Malai]
    }

    public static void joining(){
//      String word=  Stream.of("Gopi","is","a","Full Stack Developer")
//                .collect(Collectors.joining());
//        System.out.println(word);  //GopiisaFull Stack Developer

//        String word=  Stream.of("Gopi","is","a","Full Stack Developer")
//                .collect(Collectors.joining(" "));//separated by space
//        System.out.println(word);   ///Gopi is a Full Stack Developer

        String word=  Stream.of("Gopi","is","a","Full Stack Developer")
                //here we give start and end with what do you want
                .collect(Collectors.joining(" "," [","]"));
        System.out.println(word); //[Gopi is a Full Stack Developer]
    }

    public static void counting(){
       Long count=  Stream.of(1,2,3,4,5,6)
                .collect(Collectors.counting()); //how many values
        System.out.println(count); //6
    }

    public static void summingInt(){
        Integer sum=Stream.of(1,2,3,4,5)
                .collect(Collectors.summingInt(x-> x));
        System.out.println(sum);//15
    }

    public static void averagingInt(){
       Double avg = Stream.of(50,100,99)
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);//83.0
    }

    public static void summarizingInt(){
       IntSummaryStatistics avg = Stream.of(100,99,89,79,87,59)
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println(avg);//IntSummaryStatistics{count=6, sum=513, min=59, average=85.500000, max=100}
        System.out.println(avg.getMax());//100
        System.out.println(avg.getMin());//59
        System.out.println(avg.getAverage());//85.5
        System.out.println(avg.getSum());//the total is 513
        System.out.println(avg.getCount());// count 6

     IntSummaryStatistics s =   Stream.of(100,99,89,79,87,59)
             .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(s);
    }

    public static void groupingBY(){
//        Map group = Stream.of("Gopi","Malai","Vishnu","Mohan","Raja","Ravi")
//                .collect(Collectors.groupidngBy(String::length));
//        System.out.println(group);
        //{4=[Gopi, Raja, Ravi], 5=[Malai, Mohan], 6=[Vishnu]}
     var res =   Stream.of("").map(s-> s.split(" "))
                .collect(
                        Collectors.groupingBy(s->s,Collectors.counting())
                );



        Map group = Stream.of("Gopi","Gopi","Malai","Vishnu","Mohan","Raja","Ravi")
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));//downStream
        System.out.println(group);//here Duplicats is removed
        //{4=[Gopi, Raja, Ravi], 5=[Mohan, Malai], 6=[Vishnu]}
    }

    public static void partitioning(){
//       Map n= Stream.of(1,2,3,4,5,6,7,7)
//                .collect(Collectors.partitioningBy(x-> x%2==0));
//        System.out.println(n);
        //{false=[1, 3, 5, 7, 7], true=[2, 4, 6]}

//        Map n= Stream.of(1,2,3,4,5,6,7,7).
//                .collect(Collectors.partitioningBy(x-> x%2==0));
//        System.out.println(n);

    }

    public static void mapping(){
      List l =  Stream.of("A","Bddd","Cd","Dd")
                .collect(Collectors.mapping(String::length , Collectors.toList()));
        System.out.println(l);//[1, 4, 2, 2]

        List l2 = Stream.of("Malai","Guru","Ravi").toList();
        List l3 = Stream.of("Malai","Guru","Ravi").collect(Collectors.toList());
        Set l4 = Stream.of("Malai","Guru","Ravi").collect(Collectors.toSet());

    }

    public static void collectngAndThen(){
       int s = Stream.of("Gopi","Namven","Ravi","Mohan","Vishnu")
                .collect(Collectors.collectingAndThen(Collectors.toSet(),Set::size));
        System.out.println(s);

       Set l = Stream.of("Gopi","Namven","Ravi","Mohan","Vishnu")
                .collect(Collectors.collectingAndThen(Collectors.toSet(),Collections::unmodifiableSet));
    }

    public static void toMap1(){
        List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai");
      Map<String,Integer>  result =name.stream()
                .collect(Collectors.toMap(x->x,x->x.length()));
    System.out.println(result);

    }

    public static void toMap2(){

    List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai","Ema","Mano");
   Map<Character,String> result = name.stream()
            .collect(Collectors.toMap(x->
                    x.charAt(0),x->x,(oldobj,newobj)->oldobj+", "+newobj));
    System.out.println(result);

}

    public static void toMap3(){

    List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai","Ema","Mano");
   Map<Integer,String >  result = name.stream()
            .collect(Collectors.toMap(x->x.length(),
                    x->x,(old,ne)->old+" "+ne,LinkedHashMap::new));
    System.out.println(result);

}

    public static void collect1(){
    List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai","Ema","Mano");
 List<String> r =  name.stream()
           .filter(x-> x.length()>4)
           .collect(Collectors.toList());
    System.out.println(r);

    }

    public static void toCollect1(){
        //we can choose won collection type like queue vector
    List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai","Ema","Mano");
 Set<String> r =  name.stream()
         .collect(Collectors.toCollection(LinkedHashSet::new));
    System.out.println(r);

    }

    public static void group1(){
        List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai","Ema","Mano");
        Map<Integer,Long> r =  name.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(r);
    }

    public static void mapping1(){
        List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai","Ema","Mano");
      List<Integer> r =   name.stream()
                .collect(Collectors.mapping(String::length,Collectors.toList()));
        System.out.println(r);
    }

    public static void mappingWithGrupping(){
        List<String> name = Arrays.asList("Gopi","Mohan","Ezhumalai","Ema","Mano");
      Map r =   name.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.mapping(x->x.charAt(0),Collectors.toList())));
        System.out.println(r);
    }

    public static void colectAndThen1(){
        List<Integer> name = Arrays.asList(1,23,3,45);
         int x= name.stream()
                .collect(Collectors.collectingAndThen(Collectors.maxBy(Integer::compareTo), Optional::get));

    }

    public static void maxBy(){

       Optional m = Stream.of(1,4,7).collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(m.get());

        Optional min = Stream.of(1,4,7).collect(Collectors.minBy(Integer::compareTo));
        System.out.println(m.get());

        Stream.of(1,4,7).max(Integer::compareTo);
    }

    public static void reducing(){
        int r = Stream.of("Hi","mani").
                collect(Collectors.mapping(String::length,
                        Collectors.reducing(0,(x,y)->x + y )));
        System.out.println(r);
    }


   public static void main(String[] args) {
        reducing();
//        maxBy();
//        summarizingInt();
//        joining1();
//        toMap();
//        toset1();
//        mapping1();
//        group1();
//        toCollect1();
//        collect1();
//        toMap3();
//        toMap2();
//        toMap1();
//        mapping();
//        partitioning();
//        groupingBY();
//        summarizingInt();
//        averagingInt();
//        summingInt();
//        counting();
//        joining();
//        toSet();
//        toList();
    }
}
