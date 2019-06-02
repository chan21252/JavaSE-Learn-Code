package unit13;

public class ThreadTwo extends Thread {

    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("我是 " + this.getName() + ", count=" + (++count));
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
