class MyThread extends Thread {
    volatile boolean running = true;

    public void run() {
        System.out.println("Thread started...");
        while (running) {

        }
        System.out.println("Thread stopped!");
    }

    public void stopThread() {
        running = false;
    }
}

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

        Thread.sleep(1000);
        System.out.println("Main thread is stopping the worker...");
        t.stopThread();
    }
}