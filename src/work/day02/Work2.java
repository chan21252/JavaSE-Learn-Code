package work.day02;

/**
 * 任务2 编写控制台程序将以下给定的整数常量用合适的变量接收并将其10进制值与二进制表示形式分别输出打印在控制台界面
 * 55；666；1080；2500；78451；3600；65535；70000
 */
public class Work2 {
    public static void main(String[] args) {
        /*
        byte -128 ~ 127
        short -2^15 ~ 2^15 -1
        int -2^31 ~ 2^31-1
        long -2^63 ~ 2^63-1
         */
        /*
        System.out.println(Byte.MAX_VALUE);     //127
        System.out.println(Short.MAX_VALUE);    //32767
        System.out.println(Integer.MAX_VALUE);  //2147483647
        */

        byte a = 55;
        short b = 666;
        short c = 1080;
        short d = 2500;
        int e = 78451;
        short f = 3600;
        int g = 65535;
        int h = 70000;

        System.out.println("a 十进制是 " + a + " ，二进制是 " + Integer.toBinaryString(a));
        System.out.println("b 十进制是 " + b + " ，二进制是 " + Integer.toBinaryString(b));
        System.out.println("c 十进制是 " + c + " ，二进制是 " + Integer.toBinaryString(c));
        System.out.println("d 十进制是 " + d + " ，二进制是 " + Integer.toBinaryString(d));
        System.out.println("e 十进制是 " + e + " ，二进制是 " + Integer.toBinaryString(e));
        System.out.println("f 十进制是 " + f + " ，二进制是 " + Integer.toBinaryString(f));
        System.out.println("g 十进制是 " + g + " ，二进制是 " + Integer.toBinaryString(g));
        System.out.println("h 十进制是 " + h + " ，二进制是 " + Integer.toBinaryString(h));
    }
}
