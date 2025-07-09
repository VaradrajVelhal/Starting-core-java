import java.util.PriorityQueue;

public class priorityQueue {
   public static void main(String[] args) {
    //part of the queue interface
    //orders elements based on their natural ordering (for primitives lowest first)
    //custom comparator for customized ordering
    //the head element is given most priority
    //does not allow null element

     PriorityQueue<Integer> pq=new PriorityQueue<>();
     pq.add(15);
     pq.add(10);
     pq.add(30);
     pq.add(5);
     System.out.println(pq);//It will give output as [5, 10, 30, 15] which is expected....

     while (!pq.isEmpty()) {
        System.out.println(pq.poll());//it will give output as [5,10,15,20] due to natural ordering.
     }

      
   } 
}
