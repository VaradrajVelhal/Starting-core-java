//Write a Java program to create a class Car with a default constructor that
//initializes attributes make and year. Create an object of the class and
//display the initialized values.
class Car {
    String make;
    int year;

    public Car() {
        this.make = "Generic Car";
        this.year = 2025;
    }
}

class Program2 {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("Make: " + myCar.make);
        System.out.println("Year: " + myCar.year);
    }
}
