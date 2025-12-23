package SampleTask.EmployeeTask;
import ComparableAndComparator.Emp;

import java.util.*;
import java.util.stream.Collectors;


import static SampleTask.EmployeeTask.Main.emps;

public class Operations {
    //Find the highest-paid employee in each department

    public static void highestPaidEmpEachDep() {
        HashMap<String,Employee> deps=new HashMap<>();
        for(Employee e : emps){
            String d=e.getDepartment();
            if(!deps.containsKey(d) || e.getSalary() > deps.get(d).getSalary()){
            deps.put(d,e);
            }
        }
        System.out.println(String.format("%-15s || %-15s ","Department","Salary"));
        System.out.println("===================================");
        for(String  s:  deps.keySet()){
            System.out.println( String.format("%-15s ||  %-15.2f",s,deps.get(s).getSalary()));
        }
        }
    public static void averageSalaryPerCity(){

      //  Find the average salary of employees in each city.
        HashMap<String,Double> totalSalary = new HashMap<>();
        HashMap<String,Integer> countEmp = new HashMap<>();
        for(Employee e : emps){
            String city=e.getCity();
            totalSalary.put(city, totalSalary.getOrDefault(city,0.0)+e.getSalary());
            countEmp.put(city,countEmp.getOrDefault(city,0)+1);
        }

        HashMap<String,Double> avgSalCity=new HashMap<>();
        for(String c : totalSalary.keySet()){
            avgSalCity.put(c,totalSalary.get(c)/countEmp.get(c));
        }
        System.out.println(String.format("%-15s || %-15s ","City","Average Salary"));
        System.out.println("===================================");
        for(String  s:  avgSalCity.keySet()){
            System.out.println( String.format("%-15s ||  %-15.2f", s,avgSalCity.get(s)));
        }

    }
    public static void youngestEmpINCom(){
        // Find the youngest employee in the company.
        HashMap<String,Employee> group=new HashMap<>();
        System.out.println("=== The youngest Employee in the company ===");
        System.out.println(String.format("%-15s || %-5s || %-15s ","Company","Age","Name"));
        System.out.println("========================================");
        for(Employee e : emps){
            String com=e.getCompany();
            if( !group.containsKey(com) || group.get(com).getAge()>e.getAge() ){
                group.put(com,e);

            }
        }
        for(String c : group.keySet()){
            System.out.println(String.format("%-15s || %-5d || %-15s",c,group.get(c).getAge(),group.get(c).getName()));
        }
    }
    public static void highSalaryEmp() {
        //List employees earning more than 60,000 and sort them by salary (descending).
        int n=60000;
        ArrayList<Employee> he=new ArrayList();
    for(Employee e : emps){
        if(e.getSalary()>=n) {
            he.add(e);
        }
        }

        Collections.sort(he,new BySalary());
        System.out.println("=== The more than 60,000 earning Empl0yee ===");
        System.out.println(String.format("%-15s || %-10s || %-15s ","Company","Salary"," Employee Name"));
        for(Employee em : he){
            System.out.println(String.format("%-15s || %-10.2f || %-15s",em.getCompany(),em.getSalary(),em.getName()));

        }
    }
    public static void CheckAge24AboveForCompany() {
        //Check if all employees are above 25 years old.
        HashSet<String> emp=new HashSet<>();
        for(Employee e : emps){
            if (e.getAge()<25){
                System.out.println("No,  Employee found blow 25 age.!!! ");
            return;
            }
        }
        System.out.println("Yes, All employee are above 25...");
    }
    public static void empName(){
    // Get a comma-separated string of all employee names sorted alphabetically.
        ArrayList <String> names=new ArrayList<>();
        for(Employee e : emps){
            names.add(e.getName());
        }
        Collections.sort(names);
        String result=String.join(",",names);
        System.out.println(result);
    }
    public static void dividBySalary(){
        //Partition employees into two groups: salary above 70,000 and below/equal to 70,000.
        ArrayList avg=new ArrayList();
        ArrayList above=new ArrayList();
        for(Employee e : emps){
            if(e.getSalary()>=70000)above.add(e);
            else avg.add(e);
        }
        System.out.println("The above 70000 employees : \n"+above);
        System.out.println("The blow 70000 employees : \n"+avg);
    }
    public static void highPaidThreeEmp() {
        // Find top 3 highest-paid employees across the company.

    }

//    Sort the Employee object based on salary using java 8?
    public static void  sortemp(){
        emps.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println(emps);
    }
//    convert the Employee ArrayList into Map using java or java8?
    public static void listToMap(){
      Map<Integer,Employee>  eMap = emps.stream()
                .collect(Collectors.toMap(Employee::getId,e->e));
    }
}



