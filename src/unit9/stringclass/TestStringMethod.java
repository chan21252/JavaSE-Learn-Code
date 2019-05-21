package unit9.stringclass;

public class TestStringMethod {
    public static void main(String[] args) {
        String name1 = "东方不败";
        String name2 = "东方失败";
        System.out.println(StringManager.equalName(name1, name2));
        System.out.println(name1 == "东方不败");    //==是比较两个变量引用对象的内存地址是否相同

        char ch = StringManager.findCharByIndex("我爱我的祖国", 5);   //index不能超出字符串的长度
        System.out.println(ch);

        String email = "java_20019@162.cn";
        boolean bool = StringManager.isEmail(email);
        System.out.println(bool);

        boolean bool2 = StringManager.validataNamePrefix("张三丰", "张");
        System.out.println(bool2);

        String password = "  king123 ";
        System.out.println(password.length());
        String newPassword = password.trim();   //原字符串不变，新生成一个字符串返回
        System.out.println(password);
        System.out.println(newPassword);

        /* String 的indexOf 重载方法使用 */
        System.out.println(email.indexOf('@'));
        System.out.println(email.indexOf('中'));
        System.out.println(email.indexOf('@', 11));
        System.out.println(email.indexOf('.', 11));
        System.out.println(email.indexOf("cn"));

        /* 分隔字符串方法 */
        String target = "刘备,关羽,张飞,赵云,马超,黄忠";
        String[] strings = StringManager.splitStringByTag(target, ",");

        for (String s : strings) {
            System.out.println(s);
        }

        /* 提取子串方法 */
        String subStr = target.substring(3, 10);    //从3开始，不包含10
        //String subStr2 = target.substring(3, 100);    //错误，索引越界
        System.out.println(subStr);

        char[] chs2 = {'a', 'B', 'c', 'D', 'E', 'f'};
        System.out.println(StringManager.toLowerFromString(chs2, 's'));

        /* valueOf 构建字符串 */
        String str5 = String.valueOf(789);
        System.out.println(str5 + 100);

        /* 替换字符或字符串 */
        System.out.println(target.replace('备', '邦'));
        System.out.println(target);

        System.out.println(target.replace("黄忠", "诸葛亮"));
    }
}
