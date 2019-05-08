package work.mytest;

/**
 * 有如下数组：
 * int[] arr = {12,23,23,53,45,345,345,35,35,345,56,7,5,67,8,9,7,4,35,5,3,2,424}
 * 打印出数组中重复的数字，并且计算出重复的数有几个，都有哪些数重复？并且打印出重复数在数组中的坐标？
 * 例如23是重复的，在这个数组里有几个23，除了23还有那些数字重复。
 */
public class RepeateArrayElement {
    public static void main(String[] args) {
        int[] arr = {12, 23, 23, 53, 45, 345, 345, 35, 35, 345, 56, 7, 5, 67, 8, 9, 7, 4, 35, 5, 3, 2, 424};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("重复元素：" + arr[j] + "，下标：" + j);
                    count++;
                    break;
                }
            }
        }

        System.out.println("一共有 " + count + " 个重复元素");
    }
}
