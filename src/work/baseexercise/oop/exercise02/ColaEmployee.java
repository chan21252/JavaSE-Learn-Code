package work.baseexercise.oop.exercise02;

/**
 * 所有员工类的父类
 */
public abstract class ColaEmployee {
    private final static double BIRTHDAY_BONUS = 100.0;
    private String name;
    private int brithMonth;


    public ColaEmployee(String name, int brithMonth) {
        this.name = name;
        this.brithMonth = brithMonth;
    }

    public static double getBirthdayBonus() {
        return BIRTHDAY_BONUS;
    }

    public abstract double getSalary(int month);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrithMonth() {
        return brithMonth;
    }

    public void setBrithMonth(int brithMonth) {
        this.brithMonth = brithMonth;
    }
}
