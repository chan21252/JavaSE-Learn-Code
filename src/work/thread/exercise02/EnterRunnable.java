package work.thread.exercise02;

import java.util.Random;

/**
 * 入口
 * @author Cuican
 */
public class EnterRunnable implements Runnable {
    private static final String[] codePool = new String[100];    //双色球号码池

    static {
        /* 初始化号码池 */
        for (int i = 0; i < codePool.length; i++) {
            if (i < 10) {
                codePool[i] = "0" + i;
            } else {
                codePool[i] = String.valueOf(i);
            }
        }
    }

    private String name;    //入口名称
    private int num;    //入口入场人数

    /**
     * 构造方法
     *
     * @param name 入口名称
     */
    public EnterRunnable(String name) {
        this.name = name;
        num = 0;
    }

    /**
     * 员工在入口的任务
     * 1. 入场
     * 2. 领取一个双色球号码
     */
    @Override
    public synchronized void run() {
        Thread current = Thread.currentThread();
        enter();
        String[] codeArr = takeCode();
        System.out.println("编号为： " + current.getName() + " 的员工正在从" + name + "入场！" +
                "拿到的双色球号码是 " + codeArrayToString(codeArr));
        sleep(500);
    }

    /**
     * 入场，num+1
     */
    private void enter() {
        synchronized (this) {
            num++;
            //System.out.println(name + "： " + num);
        }
    }

    /**
     * 领取号码，从号码池中随机抽7个号码
     *
     * @return 双色球号码数组
     */
    private String[] takeCode() {
        Random random = new Random();
        String[] codeArr = new String[7];
        for (int i = 0; i < codeArr.length; i++) {
            int randIndex = random.nextInt(codePool.length);
            codeArr[i] = codePool[randIndex];
        }

        return codeArr;
    }

    /**
     * 号码字符串数组转字符串
     *
     * @param codeArr 号码数组
     * @return 号码数组的字符串形式
     */
    private String codeArrayToString(String[] codeArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < codeArr.length; i++) {
            if (i != codeArr.length - 1) {
                sb.append(codeArr[i]).append(", ");
            } else {
                sb.append(codeArr[i]);
            }
        }
        sb.append("]");

        return sb.toString();
    }

    /**
     * 进程休眠
     * @param mills 休眠毫秒数
     */
    private void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取入口名称
     *
     * @return 入口名称
     */
    public String getName() {
        return name;
    }

    /**
     * 获取入口的入场人数
     *
     * @return 入场人数
     */
    public int getNum() {
        return num;
    }
}
