package first;

import java.util.Scanner;

/**
 * Created by expertzlab9 on 26/7/18.
 */
public class Factorials {

    public static int getfactorial(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else {

            return (n*getfactorial(n-1));
        }
    }

    public static void main(String[] args) {
//
//        Factorials obj=new Factorials();
//        int i=obj.getfactorial(5);
//        System.out.println("factorial is "+ i);
//        System.out.println("enter a number");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println(getfactorial(num));
        System.out.println(getfactorial(5));

    }
}
