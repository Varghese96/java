package forth;

import first.Student;

/**
 * Created by expertzlab9 on 31/8/18.
 */
public class GenericEx2 {
    public <T extends Number> void print(T mark1,T Mark2)
    {

        double result=mark1.doubleValue()+Mark2.doubleValue();
        System.out.println("sum="+result);
    }

    public static void main(String[] args) {
        GenericEx2 m=new GenericEx2();
        m.print(10,20);
        m.print(12.0f,33.00f);
        m.print(30.0d,50.08d);
    }
}
