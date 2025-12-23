package WrapperClasses;

public class ForInteger {
    public static void main(String[] args) {
        int i=100;
        System.out.println(i);
        System.out.println(Integer.MAX_VALUE);// return the maximum value
        System.out.println(Integer.MIN_VALUE);// return the minimum value
//        System.out.println(Integer.valueOf("gopi"));// it throw numbre formet exception
        System.out.println(Integer.valueOf(i));// convert primitive to wrapper object
        System.out.println(Integer.valueOf("123"));// covert string into integer
//        System.out.println(Integer.valueOf("",5));//
        System.out.println(Integer.bitCount(123));//6
        System.out.println(Integer.compare(1,2));//-1
        System.out.println(Integer.compare(100,100));//0
        System.out.println(Integer.compare(100,50));//1
        System.out.println(Integer.compress(20000,50));//4
        System.out.println(Integer.max(20,Integer.max(20,30)));//30
        System.out.println(Integer.min(20,Integer.min(2,30)));//2
        System.out.println(Integer.toOctalString(30));//36
        System.out.println(Integer.toBinaryString(2));//10
        System.out.println(Integer.toHexString(65));//41

    }
}
