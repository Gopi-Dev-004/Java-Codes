package Strings;

public class CheckGivenStrContain {
    public static void main(String[] args) {
        String str="Every things is good";
        String target="goods";
        for(String s : str.split(" ")){
            if(str.contains(target)){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}
