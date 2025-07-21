import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//in this code i am creating class student and using it in arraylist to store 
//roll no and name of student 

class student{
    int roll;
    String name;
    student(int roll,String name){
        this.roll=roll;
        this.name=name;
       
    }
    //to return the output as roll=101,name=Hitesh i am using to string method
    public String toString() {
        return "student [roll=" + roll + ", name=" + name + "]";
    }
    
}
//if we want that Collection.sort should work noormally we need to implement comparable class
class student2 implements Comparable<student2>{
    int marks;
    String name;
    student2(int marks,String name){
        this.marks=marks;
        this.name=name;
       
    }
    public String toString() {
        return "name - " + name + ", marks - " + marks ;
    }
    @Override
    public int compareTo(student2 that) {
    if(this.marks>that.marks)
    return 1;
    else
    return -1;
    }
    
}
public class sortArraylist2 {
    public static void main(String[] args) {
        Comparator<student> comp=(i,j)->i.roll>j.roll?1:-1;//we can also use lambda for this part of code
        List <student> stud=new ArrayList<>();
        stud.add(new student(101, "Hitesh"));
        stud.add(new student(104, "Ganesh"));
        stud.add(new student(102, "Mahesh"));
        stud.add(new student(103, "Mukesh"));
        Collections.sort(stud,comp);
       // for (student student : stud) {
         //   System.out.println(student);
        //}


        //here we will add values to stud2 and then we will try to sort it like Collections.sort(stud2)
        //lets see if it works
        List <student2> stud2=new ArrayList<>();
        stud2.add(new student2(80, "Ganesh"));
        stud2.add(new student2(50, "Hitesh"));
        stud2.add(new student2(39, "Mahesh"));
        stud2.add(new student2(99, "Mukesh"));
        Collections.sort(stud2);
        for (student2 student2 : stud2) {
            System.out.println(student2);
        }
        //its perfectly working     :)
        //so here i learned about comparator and comparable
    }
}
