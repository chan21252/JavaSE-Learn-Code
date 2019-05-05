package unit2.operator;

public class BinaryCount {
    public static void main(String[] args) {
       int n = 50;
       int m = 60;
       int age = 18;
       boolean bool = n > m & ++age == 18;
       System.out.println(bool);
       System.out.println(age);

       /*按位与整数进行计算*/
        int a = 7;
        int b = 8;
        int a_b = a & b;
        System.out.println(a_b);    //0
        /*
        0111
        1000
        ----
        0000
        */
    }
}
