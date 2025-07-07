import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        //It impliments Map
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        //HashMap is Syncronized(Thread safe)
        //it cannot contain null key or value
        //Legacy Class
        //Slower then Hashmap
        //uses only linked list in case of collision

        hashtable.put(123, "apple");
        hashtable.put(451, "banana");
        hashtable.put(54, "mango");
        hashtable.put(10001, "guava");

        System.out.println(hashtable);
        System.out.println("getting number two  "+hashtable.get(54));
    }
}
