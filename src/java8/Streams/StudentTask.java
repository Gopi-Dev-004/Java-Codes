package java8.Streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
   private int id;
    private String name;
    private String dep;
    private double sub1;
    private double sub2;
    private double sub3;
    private double sub4;
    private double sub5;

    public Student(int id, String name,String dep, double sub1, double sub2, double sub3, double sub4, double sub5) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    public String getDep() {return dep;}

    public int getId() {return id;}

    public String getName() {return name;}

    public double getSub1() {
        return sub1;
    }

    public double getSub2() {
        return sub2;
    }

    public double getSub3() {
        return sub3;
    }

    public double getSub4() {
        return sub4;
    }

    public double getSub5() {
        return sub5;
    }
    public double getTotal(){
      return   sub1+sub2+sub3+sub4+sub5;
    }

    @Override
    public String toString() {
        return "[" +
                "dep='" + dep + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 +
                ", sub4=" + sub4 +
                ", sub5=" + sub5 +
                ']'+"\n\n";
    }
}

public class StudentTask {
    public static void t1(){
        int n = 150;
//       List r= students.stream()
//                .filter(x->{
//                    return  x.getSub1()>n && x.getSub2()>=n && x.getSub3()>=n &&   x.getSub4()>=n && x.getSub5()>=n;   })
//                .collect(Collectors.mapping(x-> { return  x.getDep()+" => "+x.getName()+"\n"; },Collectors.toList()));



//       String r = students.stream()
//                .filter(x->{
//                    return  x.getSub1()>n && x.getSub2()>=n && x.getSub3()>=n &&   x.getSub4()>=n && x.getSub5()>=n;  })
//                        .reduce("",(x,y)-> y.getDep()+" -> "+y.getName()+" \n "+ x,(s1,s2)->s1+s2);
//        System.out.println(r);

        String r = students.stream()
                .filter(x->{
                    return  x.getSub1()>n && x.getSub2()>=n && x.getSub3()>=n &&   x.getSub4()>=n && x.getSub5()>=n;  })
                .map(x-> x.getDep()+"->"+x.getName())
                .collect(Collectors.joining("\n"));
        System.out.println(r);

    }
    public static void t2(){
        int n = 70;
        Map<String,String> res =    students.stream()
                .collect(Collectors.groupingBy(student -> {
                    Double total = student.getTotal();
                    if(total>=950)
                        return " \n Excelent Mark";
                    else if(total>=800)
                        return "\n Very Good Mark";
                    else if(total>500)
                        return "\n Need To Improve";
                    else return "\n Bad";
                },Collectors.mapping(x-> x.getName(),Collectors.joining(" , ","[ "," ]"))));
        System.out.println(res);
    }
    public static void t3() {
        Map<String, String> r = students.stream()
                .collect(Collectors.groupingBy(
                        std -> std.getDep(),
                        Collectors.collectingAndThen(
                                Collectors.minBy(
                                        (x, y) -> (int) (x.getTotal() - y.getTotal())),
                                s -> s.get().getName())));
        System.out.println(r);

    }



    public static void main(String[] args) {
        t3();
//        t2();
//        t1();
    }
    static List<Student> students = Arrays.asList(
            new Student(101,"Malai","CS",193,180,198,197,199),
            new Student(102,"Gokul","CS",189,198,158,195,159),
            new Student(103,"Vinu","CS",198,190,118,167,139),
            new Student(104,"Vijai","BCA",148,166,198,97,139),
            new Student(105,"Ravi","BCA",198,66,198,197,139),
            new Student(106,"Arun","BCA",128,150,98,97,199),
            new Student(107,"jaga","IT",98,69,78,197,199),
            new Student(108,"Susi","IT",158,152,168,977,159),
            new Student(109,"Harish","MCA",98,100,198,107,199),
            new Student(110,"Ranjith","MCA",198,100,98,97,199)
    );


}

