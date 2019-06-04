package work.thread.exercise02;

import java.util.Date;
import java.util.List;

/**
 * 年会线程
 * @author CuiCan
 */
public class AnnualMeetingThread extends Thread {

    private List<Employee> employeeList;
    private EnterRunnable frontDoor;
    private EnterRunnable backDoor;

    public AnnualMeetingThread(String threadName, List<Employee> employeeList) {
        super(threadName);
        this.employeeList = employeeList;
        frontDoor = new EnterRunnable("前门");
        backDoor = new EnterRunnable("后门");
    }

    /**
     * 年会的任务
     * 1. 给每个员工创建一个线程，执行入场任务
     * 2. 监视入场进度
     */
    @Override
    public void run() {
        for (Employee emp : employeeList) {
            Thread empThread;
            if (new Date().getTime() % 2 == 0) { //根据时间随机入口
                empThread = new Thread(frontDoor, emp.getId());
            } else {
                empThread = new Thread(backDoor, emp.getId());
            }
            empThread.start();
        }

        monitorEnterProgress();
    }

    /**
     * 入场进度监控
     */
    public void monitorEnterProgress() {
        while (true) {
            //System.out.println(frontDoor.getNum() + backDoor.getNum());
            if (frontDoor.getNum() + backDoor.getNum() == employeeList.size()) {
                System.out.println("从" + frontDoor.getName() + "入场的员工总共: " + frontDoor.getNum() + " 位员工");
                System.out.println("从" + backDoor.getName() + "入场的员工总共: " + backDoor.getNum() + " 位员工");
                break;
            }

            //监控频次，10秒1次
            try {
                Thread.sleep(1000 * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
