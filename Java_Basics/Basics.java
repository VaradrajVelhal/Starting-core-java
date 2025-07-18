class Exaample{
    int a;//Instance(Object) Member Variable
    int b;//Instance(Object) Member Variable
    void fun1(){//Instance (Object) Member Function
        System.out.println("I am fun1....");
    }
    static void fun2(){//Static Member Function
        System.out.println("I am fun2....");
    }
}
public class Basics {
    static void fun1(){
        System.out.println("I am fun1....");
    }
    void fun2(){
        System.out.println("I am fun2....");
    }


    public static void main(String[] args) {
        Exaample ex=new Exaample();//Creating Object of Example class for accessing its members 
        ex.fun1();
        //If a function or variable is static we can access it without creating object of the class
        fun1();
        //if the static function is of other class we can access it like this ->
        Exaample.fun2(); 

        ex.a=5;//Assigning value to the Instance variable
        System.out.println(ex.a);//it will print 5 

        Exaample ex1 = new Exaample();
        System.out.println(ex1.a);//It will print 0
    }    
}
