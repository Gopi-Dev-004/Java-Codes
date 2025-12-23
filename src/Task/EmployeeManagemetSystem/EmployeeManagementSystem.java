package Task.EmployeeManagemetSystem;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
/*
create Employee class with id, name, role, salary, dateOfJoining, experience.
Ask user input to do the operations based on below methods.

create method like addEmployee, addAllEmployee, getEmployees,
 getEmployeeById, getEmployeeByRole, getEmployeeBySalary(start & end)
 getEmployeeByDOJ(start & end), deleteEmployeeById, updateEmployeeById using collection and java 8.
 */

 class Employee {
 private int id;
 private String name;
 private String role;
 private double salary;
 private LocalDate dateOfJoining;
 private int experience;

  public Employee(int id, String name, String role, double salary, LocalDate dateOfJoining, int experience) {
   this.id = id;
   this.name = name;
   this.role = role;
   this.salary = salary;
   this.dateOfJoining = dateOfJoining;
   this.experience = experience;
  }

  public LocalDate getDateOfJoining() {
   return dateOfJoining;
  }

  public int getExperience() {
   return experience;
  }

  public int getId() {
   return id;
  }

  public String getName() {
   return name;
  }

  public String getRole() {
   return role;
  }

  public double getSalary() {
   return salary;
  }

  public void setDateOfJoining(LocalDate dateOfJoining) {
   this.dateOfJoining = dateOfJoining;
  }

  public void setExperience(int experience) {
   this.experience = experience;
  }

  public void setId(int id) {
   this.id = id;
  }

  public void setName(String name) {
   this.name = name;
  }

  public void setRole(String role) {
   this.role = role;
  }

  public void setSalary(double salary) {
   this.salary = salary;
  }

  @Override
  public String toString() {
   return
           " Id : " + id +
           ", Name : " + name + '\'' +
           ", Role= : " + role + '\'' +
           ", Salary : " + salary +
           ", DOJ : " + dateOfJoining +
           ", Exp : " + experience +
           '}'+"\n";
  }
 }
public class EmployeeManagementSystem{

  static Scanner scan = new   Scanner(System.in);
  private static ArrayList<Employee> employee = new ArrayList();
  

