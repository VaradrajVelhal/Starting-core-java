import java.util.LinkedHashMap;

public class lrucacheEX<k,v> extends LinkedHashMap<k,v> {
    //LRUcache stands for LEAST RECENTLY used cache - its a data structure that stores a limited
    //number of iteams and evicts the least recently used item when the capicity is exceeded.

    private int cap;

    public lrucacheEX(int cap){
        super(cap,0.75f,true);//calling parent class constructor
        //and giving value to access order true it will keep least frequntly used elements at top
        this.cap=cap;
    }
    
    //we are going to override parent class method to remove eldest element when the capacity
    //is full and we will write our own logic in it as size()>capacity then remove

     @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<k, v> eldest) {
       return size() > cap; 
    }
    
    public static void main(String[] args) {
        lrucacheEX<String,Integer> studentmap=new lrucacheEX<>(3);
        studentmap.put("mahesh",91 );
        studentmap.put("suresh",96 );
        studentmap.put("mukesh", 80);
        studentmap.put("bhikesh", 98);

        //if we print studentmap now the mahesh will be removed 

        System.out.println(studentmap);
        //mahesh was removed when we put bhikesh....
    }
}
