package work.day03;

import java.util.Scanner;

/**
 * 任务 3
 * 已知有三个人，张无忌，任盈盈，任我行。当前只知道任盈盈的年龄可以被用户从控制台输入，并且用户可以告知任盈盈的年龄比张无忌的年龄小几岁，任我行年龄是张无忌和任盈盈年龄和还要大几岁，编写控制台程序计算三个人的年龄分别是多少在控制台打印输出，并最后计算输出3个人年龄总和是多少。
 */
public class Work3 {
    public static void main(String[] args) {
        int zhangWuJi;
        int renYingYing;
        int renWoXing;

        final int ZWJ_RYY_GAP = 5;      //张无忌和任盈盈的年龄差
        final int RWX_ZWJRYY_GAP = 10;  //任我行和张无忌任盈盈年龄和的差

        Scanner in = new Scanner(System.in);

        System.out.println("请输入任盈盈的年龄，\n"+
                "任盈盈比张无忌小"+ ZWJ_RYY_GAP +"岁，\n"+
                "任我行的年龄比张无忌和任盈盈的年龄和大"+ RWX_ZWJRYY_GAP +"岁。回车继续：");
        renYingYing = in.nextInt();     //输入任盈盈年龄

        //计算其他人年龄
        zhangWuJi = renYingYing + ZWJ_RYY_GAP;
        renWoXing = renYingYing + zhangWuJi + RWX_ZWJRYY_GAP;
        int sumAge = renYingYing + zhangWuJi + renWoXing;

        System.out.println("任盈盈的年龄是 " + renYingYing + " 岁");
        System.out.println("张无忌的年龄是 " + zhangWuJi + " 岁");
        System.out.println("任我行的年龄是 " + renWoXing + " 岁");
        System.out.println("三人一共 " + sumAge + " 岁");
    }
}
