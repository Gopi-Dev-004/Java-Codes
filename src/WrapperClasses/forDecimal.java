package WrapperClasses;

public class forDecimal {
    public static void main(String[] args) {
        Byte b=123;
        System.out.println(b);
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.parseByte("124"));// 124
//        System.out.println(Byte.parseByte("128"));//number formet exception
        System.out.println(Byte.toString((byte)12));//12
        System.out.println(Byte.valueOf("123"));//conver string into byte
        System.out.println(Byte.valueOf((byte)123));//conver byte into Byte
    }
}
