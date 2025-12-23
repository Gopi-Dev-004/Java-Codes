package java8.OptionalClass;


import java.util.*;

class Student {
        Integer id;
        String name;
        String dep;
        public Student(){}
        public Student(Integer id, String name, String dep) {
            this.id=id;
            this.name=name;
            this.dep=dep;
        }
        public String toString(){
            return "ID :"+this.id +", Name : "+this.name +", dep : "+this.dep;
        }
}
 public class Ex{

    static  List<Student> students= Arrays.asList(
            new Student(100,"Malai","Cs"),
            new Student(101,"Mohan","DSA\uD83E\uDD29"),
            new Student(102,"Raja","IT"),
            new Student(103,"Naveen","DSA"),
            new Student(104,"Sridhar","Cs")
    );

    public static Optional<Student> getStdUsingId(Integer id){
        Student s=null;
        for(Student std : students){
            if(id== std.id){s=std;}
        }
        Optional<Student> optionalStudent = Optional.ofNullable(s);
        return  optionalStudent;
    }

     public static void main(String[] args) {
         System.out.println(students);
//         Optional<Student> std=getStdUsingId(101);
//         std.ifPresent(x-> System.out.println(x));
//         //
//         System.out.println(std.orElse(new Student()));




     }
 }
