//Write a Java program to demonstrate multiple inheritance using interfaces by creating two interfaces,Readable and Writable,each with one method.Create a class File that implements both interfaces.
interface Readable {
    void read();
}

interface Writable {
    void write();
}

class File implements Readable, Writable {

    @Override
    public void read() {
        System.out.println("Reading data from file...");
    }

    @Override
    public void write() {
        System.out.println("Writing data to file...");
    }

}

public class Program9 {
    public static void main(String[] args) {
        File myFile = new File();
        myFile.read();
        myFile.write();
    }
}
