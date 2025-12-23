package CollectionTasks;

import java.util.HashMap;
import java.util.Map;

public class FindArrDupUseMap {
    public static void main(String[] args) {
        Object[] arr={"Malai","Mano","Mani","Malai","Ram","Mani"};
        Map<Object,Integer> map=new HashMap();
        for(Object o : arr){
            map.put(o,map.getOrDefault(o,0)+1);
        }
        System.out.println("The duplicate values : ");
        for(Map.Entry<Object,Integer> m : map.entrySet()){
            if(1<m.getValue()){
                System.out.print(m.getKey()+" ");
            }
        }
    }
}
