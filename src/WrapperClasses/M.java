package WrapperClasses;

import java.util.*;

class Employee {
    int id;
    String name;
    int age;
    String department;
    double salary;
    String email;

    Employee(int id, String name, int age, String department, double salary, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.email = email;
    }

    // Override equals() to compare objects based on fields
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee emp = (Employee) obj;
        return id == emp.id &&
                age == emp.age &&
                Double.compare(emp.salary, salary) == 0 &&
                Objects.equals(name, emp.name) &&
                Objects.equals(department, emp.department) &&
                Objects.equals(email, emp.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, department, salary, email);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}

public class M {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees with duplicates
        employees.add(new Employee(1, "Ram", 25, "IT", 50000, "ram@example.com"));
        employees.add(new Employee(2, "Sam", 28, "HR", 40000, "sam@example.com"));
        employees.add(new Employee(3, "John", 30, "Finance", 55000, "john@example.com"));
        employees.add(new Employee(1, "Ram", 25, "IT", 50000, "ram@example.com")); // duplicate
        employees.add(new Employee(4, "David", 35, "Admin", 60000, "david@example.com"));
        employees.add(new Employee(2, "Sam", 28, "HR", 40000, "sam@example.com")); // duplicate
        employees.add(new Employee(5, "Alex", 27, "IT", 48000, "alex@example.com"));
        employees.add(new Employee(6, "Robert", 40, "Finance", 70000, "robert@example.com"));
        employees.add(new Employee(3, "John", 30, "Finance", 55000, "john@example.com")); // duplicate
        employees.add(new Employee(7, "Steve", 32, "IT", 52000, "steve@example.com"));
        employees.add(new Employee(1, "Ram", 25, "IT", 50000, "ram@example.com"));
        employees.add(new Employee(2, "Sam", 28, "HR", 40000, "sam@example.com"));
        employees.add(new Employee(3, "John", 30, "Finance", 55000, "john@example.com"));
        employees.add(new Employee(1, "Ram", 25, "IT", 50000, "ram@example.com")); // duplicate
        employees.add(new Employee(4, "David", 35, "Admin", 60000, "david@example.com"));
        employees.add(new Employee(2, "Sam", 28, "HR", 40000, "sam@example.com")); // duplicate
        employees.add(new Employee(5, "Alex", 27, "IT", 48000, "alex@example.com"));
        employees.add(new Employee(6, "Robert", 40, "Finance", 70000, "robert@example.com"));
        employees.add(new Employee(3, "John", 30, "Finance", 55000, "john@example.com")); // duplicate
        employees.add(new Employee(7, "Steve", 32, "IT", 52000, "steve@example.com"));

        System.out.println("Before removing duplicates:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // New list for unique employees
        List<Employee> uniqueList = new ArrayList<>();

        // Loop to remove duplicates manually
        for (Employee e : employees) {
            boolean isDuplicate = false;

            // Check if already present in uniqueList
            for (Employee u : uniqueList) {
                if (e.equals(u)) {   // uses equals() method
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueList.add(e);
            }
        }

        System.out.println("\nAfter removing duplicates:");
        for (Employee e : uniqueList) {
            System.out.println(e);
        }
    }
}
