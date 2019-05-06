package unit5;

import java.util.Scanner;

public class TestMultiArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] stuScores;
        stuScores = new double[3][3];

        /*
        stuScores[0] = new double[2];
        stuScores[1] = new double[3];
        stuScores[2] = new double[4];
         */

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个学生的成绩");
            for (int j = 0; j < 3; j++) {
                System.out.println("请输入第 " + (j + 1) + " 门成绩");
                stuScores[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("第 " + (i + 1) + " 个学生的成绩");
            for (int j = 0; j < 3; j++) {
                System.out.print(stuScores[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
