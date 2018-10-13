package forth;

import java.util.ArrayList;

/**
 * Created by expertzlab9 on 14/8/18.
 */
public class SecondLargest {

    public static void main(String[] args) {
        int a[] = {10, 75, 46, 20, 36, 78, 45,11};
//        int first = a[0];
//        first = 0;
//        int secnd = 0;
//

//        for (int i = 0; i < a.length; i++)
//            if (a[i] > first) {
//                secnd = first;
//                first = a[i];
//            }
//        //System.out.println(first);
//        System.out.println("second largest is " + secnd);


        ArrayList<Integer> arrl = new ArrayList<>();
        for (int i = 0; i < a.length / 2; i++) {
            arrl.add(a[i]);
        }
        ArrayList<Integer> arrl2 = new ArrayList<>();
        for (int i = (a.length / 2); i < a.length; i++) {
            arrl2.add(a[i]);
        }
            System.out.println("first half" + arrl);
            System.out.println("second half" + arrl2);
        }
    }





