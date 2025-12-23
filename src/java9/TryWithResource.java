package java9;

import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        try (scan) {
            System.out.println("Enter string");
            scan.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scan.nextLine();// IllegalStateException
    }
}
