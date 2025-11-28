//Write a Java program to create two packages, company and company.hr. In
//company, define a class Employee with various fields having different access
//modifiers (public, protected, default, and private). In company.hr, create a
//class HRManager that tries to access these fields and demonstrate which fields
//are accessible.

class Program2 {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.startEngine();
        c.move();

        Vehicle b = new Bicycle();
        b.move();
    }
}
