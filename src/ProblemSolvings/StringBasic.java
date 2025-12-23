package ProblemSolvings;

import java.util.HashMap;
import java.util.HashSet;

public class StringBasic {

    //reverse string
    public static void revStr(){
        String str = "Programming knowledge";

        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }

    //first non repeating character
    public static void findNonRepeatingChar(){
        String str = "programming";

        HashMap<Character,Integer> hm = new  HashMap<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(var sets : hm.entrySet()){

            if(sets.getValue()==1){
//                System.out.println(sets.getKey()+" "+sets.getValue());
                System.out.print(sets.getKey()+" ");
            }
        }

    }

    //remove all duplicate
    public static void removeDuplicate(){
        String str = "programming";
        StringBuilder  sb = new StringBuilder();
        for(char c : str.toCharArray()){

            if(!(sb.toString().contains(c+""))){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

    // largest substring without repeating
    public static int logestSubWithoutRep(String str){

        int start = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for(int end=0; end<str.length(); end++){

            char currentChar = str.charAt(end);

            while(set.contains(currentChar)){
                set.remove(str.charAt(start));
                start++;
            }

            set.add(currentChar);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }


    public static void main(String[] args) {

        System.out.println(logestSubWithoutRep("abcabcabcdd"));
//        removeDuplicate();
//        findNonRepeatingChar();
//        revStr();
    }
}
