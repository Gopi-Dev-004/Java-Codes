package Collection1.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet();

//        hs.add(30);
//        hs.add(50); hs.add(50); hs.add(50);// duplicates are overrided or removed
//        hs.add(70);
//        hs.add(null);
//        hs.add(null);//overided
        hs.add("gopi");
        hs.add("achu");
        hs.add("malai");
//        System.out.println(hs.remove(50));//true
//        System.out.println(hs.remove("Gopi"));//false
//        System.out.println(hs.removeAll(hs));
//        System.out.println(hs.retainAll(hs));
//        System.out.println(hs.isEmpty());
//        System.out.println(hs.size());
        System.out.println(hs);
        Iterator i=hs.iterator();
        while(i.hasNext()) {
//            System.out.println(i.next());
            String str=i.next().toString();
            if(str.equals("achu")){
                i.remove();
//                i.remove();//illegal eqal statemet exception
            }
        }
        System.out.println(hs);
        System.out.println(".............");
        for(String  ss : hs){
            System.out.println(ss);
        }
        System.out.println(hs);
    }
}
