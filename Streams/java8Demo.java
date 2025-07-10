import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java8Demo {
    public static void main(String[] args) {
        //why java 8?
        //java 8 --> minimal code, Fumctional programming introduced
        //java 8 --> lambda Expression ,Streams, Date & Time API

        //Lmbda Expression
        //Lambda Expression is an annonymous function (no name, no return type, no access modifier )
        // syntax    ()->{}
        //Lambda Expression is used to implement functional interface
        Thread t1=new Thread(()->{
            System.out.println("hello");
        });

        // we will see another example
        //to avoid making another class to use maths interface's method we will create Lambda expression
        maths Addition =( a,b)  ->  a+b;//look how clean our code became
        maths Multiplication=(a,b) -> a*b;
        int ans =Addition.math(10, 20);
        int ans2=Multiplication.math(10, 10);
        System.out.println("the addtions is:  "+ans);
        //System.out.println("the subtraction is : "+ans2);


        //Predicate --> Functional Interface (boolean valued function)
        Predicate<Integer> predicate=x -> x>0;
        System.out.println("is the number positive :- "+predicate.test(88));
        
        
        Predicate <String> isStringwithV=(s)->s.toLowerCase().startsWith("v");
        //we can also combine two function with and(),or()
        Predicate <String> isEndingWithJ=(s) -> s.toLowerCase().endsWith("j");
        Predicate <String> and=isStringwithV.and(isEndingWithJ);
        System.out.println("the answer for is starting with V and ending with J is: "+and.test("Varadraj"));
         

        //Function --> works for you
        Function<Integer,Integer> doubleIt=(x) -> x*2;
        Function<Integer,Integer> tripleIt=(x) -> x*3;
        // System.out.println(doubleIt.apply(100));
        System.out.println(doubleIt.andThen(tripleIt).apply(10));//"andThen" is used here to 
        //first double the integer and then triple it
    
        Function<Integer,Integer> identity=Function.identity();
        //it returns the same value which is given to it
        System.out.println("the same value will be returned:-  "+identity.apply(102));


        //Consumer 
        //it takes value but doesn't return it (just like void)
        Consumer<Integer> consumer=x -> System.out.println(x);
        consumer.accept(5 );


        //Supplier
        Supplier<String> giveHello= () -> "Hello";
        System.out.println(giveHello.get()
        );

        //UnaryOperator
        // Function <Integer,Integer> doubleThis=(a) -> a*2;
        UnaryOperator<Integer> doubleThis= a -> a*2;//we can use UnaryOperator when we know that
        //argument and return type is same
        
        BinaryOperator<Integer> add=(x,y)->x+y;//when we know that both arguments and return type
        //is same


        //Method reference --> use method without invoking & in place of lambda expression
        List<String> student=Arrays.asList("ram","sham","ghanshyam");
        //student.forEach(x -> System.out.println(x) );
        student.forEach(System.out::println);


        //constructor reference 
        List<String> name=Arrays.asList("A","B","C");
        List<MobilePhone> mobilePhonelist= name.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        
    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
    
}




//suppose if we didn't has Lambda expression we would have to make another class to use math method properly
//like this -->
// class mathDemo implements maths{

//     @Override
//     public int math(int a, int b) {
//         return a+b;
//     }

// }

interface maths {
    public int math(int a,int b);    
}