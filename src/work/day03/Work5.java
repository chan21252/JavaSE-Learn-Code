package work.day03;

import java.util.Scanner;

/**
 * 任务 5
 * 有三位老师，王老师，孙老师和小李老师，王老师工龄最长(工龄最长为15年)，
 * 孙老师工龄比王老师小3年，小李老师工龄最短，是王老师和孙老师工龄和的二分之一再除以2的余数正好是他的工龄，
 * 编写程序从控制台接收谁的工龄就可以计算出三位老师的工龄
 */
public class Work5 {
    public static void main(String[] args) {
        int wang;
        int sun;
        int li;

        Scanner in = new Scanner(System.in);
        System.out.println("请输入王老师的工龄，（最长工龄是15年），回车继续：");
        wang = in.nextInt();
        sun = wang - 3;
        li = (wang + sun) / 2 % 2;

        System.out.println("王老师的工龄是 " + wang + "年");
        System.out.println("孙老师的工龄是 " + sun + "年");
        System.out.println("李老师的工龄是 " + li + "年");
    }
}
