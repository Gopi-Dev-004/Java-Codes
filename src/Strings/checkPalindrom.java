package Strings;

public class checkPalindrom {
    public static void main(String[] args) {
        String str="apaapa";
        boolean ispalidnrom=false;
       int start=0;
       int end=str.length()-1;
       while(start<end){
           if(str.charAt(start)!=str.charAt(end)){
             ispalidnrom=true;
               break;
           }
           start++;
           end--;
       }
       if(!ispalidnrom)
           System.out.println("Is  palindrome");
       else System.out.println("is not palindrome");
    }
}
