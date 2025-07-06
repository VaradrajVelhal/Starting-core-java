import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashmap {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");
       // Map<String,Integer> map=new HashMap<>();//if you run this code the output will be {key=2}
        //because we are using HashMap it checks if the given input string already exist((With .equals()) in array bucket
        //and replace it with it.......To overvome this we use Identity HashMap....Like this->

        Map<String,Integer> map=new IdentityHashMap<>();//this will provide output as {key=1, key=2}because it usses == isted
        //.equals() so both strings are considered diffrent 
        //the address is checked for equality isted of contents 
        System.out.println("key1 ADDRESS ->  " + System.identityHashCode(key1));
        System.out.println("key1 ADDRESS ->  " + System.identityHashCode(key2));//both this will print diffrent address

        
        //and this happens in hashmaps->
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());//both this will return same hashcode

        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
