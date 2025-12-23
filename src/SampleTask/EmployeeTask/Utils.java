package SampleTask.EmployeeTask;

import java.util.Comparator;

public class Utils {
}
class BySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
       return (int) (o2.getSalary() - o1.getSalary());
    }
}
