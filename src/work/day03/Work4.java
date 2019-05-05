package work.day03;

import java.util.Scanner;

/**
 * 任务 4
 * 白大壮和白二壮是双胞胎兄弟，白大壮的身高增加1厘米正好是白二壮的身高，白二壮体重正好是妹妹白无瑕体重，
 * 编写程序完成白大壮和白二壮身高的计算并输出，并计算白无瑕的体重输出是多少
 */
public class Work4 {
    public static void main(String[] args) {
        double baiDazhuangHeight;
        double baiErzhuangHeight;
        double baiErzhuangWeight;
        double baiWuXiaWeight;

        Scanner in = new Scanner(System.in);

        System.out.println("请输入白二壮的身高，回车继续：");
        baiErzhuangHeight = in.nextDouble();
        System.out.println("请输入白二壮的体重，回车继续：");
        baiErzhuangWeight = in.nextDouble();

        baiDazhuangHeight = baiErzhuangHeight - 1;
        baiWuXiaWeight = baiErzhuangWeight;

        System.out.println("白大壮的身高是 " + baiDazhuangHeight + "cm");
        System.out.println("白二壮的身高是 " + baiErzhuangHeight + "cm");
        System.out.println("白无瑕的体重是 " + baiWuXiaWeight + "kg");
    }
}
