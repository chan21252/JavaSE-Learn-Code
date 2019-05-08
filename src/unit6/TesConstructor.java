package unit6;

import unit6.entity.Employee;

public class TesConstructor {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println(emp.getClass().getName());
    }
}
