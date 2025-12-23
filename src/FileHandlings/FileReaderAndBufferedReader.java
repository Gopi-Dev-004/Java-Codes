package FileHandlings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderAndBufferedReader {
    public static void main(String[] args) {
        // we must be use try block for this operation
        // we can read the file in two ways use while loops and scanner

        try {
            FileReader fr = new FileReader("G:\\Dumy\\File\\f2.java");
            int n;
            char c;
            while((n=fr.read())!=-1){
                c=(char)n;
                System.out.print(c);
            }
//            FileReader fr2 = new FileReader("G:\\Dumy\\File\\bw.java");
//            Scanner scan=new Scanner(fr);
//            System.out.println();
//            while(scan.hasNextLine()){//return true courrsor is have values
//                System.out.println(scan.nextLine());
//            }
//we can read line by line here use null
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
