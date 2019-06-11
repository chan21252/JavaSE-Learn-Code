package work.reflect;

import work.reflect.exercise05.Person;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 通过反射创建一个ArrayList对象，
 * 并且调用里边的方法添加一些数据，循环list，把对象打印到控制台。
 */
public class Exercise06 {
    public static void main(String[] args) {
        try {
            Class<?> arrayListClass = Class.forName("java.util.ArrayList");
            ArrayList myList = (ArrayList) arrayListClass.newInstance();

            Method addMethod = arrayListClass.getMethod("add", Object.class);
            addMethod.invoke(myList, "100");
            addMethod.invoke(myList, "200");
            addMethod.invoke(myList, "300");
            addMethod.invoke(myList, new Person());
            System.out.println(myList.size());

            for (Object o : myList) {
                System.out.println(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
