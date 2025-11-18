//Write a Java program to create a class Student with attributes name and grade. Create an array of Student 
//objects and initialize them with values. Display the details of each student.
class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class program10 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Ganesh", "A");
        students[1] = new Student("Jayraj", "B+");
        students[2] = new Student("Suresh", "A-");
        for (Student s : students) {
            System.out.println("Student: " + s.name + ", Grade: " + s.grade);
        }
    }
}
