package work.thread.exercise04;

/**
 * 写一个买票的例子，模拟3个窗口同时买60张票。
 * 定义一个买票的任务类，循环实现买60张票
 * 用买票任务类创建三个线程，一起执行买票任务
 */
public class Main {
    public static void main(String[] args) {
        //创建买票任务
        BuyTicketsThread buyTicketsThread = new BuyTicketsThread();

        //创建执行买票任务的线程对象
        Thread threadA = new Thread(buyTicketsThread, "A");
        Thread threadB = new Thread(buyTicketsThread, "B");
        Thread threadC = new Thread(buyTicketsThread, "C");

        //启动线程
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
