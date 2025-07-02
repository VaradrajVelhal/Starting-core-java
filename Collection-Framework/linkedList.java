import java.util.ArrayList;

class linkedList{
    public static void main(String[] args) {
        //Array list changes its size dynamically as elements are added
        //An array is resizable array implementatation od the list interface
        //Syntax
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);//use add() to add elements
        list.add(2);
        list.add(3);

        System.out.println("getting index 1 element...."+list.get(1));//get() is used to get element
        System.out.println("Size of the list is..."+list.size());//to get size
        //get all elements using for each loop
        System.out.println("all elements of list....");
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("Checking if list contains 5 :-  "+list.contains(5));//returns true if it has given element
        //list.remove(2);//removes the element at 2 nd index

        list.add(2,50);//adds 50 between 2 and 3

        //set methods sets element at given index

        list.set(0, 101);//it will replace 1 with 101
         System.out.println(list);//prints list

    }
}