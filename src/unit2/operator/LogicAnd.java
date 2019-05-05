package unit2.operator;

public class LogicAnd {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        double d1 = 3.6;
        double d2 = 3.0;

        boolean bool1 = n > m && d1 > d2;
        System.out.println("bool1 的结果是 " + bool1);

        boolean bool2 = n <= m && d1 >= d2;
        System.out.println("bool2 的结果是 " + bool2);

        boolean bool3 = d2 > d1 && ++n == m;    //&&是短路与，第一个布尔表达式是false，所以后面的表达式不会执行
        System.out.println("bool3 的结果是 " + bool3);
        System.out.println("变量n的结果是 " + n);     //n=5
    }
}
