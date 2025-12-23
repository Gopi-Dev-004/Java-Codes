package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stu1  {
    int id;
    String name;
    String clas;

    public Stu1(int id, String name, String clas) {
        this.id = id;
        this.name = name;
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "Stu1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clas='" + clas + '\'' +
                '}'+"\n";
    }

//    @Override
//    public int compareTo(Stu1 o) {
//        return this.id-o.id;
//    }
//
//    public int compareTo(Stu1 o) {
//        return this.clas.compareTo(o.clas);
//    }
//    public int compareTo(Stu1 o) {
//        return this.name.compareTo(o.name);
//    }

    public static void main(String[] args) {
        ArrayList st=new ArrayList();
        st.add(new Stu1(20,"gopi","1 class"));
        st.add(new Stu1(201,"malai","1 class"));
        st.add(new Stu1(2,"mano","4 class"));
        st.add(new Stu1(10,"ravi","9 class"));
        st.add(new Stu1(40,"reo","6 class"));
        st.add(new Stu1(50,"sri","1 class"));
        System.out.println(st);
//        Collections.sort(st);
        System.out.println("Sort by ID :");
        Collections.sort(st,new SortBId());
        System.out.println(st);
        System.out.println("Sort by Name :");
        Collections.sort(st,new SortBName());
        System.out.println(st);

    }
}
class SortBId implements Comparator<Stu1> {
    public int compare(Stu1 o1,Stu1 o2){
        return o1.id-o2.id;
    }
}
class SortBName implements Comparator<Stu1> {
    public int compare(Stu1 o1,Stu1 o2){
        return o1.name.compareTo(o2.name);
    }
}
