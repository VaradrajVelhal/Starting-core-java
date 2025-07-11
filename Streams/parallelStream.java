import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class parallelStream {
    public static void main(String[] args) {
        // A type of Stream that enables parallel processing of element
        // Allowing multiple Threads to process parts of the Stream simulteneusly
        // This can significantly improve performance for large data sets
         
        long starttime=System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(parallelStream::factorial).toList();
        long endtime=System.currentTimeMillis();
        System.out.println("Time taken using sequential stream :- "+(endtime-starttime)+"ms");
        //output:- Time taken using sequential stream :- 469ms

        //same task using parallel stream

        long starttime1=System.currentTimeMillis();
         list.parallelStream().map(parallelStream::factorial).toList();
        long endtime1=System.currentTimeMillis();
        System.out.println("Time taken using parallel Stream :- "+(endtime1-starttime1)+"ms");
        //output:- Time taken using parallel Stream :- 136ms


        //Parallel stream are most effective for CPU intensive or large datasets where tasks are indipendant 
        //They may add overhead for simple tasks or small datasets
         
        //When we use parallel stream where taks are dependant
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum=new AtomicInteger(0);
        List<Integer> comulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
        System.out.println("Expected comulative sum : [1, 3, 6, 10, 15]");
        System.out.println("Actual result with parallel stream: "+comulativeSum);
        // Output -> Actual result with parallel stream: [11, 10, 8, 15, 5]
    }
    private static long factorial(int n){
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
