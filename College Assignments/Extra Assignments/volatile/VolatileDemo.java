class SharedObject {
    private boolean flag = false;

    public void setFlagTrue() {
        flag = true;
        System.out.println("Set the flag true....");
    }

    public void printFlagTrue() {
        while (!flag) {

        }
        System.out.println("Flag is true now.");
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        SharedObject s = new SharedObject();
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            s.setFlagTrue();
        });
        Thread readerThread = new Thread(() -> {
            s.printFlagTrue();
        });
        writerThread.start();
        readerThread.start();
    }
}
