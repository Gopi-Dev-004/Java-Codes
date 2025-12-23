package MyMethods;

public class Methods {


    public static int min(int a, int b){
        return a<=b?a:b;
    }
    public static int max(int a, int b){
        return a>=b?a:b;

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static boolean  isDigit(char a){
        return a>='0'&& a<='9'?true:false;
    }
    public static boolean  isLeter(char a){
        return a>='a'&& a<='z'?true:false;
    }
    public static int pow(int a, int b){
        int pow=0;
        for(int i=1;i<b;i++){
            pow+=a*a;
        }
        return pow;
    }
    public static int abs(int a){
        return 0>a?-a:a;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(5,2));
        System.out.println(Methods.pow(5,2));
        System.out.println(Methods.abs(0));

    }


}
