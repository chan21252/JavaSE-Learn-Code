package work.baseexercise.oop.exercise02;

/**
 * 销售员工类
 */
public class SalesEmployee extends ColaEmployee {
    private double monthSales;
    private double commission;

    public SalesEmployee(String name, int birthMonth, double monthSales, double commission) {
        super(name, birthMonth);
        this.monthSales = monthSales;
        this.commission = commission;
    }

    @Override
    public double getSalary(int month) {
        double salary = monthSales * commission;

        if (month == getBrithMonth()) {
            return salary + 100;
        } else {
            return salary;
        }
    }
}
