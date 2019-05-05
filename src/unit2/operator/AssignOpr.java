package unit2.operator;

import java.util.Scanner;

public class AssignOpr {
    public static void main(String[] args) {
        int age;
        age = 25;   //使用赋值运算符为age变量赋值

        int num = 5;

        num += age;     //求和赋值
        System.out.println("num的值是 " + num);

        //创建一个扫描仪对象
        Scanner input = new Scanner(System.in);

        int n2;
        System.out.println("请输入一个整数");
        n2 = input.nextInt();

        int n3 = 100;
        n3 -= n2;
        System.out.println("n3-n2结果是 " + n3);

        n3 *= n2;
        System.out.println("n3*n2结果是 " + n3);

        n3 /= n2;   //n2输入0会报错
        System.out.println("n3/n2结果是 " + n3);

        n3 %= n2;
        System.out.println("n3%n2结果是 " + n3);
    }
}
