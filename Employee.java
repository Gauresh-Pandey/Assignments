package EmployManagementSystem;
import java.util.ArrayList;
public class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary  = salary;
    }
    void displayDetails(){
        System.out.println(" ID: " + id + ", Name: " + name + ", salary: " + salary);
       }
       public static class EmployeeDemo{
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", 50000);
        Employee e2 = new Employee(2, "Washington", 60000);
        Employee e3 = new Employee(3, "Tom", 55000);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        for (Employee e : employees) {
            e.displayDetails();
        }
      }
    }
}

