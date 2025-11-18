//Write a Java program to create a class Book with a copy constructor
//to copy the attributes of one book object to another.
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
    }

    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Book b1 = new Book("Java 101", "John Doe");
        Book b2 = new Book(b1);
        b1.display();
        b2.display();
    }
}
