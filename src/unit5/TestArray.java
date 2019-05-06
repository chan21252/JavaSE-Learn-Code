package unit5;

public class TestArray {
    public static void main(String[] args) {
        int len = 5;

        int[] nums;  //声明一个int类型数组，jvm并未分配内存
        nums = new int[len];    //创建一个长度为5的int类型数组

        int[] ages = {25, 12, 100, 36, 9};

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        nums[0] = 1;
        nums[nums.length - 1] = 5000;
        for (int e : nums) {
            System.out.println(e);
        }
    }
}
