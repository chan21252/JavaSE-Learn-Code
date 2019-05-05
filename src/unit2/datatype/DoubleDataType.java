package unit2.datatype;

public class DoubleDataType {
    public static void main(String[] args) {
        double height = 188.90;  //double类型的变量声明和赋初始值
        System.out.println("您的身高是 " + height);

        height = 189.90D;
        System.out.println("您的身高是 " + height);

        System.out.println("float类型存储的最大值是 " + Float.MAX_VALUE);
        System.out.println("double类型存储的最大值是 " + Double.MAX_VALUE);

        float flo = 2e2F;
        height = 1.5e2;

        System.out.println("flo 变量的值是 " + flo);
        System.out.println("height 变量的值是 " + height);

        //int num = 1e1;      //错误:java: 不兼容的类型: 从double转换到int可能会有损失
    }
}
