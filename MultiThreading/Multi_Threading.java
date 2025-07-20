

public class Multi_Threading {
    /*
    What is Multithreading?

Multithreading is the ability of a program to run multiple tasks (threads) at the same time.

Think of it like:

      One thread is cooking.

      Another thread is talking on the phone.

      Another is checking messages — all at once!

In Java, each thread is a separate path of execution, running independently but within the same program.

Why Use Multithreading?

      Efficient use of CPU (do many things at once)

      Faster performance (especially for heavy tasks)

      Useful in games, servers, background tasks, etc.

  Key Concepts:
Term	                  Meaning
Thread	             A single unit of execution (like a mini program inside a program)
Main Thread	         The thread in which your Java program starts
Multithreading	     Running multiple threads at the same time
Runnable	         An interface to define code for threads
start()	             Starts a thread and calls the run() method
run()	             Contains the code that runs in the thread

Ways to Create a Thread in Java:
1. Extending Thread class

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // starts a new thread
    }
}


2. Implementing Runnable interface

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}



 Important Multithreading Topics:

     Thread.sleep(ms) → Pause thread

     synchronized → Prevent data conflict

     join() → Wait for a thread to finish

     Thread priorities

     Thread communication → wait(), notify(), notifyAll()

    

 Without Multithreading:

Tasks happen one after another (slow for some applications)


 With Multithreading:

Tasks happen in parallel — more efficient, more responsive apps!
*/
}
