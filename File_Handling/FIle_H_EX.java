import java.io.*;
public class FIle_H_EX {
   public static void main(String[] args) throws IOException {
    /*
    File f1 = new File("F1.txt");
    f1.createNewFile(); 

    System.out.println(f1.exists());
    System.out.println(f1.canWrite());
    System.out.println(f1.length());
    
    Output :-
    true 
    true
    0 
    */
    FileOutputStream f2 = new FileOutputStream("F1.txt");
    //we can put only single charecter in file using .write()
    String s1 = "Hello World";
    char c1[]=s1.toCharArray();
    for (int i = 0; i < c1.length; i++) {
        f2.write(c1[i]);
    }
    f2.close();
   }
}
