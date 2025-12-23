package CollectionTasks;

import java.util.ArrayList;

public class Empp implements Comparable<Empp>{
       static ArrayList<Empp> std = new ArrayList();
        int Id;
        String name;
        int _class;
        char grad;

        public Empp(int id, String name, int _class, char grad) {
            Id = id;
            this.name = name;
            this._class = _class;
            this.grad = grad;
        }

    @Override
    public String toString() {
        return "Empp{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", _class=" + _class +
                ", grad=" + grad +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
            
            if(this==obj) return true;
            else if (obj ==null || getClass()!=obj.getClass()) return false;
            Empp p=(Empp)obj;
        return   Id==p.Id && name.equals(p.name) && _class==p._class && grad==p.grad;
    }

    @Override
    public int compareTo(Empp o) {
        return 0;
    }

    public static void main(String[] args) {
            std.add(new Empp(100, "Gopi", 1, 'D'));
            std.add(new Empp(101, "Mano", 3, 'B'));
            std.add(new Empp(102, "Malai", 12, 'A'));
            std.add(new Empp(105, "Siva", 4, 'C'));
            std.add(new Empp(101, "Gopi", 1, 'D'));
//            for(Empp p1= std){

//
//            }

        }
    }