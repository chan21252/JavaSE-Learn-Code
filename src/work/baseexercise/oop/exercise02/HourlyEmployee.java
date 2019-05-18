package work.baseexercise.oop.exercise02;

/**
 * 按小时算工资员工类
 */
public class HourlyEmployee extends ColaEmployee {
    private final int BASE_WORK_HOUR = 160;
    private final double BONUS_FACTOR = 1.5;
    private int workHour;
    private double hourSalary;

    public HourlyEmployee(String name, int brithMonth, int workHour, double hourSalary) {
        super(name, brithMonth);
        this.workHour = workHour;
        this.hourSalary = hourSalary;
    }

    @Override
    public double getSalary(int month) {
        double salary;
        if (workHour > 160) {
            salary = hourSalary * (workHour - BASE_WORK_HOUR) * BONUS_FACTOR + hourSalary * BASE_WORK_HOUR;
        } else {
            salary = hourSalary * workHour;
        }

        if (month == getBrithMonth()) {
            return salary + 100;
        } else {
            return salary;
        }
    }
}
