package work.baseexercise.oop.exercise02;

public class Commpany {
    public void showEmployeeSalary(ColaEmployee employee, int month) {
        System.out.println("员工 " + employee.getName() + " " + month + " 月的工资是 " + employee.getSalary(month));
    }
}
