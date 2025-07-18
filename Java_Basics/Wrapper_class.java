public class Wrapper_class {
    public static void main(String[] args) {
         //Java is almost 100% object oriented programming language.
         //Almost 100% because we can do this (int x=5;)where int is not class its datatype so here we are not creating 
         //Object of class to use it thats why it almost 100% object oriented.
         
         //To overcome this the wrapper classes are used
         //So we can say that wrapper are ussed to make java 100% object oriented programming language....
         //Wrapper classes ->
         //int   Integer (where Integer is wrapper class)

        //parseInt is used to parse data in Integer ,it is Static
        int x=Integer.parseInt("12254");
        System.out.println(x);//Returns 12254
         
        //valueOf() is used to return object it also parses data in  Intger , it is Static
        Integer i1 = Integer.valueOf(x);//Returns 12254
        //We can also convert data into binary,decimal,hexadecimal using valueOf()
        Integer binary = Integer.valueOf("10110", 2);
        System.out.println(binary.intValue());//We have to use intValue() for printing value of binary
        // Output -> 22

        //intValue() is used to parse data into int , (it is non static) So we will need reference object to call it
        int y = i1.intValue();//Returns 12254

        // Every Wrapper class have this fuctions -> parse(),valuOf(),value() 
        
    }
}
