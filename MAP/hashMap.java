import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
         HashMap<Integer,String> map = new HashMap<>();
        //this is Syntax for HashMap you have to specify keys data type(here Integer)
        //and values datatype (here String)

        map.put(1, "Robert");//put is used to put values in HashMap
        map.put(4, "Ned");
        map.put(11, "Tywin");
        map.put(5, "Orthur");

        System.out.println(map);

        String ans=map.get(11);//get() is used to get value on given input here its 11 so it will 
        //return Tywin
        System.out.println(ans);

        System.out.println(map.containsKey(34));//it will return false because this 34 key
        //is not present in hashmap

        System.out.println(map.containsValue("Orthur"));// it checks for value in hashmap

        //to use loop on HashMap we have to use map.keySet()
        for (int i : map.keySet()) {
            System.out.println(map.get(i));//it will print values 
        }

        map.remove(11);//to remove key valuepair
        
    } 
}
