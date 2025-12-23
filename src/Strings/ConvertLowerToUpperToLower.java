package Strings;

public class ConvertLowerToUpperToLower {
    public static void main(String[] args) {
        String str="pROGRAMMING lANGUANGE @#%^%";
        StringBuffer con=new StringBuffer();

        char c;
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(c>='a' && c<='z'){
                c-=32;
                con.append(c+"");

            }else if(c>='A' && c<='Z'){
                c+=32;
                con.append(c+"");
            }else {
                con.append(c+"");
            }
        }
        System.out.println(str);
        System.out.println(con);
    }
}
