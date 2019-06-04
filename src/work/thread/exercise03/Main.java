package work.thread.exercise03;

/**
 * 开启一个子线程循环3次，主线程循环3次，然后子线程循环3次，主线程循环3次，
 * 这样循环10次
 */
public class Main {
    public static void main(String[] args) {
        CycleThread cycleThread = new CycleThread();
        for (int i = 1; i <= 10; i++) {
            new Thread(cycleThread, "子线程" + i).start();
            new Thread(cycleThread, "主线程" + i).start();
        }
    }

}
