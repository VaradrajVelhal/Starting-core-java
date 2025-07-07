import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {
    public static void main(String[] args) {
         ConcurrentHashMap <String,Integer> map=new ConcurrentHashMap<>();
         //In java 7 the segement based locking was introduced which devides the segement 
         //in 16 segments (Samller hashmaps)
         //Only the segment which is being written to or read by is locked
         //Read : do not require locking unless there is a write operation happening on the same
         //segment. 
         //Write: lock 

         //In java 8 ---> no segementation
         //          ---> compare and swap approach --->no locking except resizing or collision
                                                                                      
    }
}
