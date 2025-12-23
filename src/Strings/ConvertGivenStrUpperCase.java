package Strings;

public class ConvertGivenStrUpperCase {
    public static void main(String[] args) {
        String str=" Hi  Gopi  ";
        StringBuffer convet=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a'&& c<='z'){
                c-=32;
                convet.append(c);
            }else {
               convet.append(c);
            }
        }
        System.out.println(convet);
    }
}
