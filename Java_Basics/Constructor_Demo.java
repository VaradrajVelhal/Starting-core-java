public class Constructor_Demo {
    //Constructor is a special function , we don't need to call constructor it is automatically called at the time 
    //of object creation.

    // Types of Constructor
    // 1. Default Constructor (campiler)
    // 2. No Arguments Constructor (user)
    // 3.Parameterized Constructor (user)
    public static void main(String[] args) {
        //Constructor is used to assign values to member variables at the time of object creation.
        demo d1=new demo(5, 10);// Here we are passing values for x and y.
        d1.display();//5, 10
        demo d2=new demo();
        d2.display();//0, 0
        demo d3 =new demo(8);
        d3.display();//8, 0
    }
}
class demo {
    int x;
    int y;
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    // Creating Constructor of demo class Constructor has same name as class name.
    // Here we are taking int a , int b as arguments to assign values to member variables.
    // We will have to enter this values when we create object of class.
    demo(int a,int b){
        x=a;
        y=b;
    }

    // We can also create another constructor
    // This is called Constructor overloading 
    // When we call constructor at the time of object creation the compiler will decide to call which 
    //Constructor depending on arguments passed
    demo(){
        
    }
    demo(int p){
        x=p;
    }
}
