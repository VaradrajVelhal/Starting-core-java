//Write a Java program to create an interface Playable with a method play().
//Create two classes, Music and Video, that implement the Playable interface
//and provide concrete implementations of the play() method.
interface Playable {
    void play();
}

class Music implements Playable {
    public void play() {
        System.out.println("Playing song...");
    }
}

class Video implements Playable {
    public void play() {
        System.out.println("Playing movie...");
    }
}

class Program6 {
    public static void main(String[] args) {
        Playable m = new Music();
        Playable v = new Video();
        m.play();
        v.play();
    }
}
