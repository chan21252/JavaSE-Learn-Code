package unit2.datatype;

public class LongDataType {
    public static void main(String[] args) {
        long lon = 5555;
        System.out.println("lon 的值是 " + lon);
        System.out.println("long 类型的最大值是 " + Long.MAX_VALUE);
        System.out.println("long 类型的最小值是 " + Long.MIN_VALUE);

        System.out.println("lon 的二进制形式是 " + Long.toBinaryString(lon));

        /* 以下代码会发生什么 */
        //lon = 3025164895;   //错误，jvm默认会把整数当作int类型来处理，3025164895超出int范围
        lon = 3025164895L;
        System.out.println("lon 重新赋值后是 " + lon);
    }
}
