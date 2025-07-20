/* 
1. Encapsulation

Definition:
Encapsulation means hiding internal details of a class and exposing only necessary parts through public methods (getters/setters).

Example:

class Student {
    private String name;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}

 Benefits:

    Protects data

    Controls access

    Easy to maintain

2. Inheritance

Definition:
Inheritance allows a class (child) to acquire properties and methods from another class (parent).

Example:

class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}

Benefits:

    Code reuse

    Better organization

3. Polymorphism

Definition:
Polymorphism means one method behaves differently based on the object or input.

🔸 Types:

    Compile-time (Overloading) – same method name, different parameters

    Run-time (Overriding) – method in child class overrides parent’s version

Example:

// Overriding
class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}

Benefits:

    Flexibility

    Code extensibility

4. Abstraction

Definition:
Abstraction means hiding complex logic and showing only the essential features.

Achieved by:

    Abstract classes

    Interfaces

Example:

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}
Benefits:

    Focus on what an object does, not how it does

    Helps in designing flexible systems*/

