import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class immutableMap {
    public static void main(String[] args) {
        //immutable map means we cannot change contains of this map once its instantiated
        //in java we can create immutable map like this-->
        Map<String , Integer> map1=new HashMap<>();
        map1.put("ganesh", 66);
        map1.put("hitesh", 80);
        Map<String, Integer> map2=Collections.unmodifiableMap(map1);//now this map cannot be modified
        map2.put("vimal", 88); //Throws UnsupportedOperationException
        //but it has limitation that we can still change map1 to overcome this
        //Map.of()was introduced in java 9
        Map<String , Integer> map3=Map.of("Shubham", 60,"Vivek",89);
        //now we cannot change map3 but it also have limitaiton that we can only store 10 key value pairs

        //to overcome this Map.ofEntries() was introduced here we can put key value pairs as entries
        //without limitataions

        Map<String , Integer> map4 = Map.ofEntries(Map.entry("mukesh", 76),Map.entry("suresh", 54));

        System.out.println(map4);
    }
}
