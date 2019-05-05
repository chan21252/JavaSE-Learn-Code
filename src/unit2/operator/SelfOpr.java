package unit2.operator;

public class SelfOpr {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;

        int sum;

        //sum = n++ + m;      //sum=11; n=6; => (n赋值给一个临时变量，计算临时变量 + m，然后赋值给sum。n自增1)
        sum = ++n + m;       //sum=12; n=6; => (n先自增1，然后计算n+m，赋值给sum)
        System.out.println("sum 的结果是 " + sum);
        System.out.println("变量 n 自增1的结果是 " + n);

        sum = --n + m++;    //sum = 11; n = 5; m=7; n先自减1，计算n+m赋值给sum，m再自增1，
        System.out.println("sum 的结果是 " + sum);
        System.out.println("n 的值 " + n);
        System.out.println("m 的值 " + m);
    }
}
