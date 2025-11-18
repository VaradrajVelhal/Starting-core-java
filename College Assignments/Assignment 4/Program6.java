//Write a Java program to create a class Person with attributes name and age. Use the this keyword to   
//differentiate between instance variables and parameters in the constructor.
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I am " + this.name + " and I'm " + this.age + "Years old.");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Person p = new Person("Mukul", 25);
        p.introduce();
    }
}
