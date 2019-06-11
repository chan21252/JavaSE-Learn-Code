package work.reflect.exercise05;

import java.lang.reflect.Type;

/**
 * 定义一个Person类，person类继承了Base类，
 * 通过反射去查看Person类继承了哪个类
 */
public class TestPerson {
    public static void main(String[] args) {
        Class<?> personClass = Person.class;

        //返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type。
        Type type = personClass.getGenericSuperclass();
        System.out.println(type.getTypeName());
    }
}
