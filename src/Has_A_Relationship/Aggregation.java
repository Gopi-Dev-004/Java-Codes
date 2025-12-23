package Has_A_Relationship;

public class Aggregation {
    /*
    Also called weak has a relationship
    Whew one class has another class
    One class exist independently of the container class

     */
    public static void main(String[] args) {
        // the teacher exit independentlly
        Teacher teach=new Teacher("Mani");
        // department want teacher
        Department dep=new Department("Cs",teach);
        dep.show();
    }

}

class Teacher{
    String name;
    Teacher(String name){
        this.name=name;
    }
}
class Department{
    String depName;
    Teacher teacher;
    Department(String depName,Teacher teacher){
        this.depName=depName;
        this.teacher=teacher;
    }
    public void show(){
        System.out.println("Departmet name is : "+depName+"\n Teacher name is : "+teacher.name);
    }
}
