import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class setOverview {
    public static void main(String[] args) {
        //Set is collection that does not contain dublicate elements
        //Faster operation
        //as Map had implementations --> HashMap, LinkedHashMap, Treemap, EnumMap
        //Set also has same --> HashSet, LinkedHashSet, TreeSet, EnumMap

        //evrymethods and all is same as Map

        Set <Integer> set=new LinkedHashSet<>();//if you want ordered use linked hash set 
        //if you want sorted use treeSet
        set.add(88);
        set.add(58);
        set.add(78);
        set.add(8821);
        
        System.out.println(set);

        set.remove(58);
        System.out.println(set);

        //for Thread safety 

       // Set <Integer> integers=Collections.synchronizedSet(set);//now this integers set is thread safe
        //but we dont use this much beacause it has low performance

        //we use 
        Set<Integer> set1=new ConcurrentSkipListSet<>();//its recommended to use

        //unmodifiable
        Set <Integer> integers=Set.of(1,2,3,4,5,6,7,8,9,10,11,12);//here we can store more then 10
        //unlike Map
        System.out.println(integers);

    }    
}
