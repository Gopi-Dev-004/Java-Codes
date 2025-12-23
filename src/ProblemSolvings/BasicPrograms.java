package ProblemSolvings;


public class BasicPrograms {


    //reverse the number
    public static void revNum(){
       int num = 789;
       int rev = 0;
       while(num != 0){
           int last = num%10;
           rev = rev * 10 + last;
           num = num/10;
       }
        System.out.println(rev);
    }

    //check palindrome in number
    public static void palindromeInNum(){
        int num = 12321;
        int rev = 0;
        int dup = num;

        while(dup != 0){
            int last = dup % 10;
            rev = rev * 10 + last;
            dup = dup/10;
        }

        System.out.println(rev==num?" is palindrome":" not palindrome");
    }

    //check palindrome in string
    public static void palindromeInString(){
       String str = "car";
        str = str.toLowerCase();

        int start = 0;
        int end = str.length()-1;
        while (start<end){

            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not a palindrome");
                break;
            }
            start++;
            end--;
        }
        System.out.println("is palindrome");


    }

    //count vowel and consonant
    public static void countVC(){
        String str = "Hello World14";
        str = str.toLowerCase().replaceAll(" ","");
        System.out.println(str);
        int vowelCount = 0;
        int consonantCount = 0;

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowelCount++;
                else consonantCount++;

            }

        }

        System.out.println("Vowel count is : "+vowelCount +" Consonant count is : "+consonantCount);

    }

    //find factorial
    public static void factorial(){
        int num = 5;

        int fact = 1;
        for(int i=1; i<=num;i++){
            fact *= i;
        }

        System.out.println(fact);
    }

    //fibonacci series
    public static void fibonacci(){
        int first = 0;
        int second = 1;

        for(int i=0; i<10; i++){
            System.out.print(first+" ");
            int next = first;
            first += second;
            second = next;
        }
    }

    //prime number
    public static void isPrime(){
        int n = 29;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%2 == 0)
            {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("is prime");

    }

    //sum of digits
    public static void sumOfDigit(){
        int n = 1234;
        int sum = 0;
        while(n != 0){
            int last = n%10;
            sum += last;
            n = n/10;
        }
        System.out.println("Sum of digits is :"+sum);
    }

    //largest of 3 numbers
    public static void largestOf3(){
        int a = 10;
        int b = 40;
        int c = 22;

        if(a > b && a > c){
            System.out.println(a+" a");
        }
        else if (b > a && b > c){
            System.out.println(b+" b");
        }
        else {
            System.out.println(c+ " c");
        }
    }

    //third largest number in an array
    public static void large3(){
        int[] arr = {4,6,3,2,3,433,2,4,2,24};

        int large = 0;
        int second = 0;
        int third = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]>large){
                third = second;
                second = large;
                large = arr[i];
            }

            if(arr[i] != large && arr[i] > second){
                third = second;
                second = arr[i];
            }

            if( arr[i] != second && arr[i] > third){
                third = arr[i];
            }
        }

        System.out.println("The third largest number is : "+ third);
    }

    public static void main(String[] args) {

//        large3();
//        largestOf3();
//        sumOfDigit();
//        isPrime();
//        fibonacci();
//        factorial();
//        countVC();
//        palindromeInString();
//        palindromeInNum();
//        revNum();

    }
}
