package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expertzlab9 on 17/7/18.
 */
public class Studentmain {

    public static void main(String[] args) {

        HashMap<Integer,student> hmap=new HashMap<>();

        hmap.put(2,new student("alan",22,"h1001"));
        hmap.put(3,new student("tom",25,"h1002"));
        hmap.put(4,new student("jerry",24,"h1003"));

        for(Map.Entry<Integer,student>obj:hmap.entrySet()){

            System.out.println("rollno:"+obj.getKey());
            System.out.println("Details of student");
            student s=obj.getValue();
            System.out.println("  "+s.name+" "+s.age+" "+s.address);

//        hmap.put(11,"manu");
//        hmap.put(9,"tom");
//        hmap.put(12,"jerry");
//        hmap.put(null,"niki");
//        hmap.remove(9);
//        for(Map.Entry obj:hmap.entrySet()){
//
//            System.out.println("key: "+obj.getKey()+" "+"value: "+obj.getValue());
        }
    }
}
