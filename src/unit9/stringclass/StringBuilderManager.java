package unit9.stringclass;

public class StringBuilderManager {

    /**
     * 将字符串数组的所有字符串添加到一个字符串的末尾，返回添加完的字符串
     *
     * @param base 基础字符串
     * @param strs 字符串数组
     * @return 添加完的字符串
     */
    public static String concatString(String base, String[] strs) {
        StringBuilder builder = new StringBuilder(base);

        for (String s : strs) {
            builder.append(" ").append(s);
        }

        return builder.toString();
    }

    /**
     * 删除指定字符串中所有的空格
     *
     * @param target 字符串
     * @return 删除空格后的字符串
     */
    public static String deleteSpace(String target) {

        while (target.contains(" ")) {      //如果存在空格
            StringBuilder builder = new StringBuilder(target);      //使用target构建可变字符串
            int index = builder.indexOf(" ");   //找寻空格索引
            builder.deleteCharAt(index);        //删除空格
            target = builder.toString();        //删除空格后的字符串赋值给target
        }

        return target;
    }
}
