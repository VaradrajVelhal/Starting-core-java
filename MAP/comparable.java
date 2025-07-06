// comparator is used when we want to write custom logic

//comaparable is used to describe natural ordering 

import java.util.ArrayList;
import java.util.List;

class student implements Comparable<student>{
    private String name;
    private int marks;
    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "student [name=" + name + ", marks=" + marks + "]";
    }
    @Override
    public int compareTo(student o) {
        return Double.compare(this.getMarks(), o.getMarks());
    }
    
}
public class comparable {
    public static void main(String[] args) {
        List <student> list=new ArrayList<>();
        list.add(new student("Ganesh", 54));
        list.add(new student("Mukesh", 81));
        list.add(new student("Hitesh", 75));
        list.add(new student("Anupam", 40));

        System.out.println(list);

        list.sort(null);
        System.out.println("list after sorting -----"+list);
    }
}
