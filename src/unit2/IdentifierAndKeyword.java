package unit2;

public class IdentifierAndKeyword {
    public static void main(String[] args) {
        int stuAge = 23;            //stuAge是一个变量，属于标识符
        final int MAX_NUM = 25;     //MAX_NUM是一个常量标识符
        String $我是变量 = "变量";

        if (stuAge > 17) {   //if是一个关键字，表示条件判断
            System.out.println("成年人");
        }
    }
}
