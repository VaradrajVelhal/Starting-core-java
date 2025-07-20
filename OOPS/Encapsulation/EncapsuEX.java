/*What is Encapsulation in Java?

Encapsulation is the process of hiding the internal details of a class and only allowing access through public methods (getters and setters).
It’s like a capsule that keeps data safe from outside interference.
*/
class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Getter method (to read name)
    public String getName() {
        return name;
    }

    // Setter method (to set name)
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

class EncapsuEX {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setters
        s.setName("Varad");
        s.setAge(21);

        // Getting values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
