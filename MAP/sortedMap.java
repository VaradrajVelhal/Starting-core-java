import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMap {
    public static void main(String[] args) {
        //Sorted map is interface that extends Map and guarantees taht the entries are sorted 
        //based on the keys , either in their natural ordering or by a specified comparator 


        SortedMap <Integer,String> map=new TreeMap<>();//syntax

        map.put(55, "Ganesh");//time complexity for put,get etc. oparatiom will be O(Log n)
        map.put(101, "Mahesh");//beacause of the sorting.... 
        map.put(19, "Hitesh");
        map.put(90, "Mukesh");

        System.out.println(map);//it will print the map in sorted ascending order

        //some methods 
        
        System.out.println("returns first key.."+map.firstKey());
        System.out.println("returns last key----"+map.lastKey());
        System.out.println("returns data till given key"+map.headMap(55));
        System.out.println("returns data from given key"+map.tailMap(55));
    }
}
