package ComparableAndComparator;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class SortBYId implements Comparator<Emps>{
    @Override
    public int compare(Emps o1 ,Emps o2){
        return o1.Id-o2.Id;
    }
}
class SortByName implements Comparator<Emps>{
    @Override
    public int compare(Emps o1 ,Emps o2){
        return o1.name.compareTo(o2.name);
    }
}
class SortBYClass implements Comparator<Emps>{
    @Override
    public int compare(Emps o1 ,Emps o2){
        return o1._class-o2._class;
    }
}
class SortBYGrad implements Comparator<Emps>{
    @Override
    public int compare(Emps o1 ,Emps o2){
        return o1.grad-o2.grad;
    }
}

class Emps implements Comparator<Emps> {
    int Id;
    String name;
    int _class;
    char grad;

    public Emps(int id, String name, int _class, char grad) {
        Id = id;
        this.name = name;
        this._class = _class;
        this.grad = grad;
    }

    public Emps() {
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
  public int compare(Emps o1, Emps o2) {
        return o1.Id-o2.Id;
    }
}

public class Emp  {
    public static void main(String[] args) {
        ArrayList std=new ArrayList();
//        Student s1=new Student(100,"gopi",1,'A'););
//        std.add(new Student(103,"Raja",1,'A'));
        std.add(new Emps(100, "Gopi", 1, 'D'));
        std.add(new Emps(101,"Mano",3,'B'));
        std.add(new Emps(102,"Malai",12,'A'));
        std.add(new Emps(105,"Siva",4,'C'));
        std.add(new Emps(106,"Mohan",5,'A'));
        std.add(new Emps(104,"Naveen",20,'A'));
        System.out.println("without sort");
        System.out.println(std);
        System.out.println("--------------");

        System.out.println("Sort by Id");
        Collections.sort(std,new SortBYId());
        System.out.println(std);
        System.out.println("--------------");

        System.out.println("Sort by Name");
        Collections.sort(std,new SortByName());
        System.out.println(std);
        System.out.println("--------------");

        System.out.println("Sort by Class");
        Collections.sort(std,new SortBYClass());
        System.out.println(std);
        System.out.println("--------------");

        System.out.println("Sort by Grad");
        Collections.sort(std,new SortBYGrad());
        System.out.println(std);
    }

}

