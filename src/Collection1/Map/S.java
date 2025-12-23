package Collection1.Map;

import java.util.TreeMap;

class CustomcomInTM implements Comparable<CustomcomInTM> {
    int id;
    String name;

    public CustomcomInTM(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(CustomcomInTM o) {
//        return this.name.compareTo(o.name);
        return o.name.compareTo(this.name);
    }

    @Override
    public String toString() {
        return "CustomcomInTM{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}
public class S{
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put(new CustomcomInTM(12,"malai"),1);
        tm.put(new CustomcomInTM(13,"race"),1);
        tm.put(new CustomcomInTM(15,"achu"),1);
        tm.put(new CustomcomInTM(30,"bala"),1);
        tm.put(new CustomcomInTM(20,"guru"),1);
        System.out.println(tm);
    }
}