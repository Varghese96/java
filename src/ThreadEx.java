//package second;
///**
// * Created by expertzlab9 on 24/7/18.
// */
// class ThreadEx extends Thread{
//  static synchronized public void{
//        for(int i=0;i<5;i++){
//
//        System.out.println("Thread in execution");
//        try {
//            Thread.sleep(1000);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }}
//    public static void main(String[] args) {
//        ThreadEx obj=new ThreadEx();
//        Thread t=new Thread(obj);
//        System.out.println("current thread:"+t.currentThread());
//        t.setName("mythread");
//        System.out.println("renamed thread:"+t);
//        Thread t1=new Thread(obj);
//        t1.setName("mythread pgm");
//        System.out.println("renamed thread:"+t1);
//
//        t.start();
//        System.out.println("main thread");
//
//
//    }
//}
