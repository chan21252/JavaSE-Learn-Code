package unit15.reflect;

import unit15.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 使用Class实现反射编程，创建对象，获取相关信息
 */
public class TestClass {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("unit15.entity.Student");
            System.out.println(studentClass.getName());

            /* 使用字节码对象获取关于这个类的对象实例 */
            //使用默认无参构造器创建一个对象，如果没有默认无参数构造器，则创建失败
            Student stuObj = (Student) studentClass.newInstance();
            System.out.println(stuObj != null);

            /* 获取访问级别 */
            System.out.println(studentClass.getModifiers() == Modifier.PUBLIC);

            /* 获取所有public成员属性 */
            System.out.println("public级别的成员有：");
            Field[] fields = studentClass.getFields();
            for (Field f : fields) {
                System.out.println(f.getName());
            }

            /* 获取所有级别的成员属性 */
            Field[] declaredFields = studentClass.getDeclaredFields();
            System.out.println("所有的成员：");
            for (Field f : declaredFields) {
                System.out.println(f.getName());
            }

            /* 获取构造器 */
            //获取某个指定的构造器
            Constructor<?> stuConstructor = studentClass.getConstructor(String.class, Integer.class);
            System.out.println(stuConstructor != null);

            /* 获取类中定义的方法 */
            System.out.println("类的public（包含从父类继承来的）方法有");
            Method[] methods = studentClass.getMethods();
            for (Method m : methods) {
                System.out.printf("%s\t", m.getName());
            }
            System.out.println();

            System.out.println("类的定义方法有");
            Method[] declaredMethods = studentClass.getDeclaredMethods();
            for (Method m : declaredMethods) {
                System.out.printf("%s\t", m.getName());
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
