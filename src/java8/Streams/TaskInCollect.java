package java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String company;
    private int id;
    private String name;
    private String department;
    private double salary;
    private String city;
    private int age;

    public Employee(int id,int age, String city, String company, String department, String name, double salary) {
        this.age = age;
        this.city = city;
        this.company = company;
        this.department = department;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCompany() {
        return company;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "[" +
                "age=" + age +
                ", company='" + company + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ']'+"\n\n";
    }
}




public class TaskInCollect {
     static ArrayList<Employee> emps = new ArrayList();
/*
> Given a list of employees (id, name, department, salary),
-> Find employees with salary > 50,000
-> Group employees by department
-> Find the highest-paid employee in each department
> Given a list of employees (id, name, department, salary),
-> Find employees with salary > 50,000
-> Group employees by department
-> Find the highest-paid employee in each department

-> Given a list of integers, find the maximum and minimum number using streams.
-> Find the average of a list of integers.
-> Given a list of names, join them into a single string separated by commas.
-> Remove duplicate elements from a list using streams.
-> Count the frequency of each character in a string.
-> Given a list of integers, filter out even numbers and collect odd numbers into a list.
-> Given a list of strings, convert them all to uppercase.
-> Find the count of strings in a list that start with the letter "A".
-> Sort a list of integers in ascending and descending order.
-> Find the first element of a list using streams.
 */

     public static void groupBySal500000(){
         //Find employees with salary > 50,000
                  List<Employee>  result = emps.stream()
                          .filter(x->x.getSalary()>50000)
                          .collect(Collectors.toList());
                         System.out.println(result);

     }
     public static void groupByDep(){
        Map result =  emps.stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment));
         System.out.println(result);

     }
     public static void averageSalary(){
        DoubleSummaryStatistics result = emps.stream()
                 .collect(Collectors.summarizingDouble(Employee::getSalary));
         System.out.println(result);

     }
     public static void highestPaidEmpINEachDept(){
         // Find the highest-paid employee in each department
//         Map<String,Optional<Employee>> result =  emps.stream()
//                 .collect(Collectors.groupingBy(Employee::getDepartment),

//                         Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary));
//





     }
     public static void findMinMax(){
////         > Given a list of integers, find the maximum and minimum number using streams.
         int[] nums={20,3,2,29,7557,2265,968,33,22,86};
       IntSummaryStatistics result =  Arrays.stream(nums)
                 .summaryStatistics();
         System.out.println("Max : "+result.getMax()+"\n Min : "+result.getMin());

     }
     public static void findAverageof(){
         // Find the average of a list of integers.
         List<Integer> nums=Arrays.asList(884,33,433,432,332,234);

         Double r =  nums.stream().mapToInt(x->x.intValue()).summaryStatistics().getAverage();
         System.out.println(r);

    }
     public static void listName(){
         //Given a list of names, join them into a single string separated by commas.
         String[] str = {"Gopi","Malai","Mohan","Raja","Vishnu","Naveen"};
        String result =  Arrays.stream(str).collect(Collectors.joining(","));
         System.out.println(result);
     }
     public static void removeDup(){
         //Remove duplicate elements from a list using streams.
//         List<String> res = Arrays.asList("AA","A","BBB","B","B","BBB");
         List<Integer> res =Arrays.asList(10,20,30,10,20,30,100,3000);
         res.stream().distinct().forEach(System.out::println);

     }
     public static void frequncyOfChar(){
         String str = "Hello world";
       Map<Character,Long> r=  str.chars().mapToObj(x->(char)x)
                 .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        r.forEach( (x,y)-> System.out.println(x+" -> "+y));


     }
     public static void findOdd(){
         //Given a list of integers, filter out even numbers and collect odd numbers into a list.
         List<Integer> n = Arrays.asList(2,3,45,6,78,1,2,43,43,65,44,76);
      List<Integer>  result =  n.stream().mapToInt(x->x).filter(x->x%2!=0).mapToObj(x->x).toList();
         System.out.println(result);
     }
     public static void strToUp(){
//         Given a list of strings, convert them all to uppercase.
         List<String> str =  Arrays.asList("Gopi","Malai","Ravi","Ranjith");
        List<String> result = str.stream().map(String::toUpperCase).toList();
         System.out.println(result);

     }
     public static void startWithA(){
//         Find the count of strings in a list that start with the letter "A".
         List<String> list = Arrays.asList("Apple" , "Arun", "Ball" ,"Achu","Mohan");
        long res= list.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).count();
         System.out.println(res);
     }
     public static void asendinAndDesending(){
        List<Integer> nums = Arrays.asList(2,5,3,2,5,7,5,4);
      List<Integer> as =  nums.stream().sorted(Comparator.naturalOrder()).toList();
         System.out.println(as);
       List<Integer>  des = nums.stream().sorted(Comparator.reverseOrder()).toList();
         System.out.println(des);
     }
     public static void empSalFind(){
//         Find employees with salary > 50,000
      String s =   emps.stream()
                 .collect(Collectors.
                         filtering(x-> x.getSalary()>=50000,
                                 Collectors.mapping(x->
                                         x.getName()+" => "+x.getSalary()+"\n",Collectors.joining())));
         System.out.println(s);
     }
     public static void findhigpaidEmp(){
      Map s=   emps.stream()
              .collect(Collectors
                      .groupingBy(Employee::getDepartment,
                              Collectors.collectingAndThen(Collectors
                                              .maxBy((x,y)-> (int) (x.getSalary()-y.getSalary())),
                                      x->x.get().getName())));
         System.out.println();
         System.out.println(s);
     }
    public static void main(String[] args) {
        create();
        findhigpaidEmp();
//        empSalFind();
//        asendinAndDesending();
//        startWithA();
//        strToUp();
//        findOdd();
//        frequncyOfChar();
//        removeDup();
//        listName();
//        findAverageof();
//        findMinMax();
//        averageSalary();
//        groupByDep();
//        groupBySal500000();
    }
    public static void create(){
        Employee emp1=new Employee(100,22,"Chennai","Google","Developer","MALAI",50000);
        Employee emp2=new Employee(101,45,"Chennai","Google","Product Manager","MOHAN",50000);
        Employee emp3=new Employee(102,22,"Tv Malai","Facebook","UI","RAJA",30000);
        Employee emp4=new Employee(103,19,"salem","Amazon","Developer","RAVI",50000);
        Employee emp5=new Employee(104,42,"salem","Microsoft","Developer","SABARI",50000);
        Employee emp6=new Employee(105,20,"Tv Malai","Google","UI & UX","SRI",720000);
        Employee emp7=new Employee(106,22,"Tv Malai","Amazon","Product Manager","TAMIL",50000);
        Employee emp8=new Employee(107,32,"Chennai","Microsoft","Product Manager","NAVEEN",620000);
        Employee emp9=new Employee(108,36,"Chennai","Google","UI","kotes",530000);
        Employee emp10=new Employee(109,22,"salem","Microsoft","UI","VISHNU",60000);
        emps.add(emp1); emps.add(emp2); emps.add(emp3); emps.add(emp4); emps.add(emp5); emps.add(emp6);
        emps.add(emp7); emps.add(emp8); emps.add(emp9); emps.add(emp10);
    }
}


