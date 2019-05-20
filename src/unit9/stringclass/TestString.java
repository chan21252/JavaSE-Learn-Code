package unit9.stringclass;

public class TestString {
    public static void main(String[] args) {
        String str = new String("我的中国心");

        char[] chs = {'I', 'a', 'm', 'C', 'h', 'i', 'n', 'e', 's', 'e'};
        String str2 = new String(chs);
        String str3 = new String(chs, 3, 7);
        String str4 = new String("\"\\\n\t");
        String str5 = "abc";

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
