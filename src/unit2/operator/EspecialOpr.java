package unit2.operator;

import java.util.Scanner;

public class EspecialOpr {
    public static void main(String[] args) {    //[]数组标志
        Scanner in = new Scanner(System.in);    //new创建对象
        System.out.println("请输入一个数");   //.是访问符号
        double d = 3.5;     //.表示小数点
        d = (600 + 500) / 20;   //()表示优先运算

        boolean bool = in instanceof java.util.Scanner;
        System.out.println(bool);

    }
}
