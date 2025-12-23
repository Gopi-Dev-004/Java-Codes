package WrapperClasses;

public class ForBoolean {
    public static void main(String[] args) {
        System.out.println(Boolean.compare(true,false));//1
        System.out.println(Boolean.compare(false,false));//0
        System.out.println(Boolean.compare(true,true));//0
        System.out.println(Boolean.compare(false,true));//-1
        System.out.println(Boolean.getBoolean("false"));//false
        System.out.println(Boolean.getBoolean("gopi"));//false
        System.out.println(Boolean.getBoolean("true"));//false
    }
}
