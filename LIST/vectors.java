import java.util.Arrays;
import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        //A vector is part of java.util package and one of the legacy class in java that
        //implements list interface. and it is Synchronized,making it thread safe.

        //how ever due to its synchronization overhead,its recomended to use modern alternatives
        //like Arraylist in single threded scenarios.

        Vector<Integer> vector=new Vector<>(5,3);//default capacity is 10 just like AL
        //we can provide capacity and how much we like to increse capacity after initial capacity
        //is filled (by default it doubles the capacity) here initial capacity is 5 and Capicity increment 
        //is 3

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(5);
        
        System.out.println(vector.capacity());//unlike AL we can check capacity of Vector using
        //capacity()

        //Vector<String> vec2=new Vector<>(Arrays.asList("dog","cat","elephant"));
        //we can also give collection in Vectors Constructor 
        //System.out.println(vec2);

        


    }
}
