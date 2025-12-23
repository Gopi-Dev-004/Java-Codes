package ComparableAndComparator;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int Id;
    String name;
    int _class;
    char grad;

    public Student(int id, String name, int _class, char grad) {
        Id = id;
        this.name = name;
        this._class = _class;
        this.grad = grad;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student[" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", _class=" + _class +
                ", grad=" + grad +
                "]\n";
    }

    @Override
    //id based sorting
//    public int compareTo(Student o) {
//        if(this.Id>o.Id){
//            return 1;
//        } else if (this.Id<o.Id) {
//            return -1;
//        }
//        return 0;
//    }
    //grade based sorting
//    public int compareTo(Student o) {
//        if(this.grad>o.grad){
//            return 1;
//        } else if (this.grad<o.grad) {
//            return -1;
//        }
//        return 0;
//    }
    //for comparing string
    //name based sorting
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

public class Std  {
    public static void main(String[] args) {
        ArrayList std=new ArrayList();
//        Student s1=new Student(100,"gopi",1,'A'););
//        std.add(new Student(103,"Raja",1,'A'));
        std.add(new Student(100, "Gopi", 1, 'D'));
        std.add(new Student(101,"Mano",1,'B'));
        std.add(new Student(102,"Malai",1,'A'));
        std.add(new Student(105,"Siva",1,'C'));
        std.add(new Student(106,"Mohan",1,'A'));
        std.add(new Student(104,"Naveen",1,'A'));
        Comparator<Student> forname= (s1,s2)->s1.name.compareTo(s2.name);
        Comparator<Student> forgrad= (s1,s2)->s1.grad-s2.grad;
        Collections.sort(std,forname);
        System.out.println("sort by name\n");
        System.out.println(std);
        Collections.sort(std,forgrad);
        System.out.println("sort by grad\n");
        System.out.println(std);
//        System.out.println();
//        Collections.sort(std);
//        System.out.println(std);

    }

}
