package SampleTask.EmployeeTask;
/*
class Employee {

Find the highest-paid employee in each department.
Find the average salary of employees in each city.
List employees grouped by department and then by city.
Find the youngest employee in the company.
List employees earning more than 60,000 and sort them by salary (descending).
Check if all employees are above 25 years old.
Get a comma-separated string of all employee names sorted alphabetically.
Partition employees into two groups: salary above 70,000 and below/equal to 70,000.
Find top 3 highest-paid employees across the company.
Find average age of employees per department
 */
public class Employee {
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
                ']'+"\n";
    }
}
