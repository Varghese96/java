package Threads;

/**
 * Created by expertzlab9 on 23/7/18.
 */
public class sample {
   static synchronized public void display(int x) {



















            for (int i = 0; i < 3; i++) {
                System.out.println(i * x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
      //  System.out.println("rest of the code"+Thread.currentThread().getName());
    }