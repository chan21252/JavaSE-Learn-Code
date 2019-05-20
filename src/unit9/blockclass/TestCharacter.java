package unit9.blockclass;

public class TestCharacter {
    public static void main(String[] args) {
        /* Character对象创建 */
        Character chObj = new Character('中');
        Character chObj2 = Character.valueOf('A');
        Character chObj3 = 'A';

        /* 常用实例方法 */

        //获取char值
        char zhong = chObj.charValue();
        System.out.println(zhong);

        //比较大小
        System.out.println(chObj2.compareTo('B'));

        //变成字符串
        String s = chObj3.toString();
        System.out.println(s);

        //小写转大写
        char[] chars = {'a', 'c', 'c', 'O', 'u', 'n', 'T', '1', '2'};

        fromLowerToUpper(chars);

        for (char c : chars) {
            System.out.print(c);
        }
    }

    public static void fromLowerToUpper(char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            if (Character.isLowerCase(chs[i])) {
                chs[i] = (char) (chs[i] - 32);
            }
        }
    }
}
