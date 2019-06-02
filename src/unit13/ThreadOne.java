package unit13;

public class ThreadOne extends Thread {

    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("我是 " + this.getName() + ", count=" + (++count));
            if (count == 10) {
                Thread.yield();
                System.out.println(this.getName() + "暂停");
            }
            try {
                Thread.sleep(1000L);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
