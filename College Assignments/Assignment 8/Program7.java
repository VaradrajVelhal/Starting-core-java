//Write a Java program to create an interface AnimalActions with methods eat()
//and sleep(). Create classes Lion and Elephant that implement the interface and
//provide concrete implementations for both methods.
interface AnimalActions {
    void eat();

    void sleep();
}

class Lion implements AnimalActions {
    public void eat() {
        System.out.println("Lion eats meat");
    }

    public void sleep() {
        System.out.println("Lion sleeps in den");
    }
}

class Elephant implements AnimalActions {
    public void eat() {
        System.out.println("Elephant eats leaves");
    }

    public void sleep() {
        System.out.println("Elephant sleeps standing");
    }
}

class Program7 {
    public static void main(String[] args) {
        AnimalActions l = new Lion();
        AnimalActions e = new Elephant();

        l.eat();
        l.sleep();

        e.eat();
        e.sleep();
    }
}
