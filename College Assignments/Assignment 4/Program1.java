//Write a Java program to define a class Student with attributes name and age. Create objects of the class and
//initialize them with values. Print the  details of each student.
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}

class Program1 {
    public static void main(String[] args) {
        Student s1 = new Student("Mukesh", 21);
        Student s2 = new Student("Suresh", 22);
        s1.displayInfo();
        s2.displayInfo();
    }
}