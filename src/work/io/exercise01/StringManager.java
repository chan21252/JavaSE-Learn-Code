package work.io.exercise01;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串操作类
 *
 * @author CuiCan
 */
public class StringManager {
    /**
     * 统计字符串中各字符出现的次数，并输出到控制台
     *
     * @param str 字符串
     */
    public static void countChar(String str) {
        /*
        str转char数组
        遍历char数组，Map保存当前字符和数量的映射
            如果Map的key包含当前字符，value++
            如果Map的key不包含当前字符，添加到映射
         */
        if (str == null)
            return;

        /* 统计字符个数 */
        System.out.println("开始统计字符个数");
        char[] chs = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : chs) {
            if (charMap.containsKey(c)) {
                int count = charMap.get(c) + 1;
                charMap.put(c, count);
            } else {
                charMap.put(c, 1);
            }
        }

        /* 输出字符统计结果 */
        System.out.println("统计结果如下：");
        for (Map.Entry entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }
    }

    /**
     * 大写转成小写，小写转成大写，空格转成下划线
     *
     * @param str 字符串
     * @return 转换后的字符串
     */
    public static String convert(String str) {
        if (str == null)
            return null;

        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            char c = chs[i];
            //大写字母65-90
            if (c >= 65 && c <= 90) {
                chs[i] = (char) ((int) c + 32);
            }
            //大写字母97-122
            if (c >= 97 && c <= 122) {
                chs[i] = (char) ((int) c - 32);
            }
            //空格 32 下划线 95
            if (c == 32) {
                chs[i] = 95;
            }
        }
        return String.valueOf(chs);
    }
}
