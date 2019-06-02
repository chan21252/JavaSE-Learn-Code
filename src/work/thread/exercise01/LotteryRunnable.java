package work.thread.exercise01;

import java.util.*;

/**
 * 抽签任务类
 * 创建2个线程对象，去依次抽签
 * 从数组中随机抽一个数，被抽到的数删去，直到全部抽完
 */
public class LotteryRunnable implements Runnable {
    private final Map<Integer, Integer> unLotMap;     //未抽到的签，键为数组值，值为数组索引，final修饰，确保lock的对象是同一个
    private Random random = new Random();
    private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private Thread threadA;
    private Thread threadB;

    public LotteryRunnable() {
        unLotMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            unLotMap.put(arr[i], i);
        }

        threadA = new Thread(this, "A");
        threadB = new Thread(this, "B");

        threadA.start();
        threadB.start();
    }

    /**
     * 任务运行方法
     */
    @Override
    public void run() {
        while (unLotMap.size() > 0) {
            lot();
            sleep(1000);
        }
    }

    /**
     * 抽签方法
     */
    private synchronized void lot() {
        synchronized (unLotMap) {
            Thread current = Thread.currentThread();

            if (unLotMap.size() > 0) {
                int index = random.nextInt(unLotMap.size());    //从Map中抽取一个索引
                int currentIndex = 0;   //当前索引
                int lottery;    //抽到的签

                //遍历Map，找到索引是index的entry，key就是签
                for (Map.Entry<Integer, Integer> entry : unLotMap.entrySet()) {
                    if (index == currentIndex) {
                        lottery = entry.getKey();
                        unLotMap.remove(lottery);   //去掉已经抽到的签
                        System.out.println(current.getName() + "抽到 " + lottery);
                        break;
                    }
                    currentIndex++;
                }
            } else {
                System.out.println("抽签完毕");
            }
        }
    }

    /**
     * 进程休眠
     *
     * @param mills 休眠毫秒数
     */
    private void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
