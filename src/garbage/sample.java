package garbage;

/**
 * Created by expertzlab9 on 24/7/18.
 */
public class sample {

    protected  void finalize(){
        System.out.println("before garbage collection");
    }

    public static void main(String[] args) {
        System.gc();
        sample s=new sample();

        s=null;
        sample s1=new sample();
        s1=null;
        System.gc();
    }
}
