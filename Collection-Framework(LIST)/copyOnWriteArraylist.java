import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteArraylist {
    public static void main(String[] args) {
        //as both arraylist and linked list are not thread safe we use COWAL
        //its used more when there are more read operation example

        CopyOnWriteArrayList<String> shopinglist=new CopyOnWriteArrayList<>();
        
        
        //List<String> shopinglist=new ArrayList<>();
        
        
        shopinglist.add("banana");
        shopinglist.add("eggs");
        shopinglist.add("mango");
        shopinglist.add("Watermelon");
        for (String string : shopinglist) {
            if (string.equals("eggs")) {
                shopinglist.add("oil");
                System.out.println("added oil while reading.....");
            }
        }
        System.out.println("updated shopingf list"+shopinglist);//if we do this task with List
        //we will face error   
        //Exception in thread "main" java.util.ConcurrentModificationException 
    }
}
