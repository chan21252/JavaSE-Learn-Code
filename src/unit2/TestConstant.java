package unit2;

public class TestConstant {
    public static void main(String[] args) {
        final int MAX_NUM = 1000;   //java中常量的定义，关键字final
        System.out.println("常量 MAX_NUM 的值是 " + MAX_NUM);

        //MAX_NUM = 200;      //错误，常量的值不能被修改
    }
}
