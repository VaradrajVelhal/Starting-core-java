import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_demo {
    public static void main(String[] args) {
        //Stream is feature Introduced in java 8
        //Process collection of data in a functional and declarative manner   
        //Simplify data processing (simplify use of if else ,loops etc.)
        //Embrace Functional Programming 
        //Improve Readability and Maintainability
        //Enable Easy Paralielism

        //What is Stream?
        //A sequence of elements supporting functional and declarative programming 


        //how to use Stream ?
        //Source , intermediate operations & terminal operation
        List <Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //when you want to use declarative and functional programming convert that data collection 
        //in Stream

        // Example
        //If we want to count number of even numbers in list number above.
        //traditional method
        
        int count=0;
        for (Integer integer : number) {
            if(integer %2==0){
                count++;
            }
        }
        System.out.println("The number of even numbers are :- "+count);

        //By converting data to Stream

        System.out.println("The number of even numbers are (Using Stream) -> "+number.stream().filter(x -> x%2==0).count());
        //lokk how small our code became :)

        //Creating Stream
        //1. From collection
         List <Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
          Stream <Integer> stream=list.stream();
    
        //2. From arrays
        String []arr={"A","B","C"};
        Stream<String> stream2=Arrays.stream(arr);

        //3. Using Stream.of()
        Stream<String> stream3=Stream.of("a","b");

        //4. Infinite Stream
        Stream <Integer> generate=Stream.generate(() -> 1).limit(50);//It will genrate Stream of 1 infinitely
        //if we remove limit()
        Stream.iterate(1, x -> x+1).limit(50);//it will genrate infinite stream of count from 1 to n
        
    }
}
