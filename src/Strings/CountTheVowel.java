package Strings;

public class CountTheVowel {
    public static void main(String[] args) {
        String str="The King";
        int count=0;
        for(int i=0;i<str.length();i++){
            if("aeiouAEIOU".contains( str.charAt(i)+"")){
            count++;
            }
        }
        System.out.println(count);
        count=0;
        //way two
        for (char c: str.toCharArray()){
            if("AEIOUaeiou".contains(c+"")){
                count++;
            }
        }
        System.out.println("The count :"+count);
    }
}
