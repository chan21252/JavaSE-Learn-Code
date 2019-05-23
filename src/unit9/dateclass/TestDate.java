package unit9.dateclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入员工信息");
        Employee emp = new Employee();

        System.out.println("请输入姓名：");
        String name = in.next();

        System.out.println("请输入性别：");
        String sex = in.next();

        System.out.println("请输入生日：");
        System.out.println("请输入出生年份：");
        int y = in.nextInt();
        System.out.println("请输入出生月份：");
        int m = in.nextInt();
        System.out.println("请输入出生日期：");
        int d = in.nextInt();

        String DateStr = y + "-" + m + "-" + d;
        DateFormat df = DateFormat.getDateInstance();   //使用静态方法获取DateFormat实例
        Date birth = null;
        try {
            birth = df.parse(DateStr);      //DateStr转为Date对象
        } catch (ParseException e) {
            e.printStackTrace();
        }

        emp.setName(name);
        emp.setSex(sex);
        emp.setBirth(birth);

        emp.showMe();

    }
}
