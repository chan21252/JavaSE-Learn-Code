package unit6;

import unit6.entity.Computer;

import java.util.Scanner;

public class TestArgs {
    public static void main(String[] args) {
        Computer computer = new Computer();
        int m = 50;
        int n = 55;
        computer.countSum(m, n);
        System.out.println(m);
        System.out.println(n);

        Scanner in = new Scanner(System.in);

        System.out.println("请输入梯形的上底：");
        double up = in.nextDouble();
        System.out.println("请输入梯形的下底：");
        double down = in.nextDouble();
        System.out.println("请输入梯形的高：");
        double height = in.nextDouble();

        System.out.println("梯形的面积是 " + computer.countTrapezoidArea(up, down, height));
    }
}
