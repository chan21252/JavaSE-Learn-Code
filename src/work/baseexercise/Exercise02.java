package work.baseexercise;

import java.util.Scanner;

/**
 * 将一个字符由小写字母转换为大写字母。
 * 从控制台输入 a ，输出A
 */
public class Exercise02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("请输入一个小写英文字母：");
            String s = in.next("[a-z]");

            char c = s.charAt(0);

            //A：65，a：97
            char c1 = (char) (c - 32);

            System.out.println(c + "的大写是" + c1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
