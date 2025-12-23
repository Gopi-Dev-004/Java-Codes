package CollectionsMethods;

import  java.util.*;

public class CollectionMathodsPractice {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
//        al.add(Arrays.asList(10,20,50,50,28,60,70));//
        List<Integer> l=Arrays.asList(10,20,50,50,28,60,70);
        ArrayList al=new ArrayList(l);

        System.out.println(al);//[[10, 20, 50, 50, 28, 60, 70]]
//        Collections.sort(al);
//        System.out.println(al);//after sort [10, 20, 28, 50, 50, 60, 70]
//        Collections.sort(al,Comparator.naturalOrder());
//        System.out.println(al);
//        Collections.sort(al,Comparator.reverseOrder());
//        System.out.println(al);
//
//        Collections.sort(al);
//        System.out.println(al);//[10, 20, 28, 50, 50, 60, 70]
//        Collections.reverse(al);//desending order
//        System.out.println(al);//[70, 60, 50, 50, 28, 20, 10]

//        Collections.max(al);
//        System.out.println(Collections.max(al));//max 70
//        System.out.println(Collections.min(al));//min 10
//
//          Collections.binarySearch(al,20);  ///[10, 20, 50, 50, 28, 60, 70]
//        System.out.println(Collections.binarySearch(al,20));//1
//        System.out.println(Collections.binarySearch(al,39));//-3
//        System.out.println(Collections.binarySearch(al,5));//-1
//        System.out.println(Collections.binarySearch(al,100));//-8

//        Collections.synchronizedCollection(al);
//
//       List dumy= Collections.unmodifiableList(al);
//        dumy.set(1,800);//UnsupportedOperationException

////        System.out.println(al);
//        ArrayList al2=new ArrayList();
//        al2.add(500);
//        Collections.copy(al,al2);//[10, 20, 50, 50, 28, 60, 70]
//        System.out.println(al);//[500, 20, 50, 50, 28, 60, 70]
//
//        Collections.nCopies(9,al);
////        System.out.println(al);

//        Collections.shuffle(al);//suffle the element
////        System.out.println(al);//[50, 60, 28, 20, 70, 50, 10]
//        Collections.fill(al,29);
//        System.out.println(al);//[29, 29, 29, 29, 29, 29, 29]

//        Collections.frequency(al,50);//[10, 20, 50, 50, 28, 60, 70]
//        System.out.println(Collections.frequency(al,50));//2
//        System.out.println(Collections.frequency(al,100));//0
//
//Collections.addAll(al,7,1,2,3,4);
//        System.out.println(al);
//
//        Collections.rotate(al,1);//
//        System.out.println(al);


    }
}
