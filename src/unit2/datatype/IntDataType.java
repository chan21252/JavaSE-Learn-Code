package unit2.datatype;

public class IntDataType {
    public static void main(String[] args) {
        byte by = -128;
        short sho = 520;

        int maxNum = Integer.MAX_VALUE;     //int类型存储的最大值
        System.out.println("num存储的值是int类型最大值 " + maxNum);

        System.out.println(Integer.MAX_VALUE + 1);  //错误，会输出-2147483648
    }
}
