//Write a Java program to create an interface Playable with a method play(). Create classes Football and Basketball that implement the interface. Use polymorphism to call the play() method.
interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football.");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball.");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Playable game1 = new Football();
        Playable game2 = new Basketball();
        game1.play();
        game2.play();
    }
}
