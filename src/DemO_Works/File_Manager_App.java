package DemO_Works;

import java.io.*;
import java.util.Scanner;

public class File_Manager_App {

    public static Scanner scan = new Scanner(System.in);
    public static String directory = "G:\\SampleFold";

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        File file = new File(directory);
        if (!file.exists())
            file.mkdir();

        while (true) {
            System.out.print("""
                    
                    1. Create new file
                    2. Update file
                    3. Read File
                    4. Delete File
                    5. Exit 
                    
                    Enter your choice  : 
                    
                    """);
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    createFile();
                }
                case 2 -> {
                    updateFile();
                }
                case 3 -> {
                    readFile();
                }
                case 4 -> {
                    deleteFile();
                }
                case 5 -> {
                    System.out.println("Thank you...");
                    return;
                }
                default -> {
                    System.out.println("Your choice is invalid!! Try again... ");
                }
            }

        }

    }

    public static void createFile() {
        System.out.print(" Enter your file name : ");
        String fileName = scan.nextLine();
        File file = new File(directory + File.separator + fileName);

        try {
            if (file.createNewFile())
                System.out.println("File created successfully");
            else
                System.out.println("The file is already exist !!!");

        } catch (IOException e) {
            e.getMessage();
        }


    }

    public static void updateFile() {
        System.out.println(" Enter your file name : ");
        String fileName = scan.nextLine();
        System.out.println(" Enter your prarform Append (A) or Update (U) : ");
        char choice = scan.nextLine().charAt(0);
        boolean r = true;
        if (choice == 'U') r = false;

        try (BufferedWriter file = new BufferedWriter(new FileWriter(directory + File.separator + fileName, r))) {
            System.out.println("Enter data :");
            String data = scan.nextLine();
            file.write(data);
            file.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void readFile() {
        System.out.println(" Enter your file name : ");
        String fileName = scan.nextLine();

        try (BufferedReader file = new BufferedReader(new FileReader(directory + File.separator + fileName))) {
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("File updated successfully...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile() {
        System.out.println(" Enter your file name to delete : ");
        String fileName = scan.nextLine();
        File file = new File(directory + File.separator + fileName);
        if (file.delete())
            System.out.println(fileName + "file deleted succssffully...");
        else System.out.println(fileName + "file not found");

    }
}