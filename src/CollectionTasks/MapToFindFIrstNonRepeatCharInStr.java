package CollectionTasks;

import java.nio.charset.CharacterCodingException;
import java.util.HashMap;
import java.util.Map;

public class MapToFindFIrstNonRepeatCharInStr {
    public static void main(String[] args) {
        String str="programming";
        HashMap<Character,Integer> m=new HashMap();
        for(char c : str.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> s: m.entrySet()){
            if(s.getValue()==1){
                System.out.println(s.getKey());
                return;
            }
            System.out.println("Not found!!!");
        }

    }
}
