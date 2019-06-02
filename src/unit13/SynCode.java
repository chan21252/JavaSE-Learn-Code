package unit13;

public class SynCode implements Runnable {
    @Override
    public void run() {
        /*
         同步代码块
         */
        synchronized (this) {
            Thread current = Thread.currentThread();
            for (int i = 0; i < 10; i++) {
                System.out.println("当前执行synchronized代码块的线程是 " + current.getName());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
