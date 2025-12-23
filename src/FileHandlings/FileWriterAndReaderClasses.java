package FileHandlings;

import java.io.*;

public class FileWriterAndReaderClasses {
    public static void main(String[] args)  {
        try {
            // we must be create filewriter object within the try block othere wise throw compaile tiem exception
            FileWriter fw = new FileWriter("G:\\Dumy\\File\\f2.java");
            fw.write("Hi this is my new file writing...");
            // we should be give put the fluch method for saving the date into file
            fw.flush();//success
            fw.write('G');// we can write the charactor using this mathod And it appan last
            fw.flush();
            fw.append("  This is my new file  ");
            fw.flush();
            // the start and end index specify the given string length eg: 0 to 5 means "how i"
            // 0 t0 end is "how is's posible"
            fw.append("how it's posible",0,16);
            fw.flush();
// we must be  specify the fw object in bufferedwriter constractor
// it have some extra methods
 // it filewriter compper to bufferdwriter is fast it have newLine() method
 FileWriter filew=new FileWriter("G:\\Dumy\\File\\bw.java");
            BufferedWriter bw=new BufferedWriter(filew);
            bw.write("This is buffered wiriter in java");
            bw.newLine();// it is go to next line in file
            bw.write("This is buffered wiriter in java");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
