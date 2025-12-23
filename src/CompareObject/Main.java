package CompareObject;

import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee emp = (Employee) obj;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Ram"));
        employees.add(new Employee(2, "Sam"));
        employees.add(new Employee(3, "John"));
        employees.add(new Employee(1, "Ram"));  // duplicate
        employees.add(new Employee(4, "David"));
        employees.add(new Employee(2, "Sam"));  // duplicate
        employees.add(new Employee(5, "Alex"));
        employees.add(new Employee(6, "Robert"));
        employees.add(new Employee(3, "John")); // duplicate
        employees.add(new Employee(7, "Steve"));

        System.out.println("Before removing duplicates:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Remove duplicates using HashSet
        Set<Employee> uniqueEmployees = new HashSet<>(employees);

        System.out.println("\nAfter removing duplicates:");
        // 👉 Using normal loop instead of forEach
        for (Employee e : uniqueEmployees) {
            System.out.println(e);
        }
    }
}
