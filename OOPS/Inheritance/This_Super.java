class Example1{
    int x;
    int y;
    void f1(int x,int y){
        this.x=x;
        this.y=y;//we are setting value of x and y
    }
}

class Example2 extends Example1{
    int x;
    int y;
    //So if we want to set values for x and y of super class, we cannot set here with this keyword.
    //To overcome this we use super keyword, super keyword is used to refer to super class members.
    void f2(int x,int y){
        super.x=x;
        super.y=y;
    }
    void display(){
        System.out.println("Example2(child) class members x and y value -> " + this.x +" "+ this.y);
        System.out.println("Example1(parent) class members x and y value -> " + super.x +" "+ super.y);
    }
}
public class This_Super {
    public static void main(String[] args) {
        Example2 ex = new Example2();
        ex.f2(5, 10);
        ex.display();
        //Output ->
        //Example2(child) class members x and y value -> 0 0
         // Example1(parent) class members x and y value -> 5 10

    }
}
