import java.util.Arrays;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
         //linked list implemetns list interphace 
         //unlike arraylist which uses dyanamic array to store the elements,
         //a linked list stores its element as nodes in a doublylinked linked list
         //syntax
         LinkedList <Integer> linkedList=new LinkedList<>();
         //use add()to add values in linked list
         linkedList.add(1);
         linkedList.add(3);
         linkedList.add(2);
         linkedList.add(4);
         //A linked list is a linear data structure where each element is a separate object
         //called a node each node contains DATA and POINTERS
         linkedList.get(2);//it has timecomplexity of O(n)AL has O(1)
        linkedList.addLast(5);//adds element at last

        linkedList.addFirst(0);//adds element at first

        linkedList.getFirst();//gets first element 

        linkedList.getLast();//gets last element

        System.out.println(linkedList);

       // linkedList.removeIf(x -> x%2==0);//use removeIf()to remove elements with condition

        //System.out.println(linkedList);

        //making linked list with values 
        LinkedList<String> animals=new LinkedList<>(Arrays.asList("dog","cat","elements"));
        LinkedList<String> animalsToRemove=new LinkedList<>(Arrays.asList("cat","dog"));
        //here i have created a list of animals to remove from animals linked list
        animals.removeAll(animalsToRemove);//passed animals to remove in removeAll();
        System.out.println(animals);//remove all is also present in ArrayList
        //thats all for today  :)
    }
}
