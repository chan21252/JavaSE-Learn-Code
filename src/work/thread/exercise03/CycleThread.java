package work.thread.exercise03;

public class CycleThread implements Runnable {
    @Override
    public synchronized void run() {
        Thread current = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(current.getName() + "正在运行：" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
