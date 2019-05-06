package unit5;

import java.util.Scanner;

public class ScoreManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len;
        int[] scores;
        int countPass = 0;

        System.out.println("请输入一个整数，成绩的个数");
        len = in.nextInt();
        scores = new int[len];

        System.out.println("所有成绩如下：");
        for (int i = 0; i < len; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个成绩");
            scores[i] = in.nextInt();
            if (scores[i] < 60) {
                countPass++;
            }
        }

        for (int e : scores) {
            System.out.print(e + "\t");
        }

        System.out.println("低于60分的分数有 " + countPass + "个");
    }
}
