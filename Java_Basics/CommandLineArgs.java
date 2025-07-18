public class CommandLineArgs {
    public static void main(String[] args) {
        // public static void main(String[] args) -> Here String [] args is refering to array of string 
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);
        for (String string : args) {
            System.out.println(string);
        }
        //I compiled the program in terminal ->
//javac CommandLineArgs.java        
// java CommandLineArgs vishal mukesh karan vikas
// vishal
// mukesh
// karan
// vikas
    }
}
