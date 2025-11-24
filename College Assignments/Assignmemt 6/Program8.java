//Write a Java program to demonstrate dynamic method dispatch by creating a superclass Media with a method play(). Create subclasses Video and Audio that override play(). Use dynamic method dispatch to call these methods.
class Media {
    void play() {
        System.out.println("Playing media...");
    }
}

class Video extends Media {
    @Override
    void play() {
        System.out.println("Playing Video.");
    }
}

class Audio extends Media {
    @Override
    void play() {
        System.out.println("Playing Audio.");
    }
}

public class Program8 {
    public static void main(String[] args) {

        Media media;
        media = new Video();
        media.play();
        media = new Audio();
        media.play();
    }
}
