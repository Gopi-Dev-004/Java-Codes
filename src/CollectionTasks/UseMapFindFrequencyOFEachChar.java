package CollectionTasks;

import java.util.HashMap;
import java.util.Map;

public class UseMapFindFrequencyOFEachChar {
   static Map<Character,Integer> map=new HashMap();
    public static void main(String[] args) {
        String str="programming";

        for(char c : str.toCharArray()) {
           map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
    }
}
