package work.thread.exercise02;

import java.util.Date;

/**
 * 入场任务类
 */
public class EnterRunnable implements Runnable {
    private final String[] enterArr = {"前门", "后门"};
    public int frontDoorNum;
    public int backDoorNum;

    public EnterRunnable() {
        frontDoorNum = 0;
        backDoorNum = 0;
    }

    /**
     *
     */
    @Override
    public void run() {
        enter();
        sleep(100);
    }

    public void enter() {
        Thread current = Thread.currentThread();
        int enterNum = (int) (new Date().getTime() % 2);
        if (enterNum == 0) {
            System.out.println("编号为 " + current.getName() + " 的员工正在从 " + enterArr[0] + " 入场！");
            frontDoorNum++;
        } else {
            System.out.println("编号为 " + current.getName() + " 的员工正在从 " + enterArr[1] + " 入场！");
            backDoorNum++;
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

    public int getFrontDoorNum() {
        return frontDoorNum;
    }

    public int getBackDoorNum() {
        return backDoorNum;
    }
}
