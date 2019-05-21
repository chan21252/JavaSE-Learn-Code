package unit9.stringclass;

public class StringManager {
    /**
     * 比较2个人的名字是否完全相同
     *
     * @return 比较结果，相同返回true，否则返回false
     */
    public static boolean equalName(String name1, String name2) {
        return name1.equals(name2);
    }

    /**
     * 返回字符串指定索引位置的字符
     *
     * @param source
     * @param index
     * @return char字符
     */
    public static char findCharByIndex(String source, int index) {
        if (index > 0 && index <= source.length() - 1) {
            return source.charAt(index);
        } else {
            return '?';
        }
    }

    /**
     * 验证给定的邮箱地址是否已.com结尾
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        return email.endsWith(".com");
    }

    /**
     * 验证名字是否已给定的前缀开始
     *
     * @param name
     * @param prefix
     * @return
     */
    public static boolean validataNamePrefix(String name, String prefix) {
        return name.startsWith(prefix);
    }

    public static String[] splitStringByTag(String soure, String tag) {
        return soure.split(tag);
    }

    /**
     * 将给定字符串转换为char[]返回
     *
     * @param target
     * @return
     */
    public static char[] toArrayFromString(String target) {
        return target.toCharArray();
    }

    /**
     * 将给定char数组根据ch的值转为大写或小写字符串返回
     *
     * @param chs char数组
     * @param ch  转换标记
     * @return 转换后的字符串
     */
    public static String toLowerFromString(char[] chs, char ch) {
        String target = new String(chs);
        if (ch == 'L' || ch == 'l') {
            return target.toLowerCase();
        } else {
            return target.toUpperCase();
        }
    }
}
