package unit2.operator;

/**
 * 按位异或运算
 */
public class BinaryCount2 {
    public static void main(String[] args) {
        System.out.println(true ^ true);        //false
        System.out.println(false ^ false);      //false
        System.out.println(true ^ false);       //true
        System.out.println(false ^ true);       //true

        System.out.println(5 > 6 ^ 6 == 7);         //false
        System.out.println(!false ^ false);     //true
        System.out.println(true ^ 8 == 8);        //false
        System.out.println((34 > 35 && 2 < 3) ^ true);    //true

        /* 对整数运算 */
        int a = 5;
        int b = 7;
        int a_b = a ^ b;    //2
        System.out.println(a + " 的二进制是 " + Integer.toBinaryString(a));
        System.out.println(b + " 的二进制是 " + Integer.toBinaryString(b));
        System.out.println(a + " ^ " + b + "结果是 " + a_b);
        /*
          0101
        ^ 0111
        ------
          0010
         */

        int n1 = 10;
        int n2 = 15;
        System.out.println(n1 + " 的二进制是 " + Integer.toBinaryString(n1));
        System.out.println(n2 + " 的二进制是 " + Integer.toBinaryString(n2));
        System.out.println("~" + n1 + "结果是 " + ~n1);
        System.out.println("~" + n2 + "结果是 " + ~n2);
        /*
         ~ 0 1010
         --------
           1 0101  补码
           1 1011  原码

         ~ 0 1111
         --------
           1 0000  补码
          1 10000  原码

         */
    }
}
