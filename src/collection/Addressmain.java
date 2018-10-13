package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expertzlab9 on 17/7/18.
 */
public class Addressmain {
    public static void main(String[] args) {


        HashMap<Integer, AddressBook> hmp = new HashMap<>();


        hmp.put(1, new AddressBook(12, "kottaram", "thoma"));
        hmp.put(2, new AddressBook(15, "mevada", "clitus"));
        hmp.put(3, new AddressBook(20, "pulikattil", "charly"));
        hmp.remove(2);
        for (Map.Entry<Integer, AddressBook> obj : hmp.entrySet()) {


            System.out.println("rollno:" + obj.getKey());
            System.out.println("Details of student");
            AddressBook h = obj.getValue();
            System.out.println("  " + h.houseno + " " + h.housename + " " + h.name);
        }

    }

    }


