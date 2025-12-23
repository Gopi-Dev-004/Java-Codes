package Strings;

import javax.sound.midi.Soundbank;

public class OddEvenWordCount {
    public static void main(String[] args) {

        String str = "The smallest induvidual unit is called tokens";
        int oddWord = 0;
        int evenword = 0;
//        String[] s1=str.strip().replaceAll("\\s+"," ").split(" ");
        str = str.replaceAll("\\s+", " ").strip();
        String[] arr = str.split(" ");

        for (String s : arr) {
//            System.out.print(s.length()+" ");
            if (s.length() % 2 == 0)
                evenword++;
            else oddWord++;
        }

        System.out.println("The Odd words count is : " + oddWord);
        System.out.println("The Even words count is : " + evenword);
        System.out.print("Even words are : ");
        for (String s : arr) {
            if (s.length() % 2 == 0)
                System.out.print(s + ", ");
        }
        System.out.println();
        System.out.print("Odd words are : ");
        for (String s : arr) {
            if (s.length() % 2 != 0)
                System.out.print(s + ", ");
        }
    }
}
