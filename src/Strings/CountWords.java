package Strings;

import javax.swing.plaf.IconUIResource;

public class CountWords {
    public static void main(String[] args) {
        String str=" Start and    end    ";
        //the strip and trim method used to remove space before and after the string
////        str=str.strip();
//        System.out.println("<"+str.strip()+">");
//        System.out.println(str);
//        System.out.println(str.trim());
//        System.out.println(str.replaceAll("\\s+"," ").strip());
//        System.out.println(str.replaceAll("\\s"," ").strip());
//        System.out.println(str);
        str=str.replaceAll("\\s+"," ").strip();
        String[] s=str.split(" ");
        for(String s1 : s)
            System.out.print(s1);
        System.out.println();
        System.out.println("Word Count : "+s.length);
        System.out.println("-----------------------------------");

        //way two
        int start=0;
        int end=0;
        int count=0;
        int len=str.length();
        while(start<len && end<len) {
            while (end < len && str.charAt(end) != ' ') {
                end++;
            }
            count++;
            start = end + 1;
            end = start;
        }
        System.out.println("Word Count : "+count);
        System.out.println("-----------------------------------");
        //way 3
       String  sss="         Hi   this is      word     count   ";
       sss=sss.trim();
       String[] s1=sss.split("\\s+");
        System.out.println("Word Count : "+s1.length);
        }

    }

