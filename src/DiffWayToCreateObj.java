

class Student {
    int n=120;
    void show(){
        System.out.println("Hello World" );
    }
}


public class DiffWayToCreateObj {
    public static void main(String[] args)throws ClassNotFoundException {
        //==way 1:
//        Student std=new Student();// the way one most common way to create obj

        //==way 2:
        //using Class.forName(arg)
        Class.forName("Student");



    }
}
