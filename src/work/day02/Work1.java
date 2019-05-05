package work.day02;

/**
 * 定义一个包含main方法的java类，在main方法中使用合适的数据类型定义如下局部变量，标识符要严格遵守java规范。
 * 学生姓名；学生年龄；学生身高，学生性别，家庭住址，体重，并在控制台使用System.out.print()方法将这些变量数据输出到控制台，要求换行输出
 */
public class Work1 {
    public static void main(String[] args) {
        String studentName = "CuiCan";
        int studentAge = 25;
        int studentHeight = 178;
        double studentWeight = 75.5;
        String studentGender = "男";
        String studentAddress = "上海市静安区延安中路855号";

        System.out.println("学生姓名： " + studentName);
        System.out.println("学生年龄： " + studentAge);
        System.out.println("学生身高： " + studentHeight + "cm");
        System.out.println("学生体重： " + studentWeight + "kg");
        System.out.println("学生性别： " + studentGender);
        System.out.println("学生住址： " + studentAddress);
    }
}
