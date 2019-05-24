package unit9.mathclass;

import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* abs 计算绝对值 */
        System.out.println("请输入一个数，计算绝对值");
        System.out.println("绝对值是 " + Math.abs(in.nextInt()));

        /* cbrt 计算立方根*/
        System.out.println("请输入一个数，计算立方根");
        System.out.println("立方根是 " + Math.cbrt(in.nextInt()));

        /* ceil 计算大于等于参数的最小值 */
        System.out.println("请输入一个数，计算大于等于参数的最小值");
        System.out.println("这个数是 " + Math.ceil(in.nextDouble()));

        /* floor 计算小于等于参数的最大值 */
        System.out.println("请输入一个数，计算小于等于参数的最大值");
        System.out.println("这个数是 " + Math.floor(in.nextDouble()));

        /* max,min 比较2个数的大小 */
        System.out.println("请输入第一个数");
        int m = in.nextInt();
        System.out.println("请输入第二个数");
        int n = in.nextInt();
        System.out.println("较大的数是 " + Math.max(n, m));

        /* pow 计算a的b次幂 */
        System.out.println("请输入第一个数");
        int a = in.nextInt();
        System.out.println("请输入第二个数");
        int b = in.nextInt();
        System.out.println(a + "的" + b + "次幂是 " + Math.pow(a, b));

        /* random 产生0.0-1.0之间的随机数 */
        System.out.println("请输入一个1-9的数，看看猜的准不准");
        int num = in.nextInt();
        int rand = (int)(Math.random() * 10);
        System.out.println("数字是 " + rand);
        if (num == rand){
            System.out.println("猜对了");
        }else {
            System.out.println("猜错了");
        }
    }
}
