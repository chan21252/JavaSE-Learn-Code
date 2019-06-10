package work.reflect;

import java.lang.reflect.Method;

/**
 * 通过反射调用main函数。
 */
public class Exercise03 {

    public static void main(String[] args) {
        //获取要执行main函数类的字节码对象
        Class<?> runMainClass = work.reflect.exercise01.TestPerson.class;
        try {
            //获取main函数对象
            Method method = runMainClass.getMethod("main", String[].class);
            //动态传入对象，执行main函数
            method.invoke(null, (Object) new String[]{"令狐冲", "20"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
