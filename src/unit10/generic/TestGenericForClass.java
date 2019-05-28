package unit10.generic;

import unit10.entity.Employee;

public class TestGenericForClass {
    public static void main(String[] args) {
        GenericClass<Integer> gClass = new GenericClass<>();

        String className = gClass.getClassName(new Integer(600));
        System.out.println(className);

        GenericClass<Employee> gClass1 = new GenericClass<>();
        System.out.println(gClass1.getClassName(new Employee()));
    }
}
