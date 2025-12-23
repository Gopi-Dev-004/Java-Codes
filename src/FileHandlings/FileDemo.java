package FileHandlings;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo {
    public static void main(String[] args) {
        File file1=new File("G:\\Dumy\\File\\file1.java");
        File file2=new File("G:\\Dumy\\File\\file2.doc");
        File file3=new File("G:\\Dumy\\File\\file54");
        File file4=new File("G:\\Dumy\\File\\file4.txt");
        try {
        FileWriter fw1=new FileWriter("G:\\Dumy\\File\\file4.txt");
//        System.out.println(file.mkdir());// the mrkdir() methode used to create new folder
//            System.out.println(file1.exists());// check if the file is exist or not
//            System.out.println(file1.delete());//delete file or derectory
//            System.out.println(file2.getAbsoluteFile().getName());
//            System.out.println(file1.createNewFile());//create new file
//            System.out.println(file2.isFile());
//            System.out.println(file2.createNewFile());
//            System.out.println(file2.getParent());//return the file full derectory
//            System.out.println(file2.getPath());//derector with file extention
//            System.out.println(file3.createNewFile())
//            System.out.println(file2.canRead());// check can read file
//            System.out.println(file2.canWrite());// check can wirte file
//            System.out.println(file2.setExecutable(true));
//            System.out.println(file2.setExecutable(false));
////            System.out.println(file2.canExecute());
//            System.out.println(file2.setReadOnly());
//            System.out.println(file2.canRead());
//            System.out.println(file2.canWrite());
//            String[] l=file3.list();
//            for(String s: l){  //list file only
//                System.out.println(s);
//            }  File[] lf=file3.listFiles();
//
//            for(File s: lf){//print derectory with file name
//                System.out.println(s);
//            }
//            System.out.println();
//            System.out.println(file3.lastModified());
//
            File f1=new File("G:\\Dumy\\File\\f1.java");
            f1.createNewFile();
            File f2=new File("G:\\Dumy\\File\\f2.java");
            System.out.println(f1.renameTo(f2)); //true

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
