import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class blockingQueue {
    public static void main(String[] args) {
        // blocking queue is Thread Safe 
        // wait for queue to become non-empty / wait for space
        //simplify concurrency problem like producer - consumer 
        //standard queue --> immediately (Process methods immidiately)
          //empty --> remove (no waiting)
          //full --> add (no waiting)
        //Blocking Queue
          //put --> Blocks if the queue is full untill space becomes available 
          //take --> Blocks if the queue is empty until an element becomes available
          //offer --> Waits for sapce to become available ,up to the specified timeout
      BlockingQueue<Integer> queue1=new ArrayBlockingQueue<>(5);
      //A bounded , blocking queue backed by circular array
      //low memory overhead
      //uses a single lock for both enqueue and dequeue operation
      //more threads --> problem

      BlockingQueue<Integer> queue2=new LinkedBlockingQueue<>();
      //optionally bounded backed by linkedList 
      //uses two separate locks for enqueue and dequeue operation
      //Higher concurrency between producers and consumers

      BlockingQueue<String> queue3=new PriorityBlockingQueue<>(11,Comparator.reverseOrder());
      //unbounded
      //binary Heap as array
      //Head is based on their natural ordering or a provided comparator like priority queue
      //put wont block
      queue3.add("apple"); 
      queue3.add("banana"); 
      queue3.add("cherry");
      System.out.println(queue3); 


      BlockingQueue<Integer> queue4=new SynchronousQueue<>();
      //Each insert operation must wait for a corrosponding remove operation by another thread 
      //and vice-versa.
      //It cannot store element,capacity of atmost one element 

    }    
}
