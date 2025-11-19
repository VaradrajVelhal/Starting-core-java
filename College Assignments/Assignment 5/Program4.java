//Write a Java program to demonstrate method overriding by creating a base class Employee with a method 
// getDetails(). Override this method in a derived class Manager to provide additional details.
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Department: " + department);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Mahesh", 40000);
        Manager mgr = new Manager("Rohan", 75000, "IT");
        emp.getDetails();

        mgr.getDetails();
    }
}
