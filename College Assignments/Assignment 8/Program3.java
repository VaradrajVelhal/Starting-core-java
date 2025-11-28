//Write a Java program to demonstrate that an abstract class can have a constructor.
//Create an abstract class Person with a constructor and a subclass
//Student that calls the superclass constructor.
abstract class Person {
    String name;

    // Abstract class constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor running...");
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
        System.out.println("Student constructor running...");
    }
}

class Program3 {
    public static void main(String[] args) {
        Student s = new Student("Kamlesh");
        System.out.println("Created student: " + s.name);
    }
}
