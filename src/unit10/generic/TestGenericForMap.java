package unit10.generic;

import unit10.entity.Employee;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * 使用Map集合应用泛型
 */
public class TestGenericForMap {
    public static void main(String[] args) {
        Map<String, Set<Employee>> map = new HashMap<String, Set<Employee>>();

        Employee emp0 = new Employee();
        emp0.setName("齐诸儿");
        Employee emp1 = new Employee();
        emp1.setName("齐小白");

        Set<Employee> empSet = new HashSet<Employee>();
        empSet.add(emp0);
        empSet.add(emp1);
        map.put("emps", empSet);

        Set<Employee> empSet1 = map.get("emps");
        for (Employee emp : empSet1){
            System.out.println(emp.getName());
        }
    }
}
