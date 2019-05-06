package unit2.operator;

public class MoveBit {
    public static void main(String[] args) {
        /* 向左移位 */
        int n = 3;
        int moveNRes = n << 2;
        System.out.println(n + "的二进制形式是 " + Integer.toBinaryString(n));
        System.out.println(n + "左移2位的结果是 " + moveNRes);
        /*
        <<2 0011
        --------
          001100
         */

        /* 向右移位 */
        int a = -7;
        int rMoveRes = a >> 2;
        System.out.println(a + "的二进制形式是 " + Integer.toBinaryString(a));
        System.out.println(a + "右移2位的结果是 " + rMoveRes);

        /*
             1 0000000 00000000 00000000 00000111 原码 -7
         >>2 1 1111111 11111111 11111111 11111001 补码 -7
        -----------------------------------------
             1 1111111 11111111 11111111 11111110 01（舍弃） --补码
             1 0000000 00000000 00000000 00000010 原码-2
         */

        /* 无符号右移 */
        int n1 = -12;
        int rMoveRes2 = n1 >>> 3;
        System.out.println(n1 + "的二进制形式是 " + Integer.toBinaryString(n1));
        System.out.println(n1 + "无符号右移3位的结果是 " + rMoveRes2);

        /*
        1 0000000 00000000 00000000 00001100 原码-12
        1 1111111 11111111 11111111 11110100 补码
        ------------------------------------
        0 0011111 11111111 11111111 11111110 100（舍弃）正数原码，536870910
         */

    }
}
