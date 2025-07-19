abstract class Animal{
     abstract void sound();
     void sleep(){
        System.out.println("Horse is sleeping....");
     }
}
class Dog extends Animal{

    @Override
    void sound() {
       System.out.println("Dog is barking....");
    }
    
}
public class AbstractEX {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
        d.sound();
        //Output ->
        // Horse is sleeping....
        // Dog is barking....
    }
}
