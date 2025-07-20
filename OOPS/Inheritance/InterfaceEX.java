interface  i1 {
     int x = 6;//every variable in interface is public static final
     void f1();
     static void f2(){
        System.out.println("hello");//we can make function body after java 8 using static keyword.
     }
}
interface i2 extends i1 {//we use extends keyword for interface to extend another interface
    int y= 10;
    void f3();
}
class c1 implements i2{//we use implements when implementing an interface with class

    @Override
    public void f1() {
        
    }

    @Override
    public void f3() {
        
    }
    
}
public class InterfaceEX {
    public static void main(String[] args) {
       System.out.println(i1.x);  
       i1.f2();
       // i2.f2();//we cannot inherit static function
    }
}
