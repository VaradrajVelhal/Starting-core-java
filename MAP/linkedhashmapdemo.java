import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class linkedhashmapdemo {
    //linked HashMap prints values in orderunlike Hashmap that doensn't maintain order
    //it becomes little bit slower then hashmap because it maintains order 


    public static void main(String[] args) {
        LinkedHashMap<String , Integer> map=new LinkedHashMap<>();
        map.put("mango", 550);
        map.put("guawa", 10);
        map.put("apple", 280);
        map.put("banana", 70);
        for (Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey()+ " : "+m.getValue());
        }
    
        int res=map.getOrDefault("watermelon", 00);//it returns default value 
        //if given value is not present
        System.out.println(res);
    }
}
