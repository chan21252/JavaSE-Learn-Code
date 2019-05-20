package unit9.blockclass;

public class TestInteger {
    public static void main(String[] args) {
        int num = 5;
        Integer intObj = new Integer(num);

        System.out.println("intObj 的值是 " + intObj);

        /* Integer intObj2 = new Integer("-789F");
        System.out.println(intObj2);*/

        Integer intObj3 = 100;
        System.out.println(intObj3);

        /* 静态属性常量 */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);

        //比较大小
        System.out.println(intObj3.compareTo(100));
        System.out.println(intObj3.compareTo(101));
        System.out.println(intObj3.compareTo(99));

        //intValue，shortValue，longValue，floatValue，doubleValue
        int num2 = intObj3.shortValue();
        System.out.println(num2);

        //将字符串转换为int数据返回
        int num3 = Integer.parseInt("125");
        System.out.println(num3);

        System.out.println(Integer.parseInt("1110", 2));
        System.out.println(Integer.parseInt("21", 8));
        System.out.println(Integer.parseInt("16f", 16));

        //valueOf获取一个Integer实例
        Integer intObj4 = Integer.valueOf(500);
        System.out.println(intObj4.intValue());

        System.out.println(Integer.valueOf("1111", 2));

        // 二进制，八进制，十六进制转换
        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.toOctalString(15));
        System.out.println(Integer.toHexString(15));


    }
}
