package Strings;

public class ReverseTheStr {
    public static void main(String[] args) {
        String str="Hello World";
        StringBuffer rev=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        str=rev.toString();
        System.out.println(str);
    }
}
