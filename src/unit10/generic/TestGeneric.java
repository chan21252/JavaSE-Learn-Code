package unit10.generic;

import unit10.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        //empList.add("abc");
        Employee emp0 = new Employee();
        emp0.setName("貂蝉");
        Employee emp1 = new Employee();
        emp1.setName("西施");
        Employee emp2 = new Employee();
        emp2.setName("王昭君");

        empList.add(emp0);
        empList.add(emp1);
        empList.add(emp2);

        for (Employee e : empList) {
            System.out.println(e.getName());
        }
    }
}
