package unit2.operator;

import java.util.Scanner;

public class ArithOpr {
    public static void main(String[] args) {
        /* 计算梯形面积 */
        double up;
        double down;
        double height;

        Scanner in = new Scanner(System.in);

        System.out.println("请输入梯形的上底");
        up = in.nextDouble();
        System.out.println("请输入梯形的下底");
        down = in.nextDouble();
        System.out.println("请输入梯形的高");
        height = in.nextDouble();

        double area = (up + down) * height / 2;

        System.out.println("梯形的面积是 " + area);

        String name;
        name = in.next();
        System.out.println("name 是 " + name);

    }
}
