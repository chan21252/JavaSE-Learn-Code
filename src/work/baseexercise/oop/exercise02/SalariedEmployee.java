package work.baseexercise.oop.exercise02;

/**
 * 固定工资员工类
 */
public class SalariedEmployee extends ColaEmployee {
    private double monthSalary;

    public SalariedEmployee(String name, int birthMonth, int monthSalary) {
        super(name, birthMonth);
        this.monthSalary = monthSalary;
    }

    @Override
    public double getSalary(int month) {
        /*if (month == getBrithMonth()){
            return monthSalary + getBirthdayBonus();
        }else {
            return monthSalary;
        }*/

        return (month == getBrithMonth()) ? (monthSalary + getBirthdayBonus()) : monthSalary;
    }
}
