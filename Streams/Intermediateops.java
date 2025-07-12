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
         // Performs a action on each element as it is consumed 
         Stream.iterate(1, x -> x+1).skip(10).limit(10).peek(System.out::println).count();
         //it will print 11 to 20

         //8. flatMap
         //Handle streams of collections, lists, or arrays where each element is itself a collection 
         //Flatten nested structures (eg. lists withim lists) so that they can be processed  as a single 
         //sequence of elements
         //Transform and flatten elements at the same time.
         
        List<List<String>> listOfLists=Arrays.asList(
            Arrays.asList("apple","banana"),
            Arrays.asList("orange","kiwi"),
            Arrays.asList("peer","grape")
            );

            System.out.println(listOfLists.get(1).get(0)); // Output:- orange
            //suppose we want to make this list of lists all elements capital we will use flatmap....
            List<String> upperCase = listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();
            System.out.println(upperCase);// Output:- [APPLE, BANANA, ORANGE, KIWI, PEER, GRAPE]
            
            List<String> sentances=Arrays.asList(
                "Hello world",
                "Java stream are powerful",
                "FlateMap is useful"
            );
            //suppose we want to split every word and make another strean of words....
            List<String> answer = sentances.stream()
            .flatMap(sentace -> Arrays.stream(sentace.split(" ")))
            .map(String::toUpperCase)
            .toList();
            System.out.println(answer);


        }
}
