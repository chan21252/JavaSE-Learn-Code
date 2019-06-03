package work.thread.exercise02;

import java.util.ArrayList;
import java.util.List;

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
