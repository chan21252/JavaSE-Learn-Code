package work.thread.exercise04;

/**
 * 买票任务类
 */
public class BuyTicketsThread implements Runnable {
    private int ticketsNum;     //已经买到的票数

    public BuyTicketsThread() {
        ticketsNum = 0;
    }

    /**
     * 买票
     */
    @Override
    public void run() {
        Thread current = Thread.currentThread();    //获取当前线程
        while (true) {
            //给当前对象加锁，保证仅有一个线程在修改票数
            synchronized (this) {
                if (ticketsNum >= 60) break;
                System.out.println(current.getName() + " 买到了第 " + (++ticketsNum) + " 张票");
            }

            //休眠
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
