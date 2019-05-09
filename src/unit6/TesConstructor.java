package unit6;

import unit6.entity.Employee;

public class TesConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println(emp.getClass().getName());

        Employee emp1 = new Employee("火云邪神", 10);
    }
}
