//Write a Java program to create a class Student with private attributes name and age. Provide public getter and setter methods to access and update these attributes. Demonstrate encapsulation by creating an instance and modifying the private attributes through getters and setters.
class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be positive.");
        }
    }
}

public class Program9 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Vikas");
        s.setAge(20);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Trying to set invalid age...");
        s.setAge(-5);
        System.out.println("Age is still: " + s.getAge());
    }
}
