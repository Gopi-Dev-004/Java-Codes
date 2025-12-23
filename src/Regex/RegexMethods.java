package Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexMethods {
    public static void main(String[] args) {

//
//    String s="sri Sri sri sri";
//    Pattern p= Pattern.compile("ri");
//    Matcher m= p.matcher(s);
//        while(m.find())  {
//        System.out.println(m.group() +"  starts at :"+ m.start() +" end at : "+m.end());
//    }
//Checkd cotains digit?
//    String s="123";
//    Pattern p= Pattern.compile("[0-9]+");
//    Matcher m= p.matcher(s);
//    if(m.matches())
//        System.out.println("It contains only digits");
//    else
//        System.out.println("It contains different!!!");
//Etract number form a text
//        String s="My phone number is 9655 and pin is 1234";
//        Pattern p= Pattern.compile("\\d+");
//        Matcher m= p.matcher(s);
//        while(m.find()){
//            System.out.println("Found : "+m.group());//Found : 9655Found : 1234
//        }
//Validate email
//        String email="mr.gop004@gmail.com";
//        String regex="^[A-Za-z0-9_.-]+@[A-Za-z0-9.-]+$";
//
//
//        if(email.matches(regex))
//        System.out.println("Correct formet of email ");
//        else System.out.println("Invalid email");

//        String txt="It contains digits like 123";
//        String regex="\\d";
//        if(txt.matches(".*"+regex+".*"))
//            System.out.println("Yes it has numbers");
//        else
//            System.out.println("No it not has numbers");
////
//        String txt="It contains Alphabets";
//
//        if(txt.matches("[A-Za-z ]+"))
//            System.out.println("Yes it has Alphabets");//Yes it has Alphabets
//        else
//            System.out.println("No it not has Alphabets");
//
//        String txt="It contains Alphanumeric1223";
//
//        if(txt.matches("[A-Za-z0-9 ]+"))
//            System.out.println("Yes it has Alphanumeric");//Yes it has Alphabets
//        else
//            System.out.println("No it not has Alphanumeric");

//
//        String txt="It contains whitespace";
//
//        if(txt.matches(".*\\s.*"))
//            System.out.println("Yes it has whitespace");//Yes it has Alphabets
//        else
//            System.out.println("No it not has whitespace");
// start with : hellow
//end with :  world
        String txt="hellow world";
        if(txt.matches("^hellow.*"))
            System.out.println("start with hellow ");//Yes it has Alphabets
        if(txt.matches(".*world$"))
        System.out.println("end with world ");
    }

}
