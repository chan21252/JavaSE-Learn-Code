package unit15.reflect;

import unit15.entity.Student;

import java.lang.reflect.Constructor;

public class TestConstructor {
    public static void main(String[] args) {
        Class<?> studentClass = null;
        try {
            studentClass = Class.forName("unit15.entity.Student");
            //获取构造器
            Constructor constructor = studentClass.getConstructor(String.class, Integer.class);

            //使用构造器反射相关方法实现对象的创建
            Student student = (Student) constructor.newInstance("东方不败", 36);
            System.out.println("我的名字是" + student.getName());

            System.out.println("构造器的访问级别是 " + constructor.getModifiers());
            System.out.println("参数的个数是 " + constructor.getParameterCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
