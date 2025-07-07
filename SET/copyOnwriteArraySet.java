import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class copyOnwriteArraySet {
    public static void main(String[] args) {
        //Thread safe
        //Copy-on-write mechanism
        //No dublicate elements
        //Iterators Do not reflect modifications 
        Set<Integer> set1=new CopyOnWriteArraySet<>();
        Set<Integer> set2=new ConcurrentSkipListSet<>();
        for (int i=0;i<=5;i++) {
            set1.add(i);
            set2.add(i);
        }
        System.out.println("iterating Copy-on-write-arraySet....");
        for (Integer integer : set1) {
            System.out.println(integer);
            set1.add(6);//the cahnges are not reflected thats why 6 wont print now
        
        }
        

        System.out.println("Iterating Concurrent skiplistset....");

        for (Integer integer : set2) {
            System.out.println(integer);
            set2.add(6);//it will do cahnges concurrently and will print 6....

        }

    }    
}
