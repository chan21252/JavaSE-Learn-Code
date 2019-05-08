package work.mytest;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 创建一个10个长度的数组，随机从控制台输入10个数，最多不能超过10个，最少不能低于5个数，意思是他输入5个也行，7个也行，9个也行
 * 统计出数组中最小的数是什么？最少的数有几个？例如输入两个1，那么最小的数就是1，有两个最小的数
 * 统计出数组中最大的数是什么？最大数有几个？
 * 统计出数组中能被2整除和不能被2整除的数有多少个？分别是什么？
 * 最后把数组中的数按升序排序输出
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = initArray();
        System.out.println(getMinElement(arr));
    }

    private static int[] initArray() {
        Scanner in = new Scanner(System.in);

        final int MAX_LENGTH = 10;      //数组允许的最大长度
        int count = MAX_LENGTH;         //数组实际有效的元素个数
        int[] inputArray = new int[MAX_LENGTH];

        //输入数值
        for (int i = 0; i < MAX_LENGTH; i++) {
            //输入5个以后可以退出
            if (i >= 5) {
                System.out.println("已经输入5个数了。如果不想输入，请按q退出，输入其他继续");
                if ("q".equals(in.next())) {
                    count = i;
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("请输入第" + (i + 1) + "个整数：");
                    inputArray[i] = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("输入的不是整数，请重试");
                    in.next();
                } catch (Exception e1) {
                    throw new RuntimeException(e1);
                }
            }
        }

        //数组有效元素装载到新数组
        int[] resultArray = new int[count];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = inputArray[i];
        }

        return resultArray;
    }

    private static int getMinElement(int[] array) {
        int minElement = array[0];      //假设最小的数是a[0]
        int minCount = 0;       //最小数的个数

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                //当前元素和剩余元素比较，如果找到一个更小的，
                if (array[j] <= array[i]) {
                    minElement = array[j];
                    break;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minElement) {
                minCount++;
            }
        }

        System.out.println("最小的数是 " + minElement + " ，有 " + minCount + "个， ");
        return minElement;
    }
}
