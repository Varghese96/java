package first;

import java.util.Random;

import static java.lang.Math.*;
//import static java.lang.Math.max;

/**
 * Created by expertzlab9 on 26/7/18.
 */
public class Sample1 {

    public static void main(String[] args) {
        System.out.println(abs(-10));
        System.out.println(max(10,12));
        System.out.println(pow(2,3));
        Random random=new Random();
        int i=random.nextInt(10);
        System.out.println(i);
    }

}
