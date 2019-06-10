package work.reflect.exercise01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 定义一个Java类，Person，属性有name、age，
 * 使用反射创建一个实例，调用构造函数初始化name和age，
 * 并且调用里边的sayHello()方法。
 */
public class TestPerson {
    public static void main(String[] args) {
        try {
            Class<?> personClass = Class.forName("work.reflect.exercise01.Person");
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            Person person = (Person) constructor.newInstance(args[0], Integer.parseInt(args[1]));
            Method method = personClass.getMethod("sayHello");
            method.invoke(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
