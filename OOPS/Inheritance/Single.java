class Nokia1 {
    int x;
    int y;
    Nokia1(int x,int y){
        //This keyword is used to avoid the conflict of same variable names, This keyword point to the object of class
        // (x,y) here n1 object is pointing to x, y, f1, f2, f3, z 
        //So this keyword points to x and y here 
        this.x=x;
        this.y=y;
        System.out.println("Parent class Constructor is called....");
    }
    void f1(){
        System.out.println("Parent function 1 is executed....");
    }

    void f2(){
        System.out.println("Parent function 2 is executed....");
    }
}

class Nokia2 extends Nokia1{
    int z;
    Nokia2(){
        //super();//if we dont write super keyword compiler writes it but whats the need for us to write 
        //super keyword? the answer is we can pass arguments in super keyword which will be passed to parent class
        //Constructor. ex.
        super(5,6);
        System.out.println("Child class Constructor is called....");
    }
    void f3(){
        System.out.println("Child function 3 is executed....");
    }
}

public class Single {
    // 1. Signle Inheritance -> One class inherites from one superclass its called single Inheritance with
    //extends keyword.
    public static void main(String[] args) {
        Nokia2 n1 = new Nokia2();
        // First parent class constructor will be called because child class is extending parent class.
        //The compiler writes super keyword in clilds constructor.
        n1.f1();
        n1.f2();
        n1.f3();
        //Output -> 
// Parent class Constructor is called....
// Child class Constructor is called....
// Parent function 1 is executed....
// Parent function 2 is executed....
// Child function 3 is executed....

//Child class constructor is called first but parent class constructor is executes first.
    }
}
