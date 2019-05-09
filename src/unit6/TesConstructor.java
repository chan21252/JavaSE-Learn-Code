package unit6;

import unit6.entity.Employee;

public class TesConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println(emp.getClass().getName());

        Employee emp1 = new Employee("火云邪神", 10);
        System.out.println(emp1.getName());
        System.out.println(emp1.getWorkAge());
        emp1.setSex('男');
        System.out.println(emp1.getSex());

        Employee emp2 = new Employee("火云邪神2", 12, '男');
    }
}
