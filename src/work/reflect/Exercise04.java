package work.reflect;

import work.reflect.exercise01.Person;

import java.lang.reflect.Constructor;

/**
 * 通过反射去创建对象，分别用Constructor和Class对象去创建
 */
public class Exercise04 {
    public static void main(String[] args) {
        try {
            Class<?> personClass = Class.forName("work.reflect.exercise01.Person");
            Person person1 = (Person) personClass.newInstance();

            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            Person person2 = (Person) constructor.newInstance("令狐冲", 18);

            System.out.println(person1.getName());
            System.out.println(person2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
