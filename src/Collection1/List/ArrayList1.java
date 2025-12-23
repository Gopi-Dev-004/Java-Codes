package Collection1.List;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List al=new ArrayList();
        al.size();
        al.add(20);//add new element int al
        al.add("String");// It suport the homongeneous and herogeneous elements
        al.add(0,10);//suport index besed insertion add
        List al2=new ArrayList(Arrays.asList(1,2,3));
        Set set1=new HashSet(Arrays.asList(1,2,3));
        al.addAll(al2);//add another collection object in end
        al.add(set1); //we can add another objects like set but it store single index like this [10, 20, String, 1, 2, 3, [1, 2, 3]]
        al.addFirst(1);//add first index
        al.addLast(1000);// add last index
//        al.remove("String");//object based delete
//        al.remove(1);//index based delete
//        System.out.println(al);
//        al.removeFirst(); //remove 0 index element
//        al.removeLast(); //remove last index element
//        al.removeAll(al2);
//        al.removeIf(); // remove based on conditions
//        al.set(0,"first");//update element using index based only
//        al.clear(); //remove or delete all elements  in arraylist
//        System.out.println( al.contains("gopi"));//check if the value is present or not
//        System.out.println(al.containsAll(al2));// check object contain all object in another
//        System.out.println(al.equals(al2));//chick two object are equals or not
//        al2.clear();
//        System.out.println(al2);
//        al2.addAll(al);
//        System.out.println(al2);
//        System.out.println(al);
//        System.out.println(al.equals(al2));
//        al.clear();
//        al.get(0);//index out of bounds exception
//        al.getFirst();//no such element exception
//        al.getLast();
//        System.out.println(al);
//        System.out.println(al2);
//        al.retainAll(al2);// it remove all element and store element the same element in al and al2
//        al.toArray();// conver a arraylist into narmal array
//        for(Object o : al.toArray()){
//            System.out.println(o);
//            al.add(200); //added elemet end
//            al.remove(0); //removed element
//        }
        ArrayList ss=new ArrayList(Arrays.asList("String","Gopi"));
        System.out.println(ss);
        System.out.println(ss.size());
        ss.reversed();
        System.out.println(ss);

        ListIterator it=ss.listIterator();
        while(it.hasNext()){
            String s= it.next().toString();
            if(s.equals("String"))
            {
                it.remove();
                it.add(40);
            }
        }
        System.out.println(ss);
    }
}
