import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.List;


public class TerminalOps {
    private static Optional<Integer> reduce;

    public static void main(String[] args) {
        //Terminal operation means you want to get resultfrom stream

        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        //1. Collect
        System.out.println(list.stream().filter(x -> x%2==0).collect(Collectors.toList()));
        list.stream().filter(x -> x%2==0).toList();//we can use toList also in place of Collectors.toList()

        //2. For Each
        list.stream().forEach(x -> System.out.println(x));

        //3. Reduce : Combines elements to produce a single result
        Optional<Integer> reduce2 = list.stream().reduce((x,y) -> x+y);
        System.out.println(reduce2.get());

        //4. Count 

        //5. anyMatch ,allMatch, noneMatch
        boolean anyMatch = list.stream().anyMatch(x -> x%2==0);
        System.out.println(anyMatch);

        boolean allMatch = list.stream().allMatch(x -> x > 0);
        System.out.println(allMatch);

        boolean noneMatch = list.stream().noneMatch(x -> x<0);
        System.out.println(noneMatch);

        //6. findFirst, findany
        Optional<Integer> any = list.stream().findAny();
        System.out.println("findAny()  "+any.get());
        System.out.println("findFirst()  "+list.stream().findFirst().get());


        //Example 1 : find the names with length 3

        List<String> names=Arrays.asList("anna","marco","david","bob","sid");
        List<String> ans = names.stream().filter(x -> x.length()==3).toList();
        System.out.println("Answer of Example 1  "+ans);

        //Example 2 : find the square of numbers and sort them
        List<Integer> nums = Arrays.asList(5,8,3,4);
        System.out.println("Answer of Example 2  "+ nums.stream().map(x -> x*x).sorted().toList());


        //Example 3 : find the sum of all numbers in list
        List<Integer> ints = Arrays.asList(10,20,30,40);
        System.out.println("Answer of the Example 3  "+ints.stream().reduce((x,y) -> x+y));


        //Example 4 :Counting Occurrences of a Charecter (find number of L here)
        String sentance="Hello World";
        System.out.println("Answer of Example 4  "+sentance.chars().filter(x -> x=='l').count());


        // Stateful & Stateless operation
        
        //Stateful : The operation will know about other elements.
    }
}
