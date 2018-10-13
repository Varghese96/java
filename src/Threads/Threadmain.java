package Threads;
/**
 * Created by expertzlab9 on 23/7/18.
 */

class Thread1 extends  Thread {

    sample s;

    Thread1(sample s) {
        this.s = s;

    }


    public void run() {
        s.display(5);
    }
}
class Thread2 extends Thread{
    sample s;
    Thread2(sample s){
        this.s=s;

        }
        public void run(){
        s.display(100);
        }
        }
public class Threadmain {
    public static void main(String[] args) {


        sample s = new sample();
        Thread1 t = new Thread1(s);
        Thread2 t1 = new Thread2(s);
        t.start();
        t1.start();
        sample s1=new sample();
        Thread1 t2=new Thread1(s1);
        Thread t3=new Thread2(s1);
        t2.start();
        t3.start();
    }

}
