//Using Thread class

class Process1 extends Thread{
    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Process 1 : "+ i );
        }
    }
}


class Process2 extends Thread{
    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("Process 2 : "+ i );
        }
    }

}
public class Multi_ThreadingEX2 {
    public static void main(String[] args) {
        Process1 p1=new Process1();
        Process2 p2 =new Process2();
        p1.start();
        p2.start();
    }
}

/*
  Output :-
Process 2 : 0
Process 1 : 0
Process 2 : 1
Process 1 : 1
Process 2 : 2
Process 1 : 2
Process 2 : 3
Process 1 : 3
Process 2 : 4
Process 1 : 4
Process 2 : 5
Process 1 : 5
Process 2 : 6
Process 1 : 6
Process 2 : 7
Process 1 : 7
Process 2 : 8
Process 1 : 8
Process 2 : 9
Process 1 : 9
Process 2 : 10
Process 1 : 10
 
*/
