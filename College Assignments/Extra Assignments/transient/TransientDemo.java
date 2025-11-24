import java.io.*;

class User implements Serializable {
    String name = "Student";
    transient String password = "SecretPassword";
}

public class TransientDemo {
    public static void main(String[] args) throws Exception {
        // 1. Save Object (Serialize)
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(new User());
        out.close();

        // 2. Load Object (Deserialize)
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
        User u = (User) in.readObject();

        // 3. Prove it worked
        System.out.println("Name: " + u.name); // Output: Student
        System.out.println("Password: " + u.password); // Output: null
    }
}