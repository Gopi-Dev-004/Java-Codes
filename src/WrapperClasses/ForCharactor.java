package WrapperClasses;

public class ForCharactor {
    public static void main(String[] args) {
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.charCount(12));
        System.out.println(Character.isLetter('t'));//true
        System.out.println(Character.isLetter('2'));//fales
        System.out.println(Character.isLetter('@'));//fales
        System.out.println(Character.isDigit('2'));//true
        System.out.println(Character.isAlphabetic('A'));//true
        System.out.println(Character.getType('9'));//9
        System.out.println(Character.getType('a'));//2
        System.out.println(Character.getType('A'));//1
        System.out.println(Character.getType('@'));//24








    }
}
