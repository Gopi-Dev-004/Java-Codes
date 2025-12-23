package FileHandling;
import java.io.*;

class Student1 implements Externalizable {
    String name;
    int id;
    String std;

    public  Student1()
    {
//        System.out.println("Default constructor called");
    }
    public Student1(String name,int id,String std){
        this.name = name;
        this.id = id;
        this.std = std;

    }


    // write external
    @Override
    public void writeExternal(ObjectOutput out)throws IOException {
        out.writeUTF(name);
        out.writeInt(id);

        out.writeUTF(std);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        name = in.readUTF();
         id = in.readInt();
         std = in.readUTF();
    }

    public void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student id: "+id);
        System.out.println("Student std: "+std);
    }


}

public class External extends Object {
    public static void main(String[] args) throws  IOException,ClassNotFoundException{
        // write object
        Student1 s1 = new Student1("Vijay",1234,"3 rd");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 58 file handle data stream object stream\\vijay\\2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();

        //Read object
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 58 file handle data stream object stream\\vijay\\2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student1 s2  = (Student1)ois.readObject();

            s2.display();

            System.out.println(ois.readUTF());

        }catch (IOException e){
            //System.out.println("Exception Caught");
        }

    }
}
