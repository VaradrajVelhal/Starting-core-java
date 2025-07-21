public class Exception_HandlingEX {
    public static void main(String[] args) {
       try{
        System.out.println("The division is "+ 5/0);//Without Exception handling "hello" will not be executed
        //to overcome this we will put our division in try catch block....

        //we can use multiple statements in try block and one try statement can have multiple catch stament.

        
       }
       catch(ArithmeticException e){
        System.out.println("Devision by zero !!");
       }
       finally{
        //Statement written is finally block always gets executed....
        System.out.println("In finally block....");
       }
       //After putting division line in try catch block now hello is also being executed....
        System.out.println("hello");

    }
}
