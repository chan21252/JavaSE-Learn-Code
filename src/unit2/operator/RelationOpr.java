package unit2.operator;

import java.util.Scanner;

public class RelationOpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age2;
        int age3;

        System.out.println("请输入第一个人的年龄，回车继续");
        age2 = in.nextInt();
        System.out.println("请输入第二个人的年龄，回车继续");
        age3 = in.nextInt();

        System.out.println(age2 + "大于" + age3 + "吗？ " + (age2>age3));
        System.out.println(age2 + "大于等于18吗？" + (age2>=18));
        System.out.println(age3 + "小于等于18吗？" + (age3<=18));
        System.out.println(age3 + "小于"+ age2 +"减1吗？" + (age3<--age2));
        System.out.println(age2 + "等于" + age3 + "吗？" + (age2==age3));
        System.out.println(age2 + "不等于" + age3 + "吗？" + (age2!=age3));
    }
}
