package Strings;

public class FirstRepeateChar {
    public static void main(String[] args) {
        String str="malai";
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                char c=str.charAt(j);
                if(str.charAt(i)==c){
                    System.out.println("The first repeating char is : "+c);
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
}
