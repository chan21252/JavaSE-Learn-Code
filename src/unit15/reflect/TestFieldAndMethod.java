package unit15.reflect;

import unit15.entity.Book;
import unit15.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestFieldAndMethod {
    public static void main(String[] args) {
        try {
            //获取字节码对象
            Class<?> studentClass = Class.forName("unit15.entity.Student");

            //获取构造器对象，创建实例
            Constructor<?> stuConstructor = studentClass.getConstructor(String.class, Integer.class);
            Student student = (Student) stuConstructor.newInstance("令狐冲", 30);

            //用反射的方法创建Book对象，并设置name
            Class<?> bookClass = Book.class;
            Book book = (Book) bookClass.newInstance();
            Method setBookMethod = bookClass.getMethod("setName", String.class);
            setBookMethod.invoke(book, "java入门到精通");

            //获取learn方法的对象
            Method[] methods = studentClass.getDeclaredMethods();
            Method learnMethod = studentClass.getMethod("learn", Book.class);

            //反射执行learn方法
            learnMethod.invoke(student, book);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
