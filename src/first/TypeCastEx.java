package first;
import java.util.Arrays;
/**
 * Created by expertzlab9 on 9/7/18.
 */
public class TypeCastEx {
    public static void main(String[] args) {

//        String x="hello";
//        char[] ch;
//        for (char o:ch){
//            System.out.println(o);
//        }
//        byte b=10;
//        int x=b;//upcasting
//
//        int c=10;
//        byte z=(byte)z;
//        System.out.println(x);
        String s = "hi,hello,how,r u";
        String[] a=s.split(",");
//        for(String obj:a)
//            System.out.println(obj);
        Object[] objects = {1, "adddcfhg", 10.0f};
//
//        for (Object obj : objects)
//            System.out.println(obj);

        int[] a1 = {1, 5, 3, 9};
        Arrays.sort(a1);
        System.out.println("elements is at" + Arrays.binarySearch(a1, 4));
        for (int x1 : a1) {
            System.out.println(x1);
        }
    }
}

