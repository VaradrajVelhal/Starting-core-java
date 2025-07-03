import java.util.LinkedList;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
       //stack is arrangement of data it follows  Last in first out (LIFO) principle
       //stack extends vector so its thread safe
       Stack <Integer> stack=new Stack<>();
       stack.push(1);//push is used to add elements in stack
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);

       //stack.pop;//its removes the last element in stack which was pushed ex.  4
       int showPopedElement=stack.pop();//it will return which element was poped.
       System.out.println(showPopedElement);

       //if you only want to see which element is at top use peak();
       System.out.println(stack.peek());


       System.out.println(stack.search(3));//it will return the index of 3 which in this case 
       //will be 2 because
       //4 index 1
       //3       2
       //2       3
       //1       4

       //we can use Linked list like stack for example

       LinkedList <Integer> linkedList=new LinkedList<>();
       linkedList.addLast(1);
       linkedList.addLast(2);
       linkedList.addLast(3);
       linkedList.addLast(4);

       //see we are using LL as stack by addding elements at the end
       //we can also get last element 
       System.out.println("getting last element...."+linkedList.getLast());
       //we use LL as stack beacause java has DOUBLY ended linked list

       
    }
}
