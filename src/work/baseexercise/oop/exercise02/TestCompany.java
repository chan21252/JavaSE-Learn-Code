package work.baseexercise.oop.exercise02;

public class TestCompany {
    public static void main(String[] args) {
        ColaEmployee[] colaEmployees = new ColaEmployee[3];

        ColaEmployee tom = new SalariedEmployee("Tom", 10, 5000);
        ColaEmployee jerry = new HourlyEmployee("Jerry", 5, 180, 60);
        ColaEmployee bob = new SalesEmployee("Bob", 6, 180000, 0.05);

        colaEmployees[0] = tom;
        colaEmployees[1] = jerry;
        colaEmployees[2] = bob;

        Commpany co = new Commpany();

        for (ColaEmployee colaEmployee : colaEmployees) {
            co.showEmployeeSalary(colaEmployee, 5);
        }
    }
}
