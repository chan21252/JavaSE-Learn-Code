package unit9.blockclass;

import java.util.Date;
import java.util.Properties;

public class TestSystem {
    public static void main(String[] args) {
        testOutErr(-8);

        //获取系统时间
        long sysTime = System.currentTimeMillis();
        System.out.println(sysTime);

        Date date = new Date(sysTime);
        System.out.println(date.toLocaleString());

        System.gc();

        Properties map = System.getProperties();
        System.out.println(map);

        System.out.println(System.getProperty("java.vm.version"));
    }

    public static void testOutErr(int age) {
        if ((age >= 0)) {
            System.out.println("age合法 " + age);
        } else {
            System.err.println("age不能小于0 " + age);
        }

    }
}
