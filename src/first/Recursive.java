package first;

import java.util.Scanner;

/**
 * Created by expertzlab9 on 26/7/18.
 */
public class Recursive {

    public static int getFibonacii(int n)
    {
        if (n==1)
        {
            return 1;
        }
        if (n==2)
        {
            return 1;
        }
        return getFibonacii(n-1)+getFibonacii(n-2);
    }

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(getFibonacii(num));

    }
}
