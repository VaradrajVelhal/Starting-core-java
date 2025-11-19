//Write a Java program to create an interface Printable with a method print(). Create a class Document that implements the Printable interface and provides the implementation for the print() method.
interface Printable {
    void print();
}

class Document implements Printable {

    @Override
    public void print() {
        System.out.println("Printing the document...");
    }
}

public class Program8 {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
    }
}
