package unit2.operator;

public class LogicNot {
    public static void main(String[] args) {
        int num2 = 50;
        int num3 = 51;
        double d2 = 5.5;
        double d3 = 6.5;

        boolean bool = num2 <= num3 && d2 <= d3;
        System.out.println(!bool);

    }
}
