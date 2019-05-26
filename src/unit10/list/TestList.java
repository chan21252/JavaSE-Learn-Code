package unit10.list;

import unit10.entity.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List emps = new ArrayList();

        /*
        从控制台接受信息封装为3个Employee对象，存储到List集合
         */
        System.out.println("请输入3个员工信息");
        Employee empObj = null;

        for (int i = 0; i < 3; i++) {
            Employee emp = new Employee();
            System.out.println("请输入第 " + (i + 1) + "个员工的信息");
            System.out.println("姓名：");
            String name = in.next();
            System.out.println("性别：");
            String sex = in.next();
            emp.setName(name);
            emp.setSex(sex);
            emps.add(emp);

            if (i == 2) {
                empObj = emp;
            }
        }

        /*
        遍历List集合，获取集合中员工对象并显示信息
         */
        //fori循环
        for (int i = 0; i < emps.size(); i++) {
            Employee emp = (Employee) emps.get(i);
            System.out.println(emp);
        }

        //foreach迭代
        for (Object o : emps) {
            Employee emp = (Employee) o;
            System.out.println(emp);
        }

        /*
        使用当前List获取指向集合的迭代器，使用迭代器遍历对象
         */
        System.out.println("使用迭代器遍历对象");
        Iterator iterable = emps.iterator();
        while (iterable.hasNext()) {     //如果有下一个元素
            Object obj = iterable.next();   //获取下一个元素
            Employee emp = (Employee) obj;
            System.out.println(emp);
        }

        /*
        清空List所有元素
         */
        //emps.clear();
        //System.out.println("集合大小是 " + emps.size());

        /*
        判断集合中是否包含指向对象
         */
        boolean bool = emps.contains(new Employee());
        System.out.println("集合是否包含新创建的对象：" + bool);
        System.out.println("集合是否包含empObj：" + emps.contains(empObj));
    }
}
