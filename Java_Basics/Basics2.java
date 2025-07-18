//Accessing private instance members and Static members
class Demo{
    private static int x = 5;
    static void fun(){
        System.out.println(x);
    }
}
public class Basics2 {
    public static void main(String[] args) {
        //How can we access private static member of Demo class?
        //To access private static member of Demo class we need to create a function and access the variable there
        //then we can access the private static variable 
        //we can access x by creating object of Demo class and without creating object of Demo class 
        Demo.fun();//Without creating Object 
        Demo demo=new Demo();
        demo.fun();//By creating Object
            
    }    
}
