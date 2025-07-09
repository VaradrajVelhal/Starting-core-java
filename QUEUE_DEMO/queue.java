import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // A Data Structure that works on FIFO (First In First Out) Principle
        //Element are added at the end and removed from the front 

        //Linked list can act like a queue and stack

        LinkedList<Integer> queue=new LinkedList<>();
        queue.addLast(1);//here we are using addLast() to add the element at last
        queue.addLast(2);//when we insert element in queue its called "ENQUEUE"
        queue.addLast(3);
        queue.addLast(4);
        System.out.println(queue);
        queue.removeFirst();//here this method will remove first elemnt 
        //When we remove element from queue its called "DEQUEUE"
        System.out.println(queue);



        Queue<Integer> queue2=new LinkedList<>();
        queue2.add(1);

        System.out.println(queue2.remove());//Throws exception java.util.NoSuchElementException
        //if queue is empty

        System.out.println(queue2.poll());//will remove the element from queue and wont throw
        //exception even if queue is empty(if  queue is empty it will return "null")

        //queue2.add(2);
        System.out.println(queue2.element());//reuturns topmost element just like peek()
        //Throws exception if empty -> "java.util.NoSuchElementException"

        //also same with add() and offer() add throws exception offer doesent....
        
    }
}
