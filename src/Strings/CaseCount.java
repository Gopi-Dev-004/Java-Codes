package Strings;

public class CaseCount {
    public static void main(String[] args) {
//        count the upper and lower case character count in the given string.
        String str = "Mr.Gopi0004@gmail.com ";
        int digit=0;
        int lowerCase=0;
        int upperCase=0;
        int splChar=0;
        for(char c : str.toCharArray()){
         if(c >='0' && '9'>=c )digit++;
         else if(c>='a' && 'z'>=c)lowerCase++;
         else if(c>='A' && 'Z'>=c)upperCase++;
         else splChar++;
        }
        System.out.println("The case count  ");
        System.out.println("1. Digit Count : "+digit);
        System.out.println("2. Upper Case Count :"+upperCase);
        System.out.println("3. Lower Case Count :"+lowerCase);
        System.out.println("4. Special character Count :"+splChar);

    }
}
