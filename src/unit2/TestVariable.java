package unit2;

public class TestVariable {
    static int quantity = 520;  //这是一个全局变量，在整个类中有效

    public static void main(String[] args) {
        int num;    //声明了一个int类型的变量num
        num = 100;  //为变量赋值
        System.out.println("num的值是 " + num);

        num = 200;  //更改变量的值为200
        System.out.println("num赋新的值是 " + num);

        //错误语句 age = 25;   //变量未声明便使用，是错误的
        int age = 25;
        System.out.println(age);
        System.out.println("全局变量 quantity 的值是 " + quantity);

        testGlobalVariable();   //这是调用一个static的静态方法

        System.out.println("全局变量 quantity 的值是 " + quantity);
    }

    public static void testGlobalVariable() {
        quantity = 1000;
        System.out.println(quantity);
    }
}
