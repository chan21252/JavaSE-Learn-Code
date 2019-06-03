package unit13;

/**
 * 利用2个Tread线程实现对1-100的累加计算
 */
public class MyRunnable implements Runnable {
    private Thread th1;
    private Thread th2;

    private int sum = 0;    //累加和
    private int i = 1;  //循环变量

    public MyRunnable(Thread t1, Thread t2) {
        th1 = t1;
        th2 = t2;
        th1.start();
        try {
            th1.join();     //join方法使th1独占CPU资源，其他线程等待此线程执行完毕
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th2.start();
    }

    @Override
    public void run() {
        String thName = Thread.currentThread().getName();
        System.out.println("当前线程 " + thName + "正在计算");

        while (i <= 100) {
            sum += i++;
            if (i == 50) {
                break;
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sum);
    }
}
