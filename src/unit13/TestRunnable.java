package unit13;

public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread t1 = new Thread(myRunnable2, "线程1");
        Thread t2 = new Thread(myRunnable2, "线程2");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
