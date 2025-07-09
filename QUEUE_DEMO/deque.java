import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        //its a double ended queue
        //allows insertion and removal from both ends
        //versatile than regular queues and stacks because they support all the operation of both
        Deque<Integer> dq=new ArrayDeque<>();//faster iteration ,low memeory,no null allowed 
        //no need to shift element if they are reoved because ArrayDeque uses circular array

        dq.addFirst(10);
        dq.addLast(20);
        //10,20
        dq.addLast(5);
        dq.addLast(25);
        //5,10,20,25
        System.out.println("First Element: "+ dq.getFirst());//5
        System.out.println("Last Element: "+ dq.getLast());//25


        Deque<Integer> dq2 =new LinkedList<>();//used when you want to do Insertion , deletion Somewhere 
        //in the middle

        
        
    }
}
