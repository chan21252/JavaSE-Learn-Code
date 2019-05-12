package work.baseexercise;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
 * <p>
 * 例如输入 Ab12  sd
 * 输出字母：4，空格1个，数字2个，这里的数字按0到9算，12是1和2不是12
 */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入一行字符：");
        in.useDelimiter("\n");  //修改默认的分隔符，改为换行符
        String s = in.next("[\\w\\s]+");

        char[] chars = s.toCharArray();

        int countCh = 0;
        int countNum = 0;
        int countSpace = 0;

        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                ++countNum;
            }

            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                ++countCh;
            }

            if (c == 32) {
                ++countSpace;
            }
        }

        System.out.println("英文字母有 " + countCh + " 个，数字有 " + countNum + " 个，空格有 " + countSpace + " 个。");
    }
}
