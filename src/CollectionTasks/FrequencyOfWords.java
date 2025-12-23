package CollectionTasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String s="mani mani malai malai mohan raja raj";
        s=s.replaceAll("\\s+"," ").strip();
        String words[]=s.split(" ");
        HashMap<String,Integer> check =new HashMap();
        for(String w: words){
            check.put(w, getOrDefault(w, check) +1);
        }
        for(Map.Entry<String ,Integer> c : check.entrySet()){
            System.out.println(c.getKey()+"--->"+c.getValue());
        }
    }

    private static Integer getOrDefault(String w, HashMap<String, Integer> check) {
        return check.getOrDefault(w, 0);
    }
}
