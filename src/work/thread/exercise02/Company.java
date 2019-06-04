package work.thread.exercise02;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司类
 * 程序入口，创建员工对象，创建年会线程并启动
 *
 * @author CuiCan
 */
public class Company {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Employee employee = new Employee();
            employee.setId(String.valueOf(i));
            employeeList.add(employee);
        }

        AnnualMeetingThread amThread = new AnnualMeetingThread("2019年会", employeeList);
        amThread.start();
    }
}
