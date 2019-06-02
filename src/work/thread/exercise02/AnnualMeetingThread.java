package work.thread.exercise02;

import java.util.List;

/**
 * 年会线程
 */
public class AnnualMeetingThread extends Thread {

    private List<Employee> employeeList;
    private EnterRunnable enterRunnable;

    public AnnualMeetingThread(String threadName, List<Employee> employeeList) {
        super(threadName);
        this.employeeList = employeeList;
        enterRunnable = new EnterRunnable();
    }

    /**
     * 给每个员工创建一个线程，执行员工的任务
     */
    @Override
    public void run() {
        for (Employee emp : employeeList) {
            Thread empThread = new Thread(enterRunnable, emp.getId());
            empThread.start();
        }

        System.out.println("从前门入场的员工总共:" + enterRunnable.getFrontDoorNum() + "位员工");
        System.out.println("从后门入场的员工总共:" + enterRunnable.getBackDoorNum() + "位员工");
    }
}
