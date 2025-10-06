//Write a progam to print hello world 5 times by calling function inside function.
public class Rec_ex {
    public static void main(String[] args) {
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();//Calling function inside function
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
        message5();
    }
    static void message5(){
        System.out.println("Hello World");
    }

}
