package work.reflect.exercise02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 定义一个Java类，Person，通过反射把给里边所有的字段的赋值
 */
public class TestPerson {
    public static void main(String[] args) {

        try {
            Class<?> personClass = Person.class;
            Person person = (Person) personClass.newInstance();

            Field[] fields = personClass.getDeclaredFields();
            for (Field f : fields) {
                //设置访问权限
                if (f.getModifiers() != Modifier.PUBLIC) {
                    f.setAccessible(true);
                }

                //设置字段值
                if (f.getType() == String.class) {
                    f.set(person, args[0]);
                }

                if (f.getType() == int.class) {
                    f.set(person, Integer.parseInt(args[1]));
                }

                System.out.println(f.getName() + ": " + f.get(person));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
