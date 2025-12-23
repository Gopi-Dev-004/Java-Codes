package java8.DateTimes;


import javax.swing.text.DateFormatter;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
      int id;
      String name;
      String department;
      LocalDate joiningDate;
      LocalDate relivingDage;

    public Employee(int id, String name, String department, LocalDate joiningDate,  LocalDate relivingDage) {
        this.id = id;
        this.department = department;
        this.joiningDate = joiningDate;
        this.name = name;
        this.relivingDage = relivingDage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", joiningDate=" + joiningDate +
                ", relivingDage=" + relivingDage +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getRelivingDage() {
        return relivingDage;
    }

    public class EmpGroupTask {

    }
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static   List<Employee> employeeList = Arrays.asList(
            new Employee(101, "Raja","Developer", LocalDate.parse("20/12/2002", formatter), LocalDate.parse("20/12/2013", formatter)),
            new Employee(102, "Mani","Developer", LocalDate.parse("15/03/2003", formatter), LocalDate.parse("18/07/2006", formatter)),
            new Employee(103, "Arun","Developer", LocalDate.parse("05/06/2004", formatter), LocalDate.parse("10/06/2027", formatter)),
            new Employee(104, "Kumar","UI", LocalDate.parse("22/09/2002", formatter), LocalDate.parse("25/10/2005", formatter)),
            new Employee(105, "Siva", "UI",LocalDate.parse("12/01/2005", formatter), LocalDate.parse("14/01/2018", formatter)),
            new Employee(106, "Vijay", "UI",LocalDate.parse("10/02/2006", formatter), LocalDate.parse("12/04/2009", formatter)),
            new Employee(107, "Ajith","Full Stack", LocalDate.parse("08/04/2003", formatter), LocalDate.parse("10/08/2011", formatter)),
            new Employee(108, "Muthu", "Full Stack",LocalDate.parse("01/07/2003", formatter), LocalDate.parse("01/07/2011", formatter)),
            new Employee(109, "Deepak","Front end", LocalDate.parse("20/10/2003", formatter), LocalDate.parse("20/12/2011", formatter)),
            new Employee(110, "Karthik", "Front end",LocalDate.parse("11/12/2003", formatter), LocalDate.parse("15/12/2011", formatter))
    );


    public static void find(){
        Map<Long,String> result =  employeeList.stream()
                .collect(Collectors.groupingBy(x->
                                ChronoUnit.YEARS.between(x.getJoiningDate(),x.getRelivingDage()),
                        Collectors.mapping(emp->emp.getName(),Collectors.joining(",","[","]") )));
        System.out.println(result);
    }

    public static void findLargeServe(){
        //Find out the employee who serving largest of all
//  Map result =    employeeList.stream()
//                .collect(Collectors.groupingBy(
//                        emp-> emp.getDepartment(), Collectors.collectingAndThen(
//                        Collectors.maxBy(Comparator.comparingLong(
//                                e-> ChronoUnit.DAYS.between(e.joiningDate , e.relivingDage)
//                                        - ChronoUnit.DAYS.between(e.joiningDate , e.relivingDage) )),
//                               op->op.get().getName() )
//                ));
        Map result =    employeeList.stream()
                .collect(Collectors.groupingBy(
                        emp-> emp.getDepartment(), Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingLong(
                                e-> ChronoUnit.DAYS.between(e.joiningDate , e.relivingDage)
                                        - ChronoUnit.DAYS.between(e.joiningDate , e.relivingDage) )),
                               op->op.get().getName() )
                ));
        System.out.println(result);
    }

    public static void averageServ(){
        //Find out all employees average serving durations
        // get all employee exprience and find average

      Double r =   employeeList.stream()
                .collect(
                        Collectors.averagingLong(
                                e-> ChronoUnit.YEARS.between(e.joiningDate,e.relivingDage))
                );

        System.out.println(r);
    }

    public static void groupJoiningYear(){
        //Group by employees by joining years.

       Map<Integer,List<String>> result = employeeList.stream()
                .collect(Collectors.groupingBy(
                        year->year.joiningDate.getYear(),
                       Collectors.mapping(x->x.getName(),
                               Collectors.toList()
                       )
                ));
       for(Map.Entry<Integer,List<String>> e : result.entrySet()) {
           System.out.println(e);
       }
    }

    public static void groupSenior(){
        //group senior by department
      Map<String,String> result = employeeList.stream()
                .collect(Collectors.groupingBy(
                        emp->emp.getDepartment(),
                        Collectors.collectingAndThen(
                                Collectors.minBy(
                                        (x,y)->x.getJoiningDate().getYear()- y.getJoiningDate().getYear()
//                                        Comparator.comparingInt(x->x.joiningDate.getYear()
//                                        - x.getJoiningDate().getYear())
                                        ),
                                em -> em.get().getName())
                ));
      for(Map.Entry<String,String> e : result.entrySet()){
            System.out.println(e);
        }
    }

    public static void sortByDuration(){
      List<String> result = employeeList.stream()
                .sorted(Comparator.
                        comparingInt(emp-> emp.getJoiningDate().getYear())
                ).collect(Collectors.mapping(x->x.getJoiningDate().getYear()+"  ===>   "+x.getName(),Collectors.toList()));
      for(String s : result){
          System.out.println(s);
      }
    }

    public static void sortByJoiningDate(){
//       List<String> s = employeeList.stream()
//                .sorted(Comparator.comparingInt(emp -> (int) ChronoUnit.DAYS.between(emp.getJoiningDate(),LocalDate.now())))
//                .collect(Collectors.mapping(x->  x.getJoiningDate()+" ===> "+x.getName(), Collectors.toList()));
//        for(String r : s){
//            System.out.println(r);
//        }
        List<String> s = employeeList.stream()
                .sorted((x,y)->x.joiningDate.compareTo( x.getJoiningDate()))
                .collect(Collectors.mapping(x->  x.getJoiningDate()+" ===> "+x.getName(), Collectors.toList()));
        for(String r : s){
            System.out.println(r);
        }
    }

    public static void sortByRelivingDate(){
       List<String> s =  employeeList.stream()
                .sorted(Comparator.comparingInt(emp -> (int) ChronoUnit.DAYS.between(emp.relivingDage,LocalDate.now())))
                .collect(Collectors.mapping( e-> ChronoUnit.DAYS.between(e.getJoiningDate(),e.getRelivingDage())+" ===> "+e.getName(),Collectors.toList()));

    for(String e : s){
        System.out.println(e);
    }
    }

    public static void main(String[] args) {

//        sortByRelivingDate();
//        sortByJoiningDate();
//        sortByDuration();
//        groupSenior();
//        groupJoiningYear();
//        averageServ();
//        findLargeServe();
//       Long days = ChronoUnit.DAYS.between(employeeList.getFirst().joiningDate, employeeList.getFirst().relivingDage);
//        System.out.println(days);

    }
}
