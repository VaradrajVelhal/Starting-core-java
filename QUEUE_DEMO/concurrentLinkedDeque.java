import java.util.concurrent.ConcurrentLinkedDeque;

public class concurrentLinkedDeque {
    public static void main(String[] args) {
        //its non blocking, thread safe, Double-ended queue
        //Compare And Swap method is used 

        ConcurrentLinkedDeque<String> deque=new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.add("Element0");
        deque.add("Element2");
        System.out.println(deque);
    }
}
