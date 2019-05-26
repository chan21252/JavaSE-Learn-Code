package unit10.list;

import unit10.entity.Employee;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 测试向量集合Vector。应用场景多线程
 */
public class TestVector {
    public static void main(String[] args) {
        Employee emp0 = new Employee();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp0.setName("楚留香");
        emp0.setSex("男");
        emp1.setName("李红袖");
        emp1.setSex("女");
        emp2.setName("石观音");
        emp2.setSex("女");

        Vector vector = new Vector();
        vector.add(emp0);
        vector.add(emp1);
        vector.add(emp2);

        System.out.println("当前集合是否为空：" + vector.isEmpty());
        System.out.println("当前集合元素个数：" + vector.size());

        Enumeration enu = vector.elements();  //获取Vector独有的元素枚举迭代器
        while (enu.hasMoreElements()) {
            Employee emp = (Employee) enu.nextElement();
            System.out.println(emp);
        }

        if (vector.contains(emp2)) {
            vector.remove(emp2);
            System.out.println("当前集合元素个数：" + vector.size());
        }

        for (Object o : vector) {
            System.out.println(o);
        }
    }
}
