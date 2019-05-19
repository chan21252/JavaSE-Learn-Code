package work.baseexercise.base;

import java.util.Scanner;

/**
 * 输入三个整数x,y,z，请把这三个数由小到大输出。
 * 例如输入：1，3，2  输出  1，2，3
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("请输入整数序列：(格式1,2,3)");
            String s = in.next();

            String[] strArray = s.split(",");

            int[] arr = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                arr[i] = Integer.valueOf(strArray[i]);
            }

            arr = sortArr(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%d,", arr[i]);
            }
        } catch (Exception e) {
            System.out.println("输入错误，退出");
        }
    }

    private static int[] sortArr(int[] arr) {
        /*
        排序：
        从第1个数开始，将第1个数和后面的数依次比较，如果a[n]<a[0]，就调换两个数的位置,
        直到最后一个数结束
         */
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
