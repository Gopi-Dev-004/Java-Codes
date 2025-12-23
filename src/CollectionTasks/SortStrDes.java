package CollectionTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStrDes {
    public static void main(String[] args) {
        List l= Arrays.asList("Gopi","Ezhumalai","Vishnu","Sri");
        ArrayList<String> al=new ArrayList<>(l);
        String s="";
        System.out.println(s.length());
        for(int i=0;i<al.size()-1;i++){
            for(int j=i+1;j<al.size();j++){
               if(al.get(i).length() < al.get(j).length()){
                   String temp=al.get(i);
                   al.set(i,al.get(j));
                   al.set(j,temp);
               }
            }
        }
        System.out.println(al);
    }
}
