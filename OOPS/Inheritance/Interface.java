import java.security.Key;

public class Interface {
    public static void main(String[] args) {
          /*  What is an interface in Java?

An interface is like a contract that says:

    "Any class that uses me must implement these methods."

It is used to achieve abstraction and multiple inheritance in Java.
 Key Points:

    It only contains method declarations (no method body).

    All methods are public and abstract by default.

    A class uses implements to use an interface.

    A class can implement multiple interfaces (Java doesn't support multiple class inheritance).

 Simple Real-life Example:

 Think of an interface like a remote control interface.
The remote has buttons like powerOn() and volumeUp(),
but each brand of TV (Sony, LG, Samsung) provides its own working for these buttons.
 Simple Code Example:

interface Animal {
    void sound(); // method declaration only
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Output: Dog barks
    }
}

🤔 Why use interface?

    To write clean and flexible code

    To make code follow a certain structure

    To support multiple inheritance
*/

    }
}
