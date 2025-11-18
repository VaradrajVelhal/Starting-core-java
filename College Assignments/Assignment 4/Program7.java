//Write a Java program to create a class Employee with a static variable companyName and non-static variables name
//and salary. Display the details of employees along with the company name.

class Employee {
    static String companyName = "TCS";
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Suresh", 50000);
        Employee e2 = new Employee("Hitesh", 60000);

        e1.display();
        e2.display();
    }
}