  public static void addEmployee(){
   System.out.print("Enter id :");
   int id = scan.nextInt();scan.nextLine();
   System.out.print("Enter Name :");
   String name = scan.nextLine();
   System.out.print("Enter Role :");
   String role = scan.nextLine();
   System.out.print("Enter Salary :");
   double salary = scan.nextDouble();scan.nextLine();
   System.out.print("Enter Experience : ");
   int experience = scan.nextInt();
   employee.add(new Employee(id,name,role, scan.nextLong(), LocalDate.now(),experience));
   System.out.println("Employee added successfully....");

  }
  public static void addAllEmployee(){
   employee.addAll(Arrays.asList(
           new Employee(100,"Malai","UX",48000,LocalDate.of(2025,01,12),4),
           new Employee(101,"Mohan","Backend",46000,LocalDate.of(2024,01,12),4),
           new Employee(102,"Raja","Frontend",38000,LocalDate.of(2020,12,12),4),
           new Employee(103,"Vishnu","Frontend",28000,LocalDate.of(2021,11,12),4),
           new Employee(104,"Mani","Backend",58000,LocalDate.of(2015,02,12),4),
           new Employee(105,"Ganesh","UI",40000,LocalDate.of(2015,01,12),4),
           new Employee(106,"Ram","Software",18000,LocalDate.of(2012,8,12),4),
           new Employee(107,"Achu","Software",18000,LocalDate.of(2016,04,12),4),
           new Employee(108,"Naveen","UI",28000,LocalDate.of(2018,07,12),4),
           new Employee(109,"Sri","UI",35000,LocalDate.of(2018,05,12),4)
   ));
 }
  public static void getEmployee(){
    employee.forEach(System.out::println);
  }
  public static void getEmployeeById(){
   System.out.print("Enter Id : ");
   int findId = scan.nextInt();scan.nextLine();
   employee.stream()
           .filter(emp -> emp.getId()== findId )
           .forEach(System.out::println);

  }
  public static void getEmployeeByRole(){
   System.out.print("Enter Role : ");
   String getRole = scan.nextLine();
   employee.stream()
           .filter(emp -> emp.getRole().equalsIgnoreCase(getRole))
           .forEach(System.out::println);
  }
  public static void getEmployeeBySalary(){

   System.out.print("Enter staring salary : ");
   int start = scan.nextInt();scan.nextLine();
   System.out.print("Enter ending salary : ");
   int end = scan.nextInt();scan.nextLine();

   employee.stream()
           .filter(emp -> emp.getSalary() >= start && emp.getSalary() <= end )
           .forEach(System.out::println);
  }
  public static void getEmployeeByDOJ(){
   System.out.print("Enter starting year :");
   int start = scan.nextInt();scan.nextLine();
   System.out.print("Enter ending year ");
   int end = scan.nextInt();scan.nextLine();
   employee.stream()
           .filter( emp -> emp.getDateOfJoining().getYear() >= start && emp.getDateOfJoining().getYear() <= end )
           .forEach(System.out::println);
  }
  public static void deleteEmployeeById(){

   System.out.println("Enter Employee Id : ");
   int getId = scan.nextInt();scan.nextLine();

      employee =  employee.stream()
              .filter(e -> e.getId() != getId )
              .collect(Collectors.toCollection(ArrayList::new));
//      System.out.println(employee.pr);
//            .forEach();
//            .forEach(e-> employee.remove(e));

  }
  public static void updateEmployeeById(){

     while(true){
      System.out.println("""
              What do you want to update?
              1. Name
              2. Role
              3. Salary
              4. Exit!
             
              """);
      int choice = scan.nextInt();scan.nextLine();
      switch(choice) {
       case 1 -> {
        System.out.println("Enter id : ");
        int getId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name : ");
        String getName = scan.nextLine();
       employee = employee.stream()
               .map(emp ->
                       {
                        if (emp.getId() == getId)
                         emp.setName(getName);
                        return emp;
                       }
               )
               .collect(Collectors.toCollection(ArrayList::new));
      }
       case 2 -> {
        System.out.println("Enter id : ");
        int getId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Role : ");
        String getRole = scan.nextLine();
       employee = employee.stream()
               .map(emp ->
                       {
                        if (emp.getId() == getId)
                         emp.setRole(getRole);
                        return emp;
                       }
               )
               .collect(Collectors.toCollection(ArrayList::new));
      }
       case 3 -> {
        System.out.println("Enter id : ");
        int getId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Salary : ");
        int getSalary = scan.nextInt(); scan.nextLine();
       employee = employee.stream()
               .map(emp ->
                       {
                        if (emp.getId() == getId)
                         emp.setSalary(getSalary);
                        return emp;
                       }
               )
               .collect(Collectors.toCollection(ArrayList::new));
      }
       case 4 ->{return;}
       default -> {
        System.out.println("Invalid choice");
       }
      }

     }


      
  }
  public static void start(){
   addAllEmployee();
    while(true){
     System.out.println("""
             
            1. Add Employee
            2. Add All Employee 
            3. Get Employees
            4. Get Employee ById
            5. Get Employee By Role 
            6. Get Employee By Salary (start & end)
            7. Get Employee By DOJ (start & end)
            8. Delete Employee By Id
            9. Update Employee  By Id
            
            Choose your option....
           
             """);
     System.out.print("Enter : ");
     int choice=scan.nextInt();scan.nextLine();
     switch(choice){

      case 1: addEmployee();
       break;

      case 2: addAllEmployee();
       break;

      case 3: getEmployee();
       break;

      case 4: getEmployeeById();
      break;

      case 5: getEmployeeByRole();
       break;

      case 6: getEmployeeBySalary();
       break;

      case 7: getEmployeeByDOJ();
       break;

      case 8: deleteEmployeeById();
       break;

       case 9: updateEmployeeById();
        break;

      default: System.out.println("Invalid chooice");
       break;

     }

    }
  }
 public static void main(String[] args) {

   start();

 }
}