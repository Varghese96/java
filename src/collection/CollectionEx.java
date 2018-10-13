package collection;

import java.util.ArrayDeque;

/**
 * Created by expertzlab9 on 19/7/18.
 */
public class CollectionEx {
    public static void main(String[] args) {


        ArrayDeque<String> obj=new ArrayDeque<String>();
        obj.addFirst("anu");
        obj.addLast("alan");
        obj.add("anju");
        obj.add("amy");
        obj.add("ammu");
        System.out.println(obj);
        System.out.println("head"+obj.peek());
        System.out.println("removed first "+obj.pollFirst());
        System.out.println("removed last"+obj.pollLast());
        System.out.println("after removal"+obj);
        System.out.println(obj.remove());
        System.out.println(obj.removeFirst());
     //   System.out.println(obj.removeLast());
        System.out.println(obj);
    }
}
