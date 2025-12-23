package SampleTask.EmployeeTask;

import java.util.ArrayList;
import java.util.Scanner;

import static SampleTask.EmployeeTask.Operations.*;
public class Main {
    private static Scanner scan=new Scanner(System.in);
   public static ArrayList<Employee> emps=new ArrayList();
       private static String choice;
       private static void createEmp(){
           Employee emp1=new Employee(100,22,"Chennai","Google","Developer","MALAI",50000);
           Employee emp2=new Employee(101,45,"Chennai","Google","Product Manager","MOHAN",50000);
           Employee emp3=new Employee(102,22,"Tv Malai","Facebook","UI","RAJA",30000);
           Employee emp4=new Employee(103,19,"salem","Amazon","Developer","RAVI",250000);
           Employee emp5=new Employee(104,42,"salem","Microsoft","Developer","SABARI",260000);
           Employee emp6=new Employee(105,20,"Tv Malai","Google","UI & UX","SRI",720000);
           Employee emp7=new Employee(106,22,"Tv Malai","Amazon","Product Manager","TAMIL",50000);
           Employee emp8=new Employee(107,32,"Chennai","Microsoft","Product Manager","NAVEEN",620000);
           Employee emp9=new Employee(108,36,"Chennai","Google","UI","kotes",530000);
           Employee emp10=new Employee(109,22,"salem","Microsoft","UI","VISHNU",60000);
           emps.add(emp1); emps.add(emp2); emps.add(emp3); emps.add(emp4); emps.add(emp5); emps.add(emp6);
           emps.add(emp7); emps.add(emp8); emps.add(emp9); emps.add(emp10);
       }

    private static void display(){
        System.out.println("""
               A. Find the highest-paid employee in each department.
               B. Find the average salary of employees in each city.
               C. List employees grouped by department and then by city.
               D. Find the youngest employee in the company.
               E. List employees earning more than 60,000 and sort them by salary (descending).
               F. Check if all employees are above 25 years old.
               G. Get a comma-separated string of all employee names sorted alphabetically.
               H. Partition employees into two groups: salary above 70,000 and below/equal to 70,000.
               I. Find top 3 highest-paid employees across the company.
               J. Find average age of employees per department
               K. Exit!!!
                """);
    }
    private static void start(){
        System.out.println("=== Welcome To Employee Management ===");
        while(true){
            display();
            System.out.print("\n Chose the option : ");
            choice=scan.nextLine();
            switch (choice){
                case "A":
                  break;
                case "K":
                    System.exit(0);
                    break;

            }
        }
    }

    public static void main(String[] args) {
//        start();
        createEmp();
        sortemp();
//        highestPaidEmpEachDep();
       // averageSalaryPerCity();
//        youngestEmpINCom();
        //highSalaryEmp();
//        CheckAge24AboveForCompany();
//        empName();
//        dividBySalary();

    }


}
