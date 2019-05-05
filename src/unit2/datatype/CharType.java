package unit2.datatype;

public class CharType {
    public static void main(String[] args) {
        char gender = '男';

        System.out.println(gender);

        //使用转义符号输出特殊字符
        System.out.println("单引号" + '\'' + "结果");
        System.out.println("换行符" + '\n' + "结果");
        System.out.println("tab" + '\t' + "结果");

        /* char 和 int 数据的兼容使用*/
        int num = 500;
        char ch = ' ';
        ch = 32;

        System.out.println("ch 的值是 " + ch);

        char ch2 = '国';
        System.out.println((int)ch2);       //使用强制类型转换获取char字符对应的int数值

        num = '中';
        System.out.println("num 输出字符\'中\'的结果 " + (char)num);

        num = ch2;
        System.out.println((char)num);
    }
}
