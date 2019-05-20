package work.baseexercise.oop.exercise05;

import java.util.Scanner;

public class GuessA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int guessV = in.nextInt();

        if (guessV == A.V) {
            System.out.println("猜对了");
        } else if (guessV > A.V) {
            System.out.println("大了");
        } else {
            System.out.println("小了");
        }
    }
}
