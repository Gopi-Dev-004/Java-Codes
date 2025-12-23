package CollectionTasks;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingCharactor {
    public static void main(String[] args) {
        String  str="programming";
        HashMap<Character,Integer> ch=new HashMap();
        for(char c : str.toCharArray()){
           ch.put(c,ch.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e : ch.entrySet()){

            if(e.getValue()==1){
                System.out.println("The first non repeating character is : "+e.getKey());
                return;
            }
        }
        System.out.println("Not present!!!");
    }
}
