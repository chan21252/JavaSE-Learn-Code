package unit9.dateclass;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestCalender2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Employee emp = new Employee();
        Employee emp2 = new Employee();

        System.out.println("输入第一个员工姓名：");
        emp.setName(in.next());
        System.out.println("输入第一个员工出生年份：");
        int year0 = in.nextInt();
        System.out.println("输入第一个员工出生月份：");
        int month0 = in.nextInt();
        System.out.println("输入第一个员出生日期：");
        int date0 = in.nextInt();

        Calendar cal0 = Calendar.getInstance();
        //cal0.set(year0, month0, date0);
        cal0.set(Calendar.YEAR, year0);
        cal0.set(Calendar.MONTH, month0-1);
        cal0.set(Calendar.DATE, date0);
        Date birth0 = cal0.getTime();
        emp.setBirth(birth0);

        System.out.println("输入第二个员工姓名：");
        emp2.setName(in.next());
        System.out.println("输入第二个员工出生年份：");
        int year2 = in.nextInt();
        System.out.println("输入第二个员工出生月份：");
        int month2 = in.nextInt();
        System.out.println("输入第二个员出生日期：");
        int date2 = in.nextInt();

        Calendar cal2 = Calendar.getInstance();
        //cal0.set(year0, month0, date0);
        cal2.set(Calendar.YEAR, year2);
        cal2.set(Calendar.MONTH, month2-1);
        cal2.set(Calendar.DATE, date2);
        Date birth2 = cal2.getTime();
        emp2.setBirth(birth2);

        System.out.println("谁的生日大？ 员工1的生日大：" + (cal0.before(cal2)));

        emp.showMe();
        emp2.showMe();
    }
}
