//IMPORTANT TOPIC

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors_Demo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Collectors is utility class 
        //Provides a set of methods to create common collectors

        // 1. Collecting to a List
        List<String> names=Arrays.asList("Alice","Bob","Charlie");
        List<String> res = names.stream()
        .filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set 
        List<Integer> nums = Arrays.asList(1,2,3,4,2,1,3,5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        //Collecting to Specific Collection
        LinkedList<String> list = names.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
        //We can convert to any collection using toCollection()

        // 4. Joining Strings
        //Concatenates Stream elements into a single stream
        String concatenatedNames = names.stream()
        .map(String::toUpperCase)
        .collect(Collectors
        .joining(" "));
        System.out.println(concatenatedNames);

        // 5. Summarizing Data
        //Generates statistical summary(count, sum, min, average, max)
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,90,2,43);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));

        System.out.println("Count: "+stats.getCount());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Max: "+stats.getMax());

        // 6. Calculating Averages: To directly calculate average
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: "+average);

        // 7. Counting Elements: Directly
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: "+count);
        
        // 8. Grouping Elements
        List<String> words=Arrays.asList("hello","world","java","streams","collecting");
        
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        // Output:- {4=[java], 5=[Hello, World], 7=[Streams], 10=[Collecting]}
        
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
        // Output:- {4=1, 5=2, 7=1, 10=1}

        TreeMap<Integer, Long> treeMap = words.stream()
        .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);
        // Output:- {4=1, 5=2, 7=1, 10=1}
        
        // 9. Partitionaning Element
        // Partitions elements into two groups (true and false) based on predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
        // Output:- {false=[hello, world, java], true=[streams, collecting]}

        // 10. Mapping and Collecting 
        // Applies a mapping function before collecting
        
        List<String> collect = words.stream()
        .collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println(collect);
        // Output:- [HELLO, WORLD, JAVA, STREAMS, COLLECTING] 


        //Example 1 : Collecting words by length
       System.out.println( words.stream().collect(Collectors.groupingBy(x -> x.length())));
       // Output:- {4=[java], 5=[hello, world], 7=[streams], 10=[collecting]}

       //Example 2 : Counting Word Occurrences
       String s="hello welcome to this world hello is word";
       System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x -> x,Collectors.counting())));
       // Output:- {world=1, this=1, is=1, to=1, hello=2, word=1, welcome=1}

       //Example 3 : Partitionning even and odd numbers
       System.out.println(nums.stream().collect(Collectors.partitioningBy(x -> x%2==0)));
       // Output:- {false=[1, 3, 1, 3, 5], true=[2, 4, 2]}

       //Example 4 : Summing Values in Map
       Map <String,Integer> item=new HashMap<>();
       item.put("apple", 6);
       item.put("orange", 7);
       item.put("banana", 12);
       item.put("mango", 10);

       System.out.println(item.values().stream().reduce(Integer::sum));
       System.out.println(item.values().stream().collect(Collectors.summingInt(x -> x)));
       // Output:- 35

       //Example 5 : Creating a Map from Stream Elements
       List <String> fruit=Arrays.asList("Apple","mango","Banana");
       System.out.println(fruit.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));
       // output:- {APPLE=5, MANGO=5, BANANA=6}

       //Example 6 : Use toMap() and count the occurance of the words
       System.out.println(words.stream().collect(Collectors.toMap(k -> k, v -> 1,(x,y) -> x+y)));
       // Output:- {java=1, world=1, streams=1, hello=1, collecting=1}

    }
}
