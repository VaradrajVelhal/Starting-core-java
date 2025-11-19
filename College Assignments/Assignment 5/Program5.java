//Write a Java program to demonstrate the use of the super keyword to invoke the parent class's constructor and methods in a derived class Student that extends Person.
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void message() {
        System.out.println("This is the Person class.");
    }
}

class Student extends Person {

    Student(String name) {
        // Calling parent constructor
        super(name);
    }

    void display() {
        // Call parent method
        super.message();
        System.out.println("Student Name: " + name);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Student s = new Student("s1");
        s.display();
    }
}
