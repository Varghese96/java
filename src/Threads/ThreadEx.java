package Threads;


/**
 * Created by expertzlab9 on 23/7/18.
 */
public class ThreadEx implements Runnable{


    public void run() {


        for(int i=0;i<5;i++){


            System.out.println("current thread "+Thread.currentThread().getName());
            //System.out.println("Thread in execution");
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {

        ThreadEx obj = new ThreadEx();
        Thread t = new Thread();
        t.setName("mythread1");
        t.start();
        Thread t1 = new Thread(obj);
        t1.setName("mythread2");
        t1.start();
        System.out.println("main thread");
    }
}

