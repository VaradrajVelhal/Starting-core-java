import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortArrayList {
    public static void main(String[] args) {
        //learning about sorting 
        List <Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.sort(null);//common method
        Collections.sort(nums);//usong collections class
        System.out.println(nums);
        //how to do custom sort?????
        //below i have used anonymous class to create object of Comparator interface
          Comparator <Integer> comp=new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
               if(o1%10>o2%10)//here if 41%10=1 > 14%10=4 
               //what here we are doing is we are changing the way the sort works
               return 1;
               else
               return -1;
            }
            
        };
        List<Integer> list=new ArrayList<>();
        list.add(44);
        list.add(12);
        list.add(25);
        list.add(93);
        Collections.sort(list,comp);//here i am passing object comp 
        //if you want to sort customly you will have to use comparator
        //comparator is a interface
        System.out.println(list);

        //task of creating String Arraylist and sorting it according to its length

        List<String> str=new ArrayList<>();
        //creating random String arraylist
        str.add("Hi");
        str.add("Hello");
        str.add("car");
        str.add("Elephant");
        //object of coamparator interface with modyfications
       Comparator<String> comp1=new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
           if(o1.length()>o2.length())
           return 1;
           else
           return -1;
        }
        
       };
       Collections.sort(str, comp1);
       //printing str ArrayList
       System.out.println(str);
       //so we can say that comaparator is a concept or inerface using which we can 
       //specify our own logic for sorting
    }
}
