import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediateops {
    public static void main(String[] args) {
        // Intermediate operation convert a stream into another stream
        // They are lazy ,meaning they don't execute untill a terminal operation is invoked
         
        //1. Filter
        List <String> list=Arrays.asList("Akshit","Ram","Shyam","Ghanshyam");
        Stream<String> filterdStream=list.stream().filter(x -> x.startsWith("A"));
        //no filtering at this point 
        long res=list.stream().filter(x -> x.startsWith("A")).count();
        //System.out.println(res);

        //2. Map
        Stream<Object> stringStream=list.stream().map(x -> x.toUpperCase());

        //3. Sorted 
        Stream <String> sortedStream=list.stream().sorted();
        Stream<String> sortedStreamUsingComparator =list.stream().sorted((a,b) -> a.length()-b.length());
        //sorting using comparator

        //4. Distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        //5. Limit
        System.out.println(Stream.iterate(1, x -> x+1).limit(50).count());

        //6. Skip
         System.out.println(Stream.iterate(1, x -> x+1).skip(10).limit(50).count());//skip will start
         //counting from 11 it will skip first 10 element

         //7. Peek
    }
}
