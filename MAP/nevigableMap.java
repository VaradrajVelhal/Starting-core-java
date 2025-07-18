import java.util.NavigableMap;
import java.util.TreeMap;

public class nevigableMap {
    public static void main(String[] args) {
        //NavigableMap extennds SortedMap , providing more powerful navigation options such  as
        //finding the closest matching key or retriving the map in reverse order

        NavigableMap<Integer,String> map=new TreeMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(2, "Two");
        

        System.out.println(map);

    }
}
