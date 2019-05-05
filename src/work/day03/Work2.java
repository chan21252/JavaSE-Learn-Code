package work.day03;

/**
 * 任务 2
 * 编写控制台java程序，将以下数据使用合理类型变量进行接收赋值
 * 3.5；185.59；8500.50
 * 要求在控制台打印这些数据并只显示整数部分。
 */
public class Work2 {
    public static void main(String[] args) {
        double dou1 = 3.5;
        double dou2 = 185.59;
        double dou3 = 8500.50;

        //double转int，高精度转低精度，需强制转换。转换后丢失精度
        int num1 = (int)dou1;
        int num2 = (int)dou2;
        int num3 = (int)dou3;

        System.out.println(dou1 + " 的整数部分是 " + num1);
        System.out.println(dou2 + " 的整数部分是 " + num2);
        System.out.println(dou3 + " 的整数部分是 " + num3);
    }
}
