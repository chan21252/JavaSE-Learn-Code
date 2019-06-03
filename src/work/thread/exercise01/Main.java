package work.thread.exercise01;

import java.util.Random;

/**
 * 有如下数组 int[] arr = {1,2,3,4,5,6,7,8,9,10},
 * 现有两个人进行抽签，A先抽签，B继续抽签，A继续抽签，依次类推，直到抽完为止，抽一次少一次，不能有重复的，
 * 用两个线程模拟两个人的抽签，随机抽签，把抽签的结果打印到控制台，记住，这里是用数组，不是集合来存取1到10。
 */
public class Main {
    public static void main(String[] args) {
        LotteryRunnable lot = new LotteryRunnable();
    }
}
