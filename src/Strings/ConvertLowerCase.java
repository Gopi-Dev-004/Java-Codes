package Strings;

public class ConvertLowerCase {
    public static void main(String[] args) {


        String str = "programming Is The World";
        String con="";
        for (int i = 0; i < str.length();i++){
            char c=str.charAt(i);
            if(c>='A' && c<='Z'){
                c+=32;
                con += c+"";
            }else {
                con+=c+"";
            }
        }
        System.out.println(str);
        System.out.println(con);
    }
}
