import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class premitiveStream {
    public static void main(String[] args) {
        int [] numbers={1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        
        //range()
        System.out.println(IntStream.range(1, 5)
        .boxed()
        .collect(Collectors.toList())); //Output:- [1, 2, 3, 4]
        
        //rangeClosed()
        System.out.println(IntStream.rangeClosed(1, 5)
        .boxed()
        .collect(Collectors.toList())); //Output:- [1, 2, 3, 4, 5]

        // .of
        IntStream.of(1,2,3,4);


        DoubleStream randomDoubles = new Random().doubles(5);
        // System.out.println(randomDoubles.sum());
        // System.out.println(randomDoubles.min());
        // System.out.println(randomDoubles.max());
        // System.out.println(randomDoubles.average());
        // randomDoubles.summaryStatistics();
        // randomDoubles.mapToInt(x -> (int) ( x + 1));
        System.out.println("5 random Double values are:- "+randomDoubles.boxed().toList());

        IntStream randomInts = new Random().ints(5);
        System.out.println("5 random Integer values are:- "+randomInts.boxed().toList());
    }
}
