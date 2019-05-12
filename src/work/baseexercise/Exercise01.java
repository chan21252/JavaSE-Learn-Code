package work.baseexercise;

import java.util.Scanner;

/**
 * 反转一个只有3位数的整数。
 * 从控制台输入321，输出123
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                //输入整数
                System.out.println("请输入一个整数：");
                int n = in.nextInt();

                //整数转字符串转char数组
                String s = Integer.toString(n);
                char[] chars = s.toCharArray();
                char[] charsReverse = new char[chars.length];

                //反转
                if (n >= 0) {
                    for (int i = 0; i < chars.length; i++) {
                        charsReverse[i] = chars[chars.length - 1 - i];
                    }
                } else {
                    //负数符号位不换
                    charsReverse[0] = chars[0];
                    for (int i = 1; i < chars.length; i++) {
                        charsReverse[i] = chars[chars.length - i];
                    }
                }

                String sReverse = String.valueOf(charsReverse);
                System.out.println(s + " 反转后是 " + sReverse);

                break;
            } catch (Exception e) {
                in.next();
                System.out.println("输入错误：" + e.getLocalizedMessage());
            }
        }

    }
}
