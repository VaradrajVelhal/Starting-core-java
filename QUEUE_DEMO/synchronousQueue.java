import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class synchronousQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new SynchronousQueue<>();
        Thread producer=new Thread(() ->{
            try{
                System.out.println("producer is waiting to transfer....");
                queue.put("Hello from producer");
                System.out.println("producer has transfered the message....");
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("producer was inturrupted....");
            }
        });
        Thread consumer =new Thread(() ->{
            try {
                System.out.println("Consumer is waiting to receive....");
                String message =queue.take();
                System.out.println("consumer was inturrupted : " +message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was inturrupted....");
            }
        });

        producer.start();
        consumer.start();
    }
}
