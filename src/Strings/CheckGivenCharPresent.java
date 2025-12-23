package Strings;

public class CheckGivenCharPresent {
    public static void main(String[] args) {
        String str="I can speak English fluently ";
        char target='z';
//        if(str.contains(target+""))
//            System.out.println("yse");
//        else System.out.println("not");
        for(char c : str.toCharArray() ){
            if(c==target) {
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}
