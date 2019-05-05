package work.day03;

import java.util.Scanner;

/**
 * 任务 1
 * 编写控制台java程序，使用Scanner 对象相关方法从控制台接收用户输入如下数据并使用相关的局部变量接收，在控制台打印输出。
 * 老师的姓名；老师的性别；老师的工资；老师的年龄；工作时长
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        //创建扫描仪对象

        //定义局部变量，用来接收控制台输入
        String teacherName;
        String teacherGender;
        double teacherSalary;
        int teacherAge;
        int teacherWorkTime;

        //调用适配类型的next方法，接收控制台输入
        System.out.println("请输入老师的姓名，回车继续：");
        teacherName = in.next();
        System.out.println("请输入老师的性别，回车继续：");
        teacherGender = in.next();
        System.out.println("请输入老师的工资，回车继续：");
        teacherSalary = in.nextDouble();
        System.out.println("请输入老师的年龄，回车继续：");
        teacherAge = in.nextInt();
        System.out.println("请输入老师的工作时长，回车继续：");
        teacherWorkTime = in.nextInt();

        //输出变量
        System.out.println("老师的姓名是 " + teacherName);
        System.out.println("老师的性别是 " + teacherGender);
        System.out.println("老师的工资是 " + teacherSalary);
        System.out.println("老师的年龄是 " + teacherAge);
        System.out.println("老师的工作时长是 " + teacherWorkTime);
    }
}
