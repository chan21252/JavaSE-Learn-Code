package unit2.operator;

public class BinaryCount {
    public static void main(String[] args) {
        int n = 50;
        int m = 60;
        int age = 18;
       /*boolean bool = n > m & ++age == 18;
       System.out.println(bool);
       System.out.println(age);*/

        /* 按位与整数进行计算 */
        int a = 7;
        int b = 8;
        int a_b = a & b;
        System.out.println(a_b);    //0
        /*
          0111
        & 1000
        ------
          0000
        */

        /* 按位或运算符 */
        boolean bool2 = n < m | age-- == 18;
        System.out.println("按位或的运算结果是 " + bool2);
        System.out.println("aged的值是 " + age);

        /* 按位或整数进行计算 */
        int n2 = 5;
        int n3 = 8;
        int n2_n3 = n2 | n3;
        System.out.println(n2 + " 的二进制是 " + Integer.toBinaryString(n2));
        System.out.println(n3 + " 的二进制是 " + Integer.toBinaryString(n3));
        System.out.println(n2_n3);  //13
        /*
          0101
        | 1000
        ------
          1101
         */

    }
}
