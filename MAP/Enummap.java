import java.util.EnumMap;
import java.util.Map;

public class Enummap {
    public static void main(String[] args) {
         //in enummap the size of array is same as enum
         //it does not do hashing
         //ordinal / index is used
         //its faster then hashmap beacause there is no hashing 
         //its more memory efficient then hashmap
         Map<DAY,String> map=new EnumMap<>(DAY.class);
         map.put(DAY.FRIDAY, "Run");
         map.put(DAY.MONDAY, "Gym");
         map.put(DAY.TUESDAY, "Walk");
         map.put(DAY.SATURDAY, "Swim");

         System.out.println(map);
    }
}
enum DAY{
    MONDAY,TUESDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
