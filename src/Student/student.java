package Student;

import org.jetbrains.annotations.NotNull;

import java.awt.print.Book;
import java.util.TreeSet;

/**
 * Created by expertzlab9 on 12/7/18.
 */
public class student implements Comparable<student>{
    int rollno;
    String name;
    int age;

    public student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        TreeSet<student> obj=new TreeSet<student>();
        obj.add(new student(11,"tom",23));
        obj.add(new student(2,"zen",25));
        obj.add(new student(4,"hamsa",34));

        for(student o:obj){
            System.out.println(o.rollno);
        }
    }

    @Override
    public int compareTo(@NotNull student o){
        if(rollno>o.rollno){
            return 1;

        }else if(rollno<o.rollno){
            return -1;
        }
        else{
            return 0;
        }
    }
}
