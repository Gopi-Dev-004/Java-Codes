package java8.MethodRef;

import java.util.function.*;

//Constructor method reference
public class Student {
    int id;
    String fName;
    String lName;

    public Student(){}
    public Student(int id){this.id=id;}
    public Student(String fName){this.fName=fName;}
    public Student(String fname, String lName){this.fName=fname; this.lName=lName;}

    @Override
    public String toString() {
        return "Student{" +", id=" + id +
                "  fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Student std=new Student();


//        Supplier<Student> sud = ()-> {return new Student();};
//        System.out.println(sud.get());
        Supplier<Student> s=Student::new;
        System.out.println(s.get());
//
//        Function<String, Student> stu1=(fname)->new Student(fname);
//        System.out.println(stu1.apply("Vinu"));
//        Function<String, Student> s=Student::new;
//        System.out.println(s.apply("Vijai"));

//        BiFunction<String,String,Student> sud2 = (fname,lname)->{return new Student(fname,lname); };
//        System.out.println(sud2.apply("Gokul","Hari"));
//        BiFunction<String,String,Student> s=Student::new;
//        System.out.println(s.apply("gokul","Hari"));


    }

}
