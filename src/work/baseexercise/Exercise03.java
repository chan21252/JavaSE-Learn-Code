package work.baseexercise;

import java.util.Scanner;

/**
 * 从控制台输入一个字符串，由字母组成，转换成大写后输出。
 * 如果输入的是小写，就转换成大写。
 * 如果输入的是大写，就转换成小写
 * 例如输入：abCd ，控制台输入 ABcD
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("请输入一个英文字符串");
            String s = in.next("[A-Za-z]+");

            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                //大写
                if (c >= 65 && c <= 90) {
                    chars[i] = (char) (c + 32);
                }

                //小写
                if (c >= 97 && c <= 122) {
                    chars[i] = (char) (c - 32);
                }
            }

            String sNew = String.valueOf(chars);

            System.out.println(s + " 转换后是 " + sNew);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
