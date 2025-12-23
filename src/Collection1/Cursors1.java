package Collection;
import java.util.*;

public class Cursors1 {
    /*
    * Cursors:
    *
    * Iterator

Iterator allows forward  traversal of a Collection.
Iterator can be used with any Collection like List, Set,Queue or Map.
Iterator() of Iterable interface.
We cannot have add and replace methods.
We cannot get index.


ListIterator

ListIterator can be used with List interface only.
listIterator() of List interface.
We can have add and replace methods.
We can get index.

SplitIterator (Java8)

SplitIterator allows forward traversal of the Collection(split for parallel processing).
SplitIterator can be used most Collections.
splitIterator() of Collection.
We cannot have add and replace methods.
We cannot get index.
    *
    * >>>Courser are used to traverse
    * >>>They are 3main types of cursors in java.
    *
    * 1. Iterator
    * 2. ListIterator
    * 3. Enumuratrion
    *
    * Iterator  (Work with all collection class )Iterator() og Iterable -can read and remove
    * Direction : Forward only
    * Methods :
    * hasNext() -check if element is present
    * next() -get the element
    * remove() - remove element while iterating
    *
    *
    * ListIterator (Work with list interface subclass) LI() of list -can read remove set and add.
    * (only for arraylist and linkedlist)
    * Direction: both forwwward and backward
    *Methods:
    * hasnext, next hasprevious previous add remove set
    *
    *
    * Enumeration(old it work with legacy class )
    * (work with like..vector and stack)
    * Direction : forward only
    * Methods :
    * hasmoreElements(), and nextElement()
    * */


    public  void m1(){
        ArrayList <String> al= new ArrayList <String> ();
        al.add("gopi");
        al.add("vijai");
        al.add("kumar");
        al.add("naveen");
        al.add("malai");
        al.add("mano");
        al.remove("naveen");
        al.remove(1);
        al.set(0,"Gay");
        System.out.println(al); //The normal way to print all element is in the object
    }

    public void m2(){
        //The Iterator method
        //it only read and add

        ArrayList <String> al= new ArrayList <String> ();
        al.add("gopi");
        al.add("vijai");
        al.add("kumar");
        al.add("naveen");
        al.add("malai");
        al.add("mano");
        Iterator <String> it= al.iterator();

        while(it.hasNext()){
            //al.remove(1);
            al.add("Hero");
            System.out.println(it.next());
            //it.remove("gopi");
        }
    }

    public void m3(){
        //using the for loop
        ArrayList <String> al= new ArrayList <String> ();
        al.add("gopi");
        al.add("vijai");
        al.add("kumar");
        al.add("naveen");
        al.add("malai");
        al.add("mano");
        al.remove("malai");
        for(int i=0;i<al.size();i++){
            if("kumar".equals(al.get(i))){ //we must be give the manipulations within the condition only in for loop//
                al.set(i,"Gopi");
            }
            al.set(1,"Guru");
            //al.add("Final"); loop run infinitily becoz it the new object is add repeately and same time size can be increase .
            //al.remove(1);
            System.out.println(al.get(i));
        }
    }

    public void m4(){
        ArrayList <String> al= new ArrayList <String> ();
        al.add("gopi");
        al.add("vijai");
        al.add("kumar");
        al.add("naveen");
        al.add("malai");
        al.add("mano");

        for(String s : al){
            //al.add("final");  we cannot modify the elements int For each Loop.
            //al.remove("gopi"); remove don't it
            System.out.println(s);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // here using cursors
    public void itr(){
        ArrayList al=new ArrayList();
        al.add("gopi");
        al.add("vijai");
        al.add("kumar");
        al.add("naveen");
        al.add("malai");
        al.add("mano");

        Iterator it=al.iterator();
    String use="kumar";
        while(it.hasNext()){
            Object str=it.next();
            if(use.equals(str)){
                it.remove();
            }
            System.out.println(it.next());
        }
    }

    //ListIterator
    public void listIte(){
        LinkedList ll=new LinkedList();
        ll.add("gopi");
        ll.add("vijai");
        ll.add("kumar");
        ll.add("naveen");
        ll.add("malai");
        ll.add("mano");

//        ListIterator li= ll.listIterator();
//        while (li.hasNext()){
//            li.add("Gys");
//           Object ob=li.next();
//            String str="gopi";
//            if(ob==(str))
//            li.remove();
//            System.out.println(li.next());
//        }
        ListIterator li= ll.listIterator(ll.size());
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
    public void enums(){
        Vector v=new Vector();
        v.add(12);
        v.add(30);
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }



    public static void main(String[] args){
Cursors1 obj=new Cursors1();
//obj.itr();
obj.listIte();
// obj.enums();
    }
}
