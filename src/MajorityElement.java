import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorityElement {
    public static void main(String[] args){

        int[] arr = {1,2,1,2,2,5,6};

        HashMap<Integer,Integer> hm = new HashMap();

        for(int n : arr){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> v : hm.entrySet()){
           if(v.getValue()> max){
               max =v.getKey();
           }
        }
        System.out.println(max);
    }
}
