import java.util.ArrayList;
import java.util.Vector;

public class threadSafetyVectors {
    public static void main(String[] args) {
        //here we are going to see demo why it is adviced to use vector for multi threding isted of arrayList
        
        
        ArrayList <Integer> list=new ArrayList<>();
        //Vector <Integer> list=new Vector<>();//"if we change it to vector the answer will always be 2000"
        
        
        //here i have created first thread t1 to add 1 to 1000 in out arraylist

        Thread t1=new Thread(()->{
            for (int i = 1; i <= 1000; i++) {
                list.add(i);
            }
        });

        //another thread is created for adding 1 to 1000
        Thread t2=new Thread(()->{
            for (int i = 1; i <= 1000; i++) {
                list.add(i);
            }
        });
        t1.start();//adding elements 
        t2.start();//at same time with multithreding
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());//here we can predict the output to be 2000
        //but the output is always diffrent
        
        //thats why we use vector for multithreding work

        //AL is not thread safe so both thread can access it at same time thats why there is conflict in result

    }
}
