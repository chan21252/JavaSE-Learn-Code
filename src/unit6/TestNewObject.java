package unit6;

import unit6.entity.Person;

public class TestNewObject {
    public static void main(String[] args) {
        Person perObject;   //声明一个类的局部变量
        perObject = new Person();   //使用构造方法创建一个对象
        Person perobject2 = perObject;

        System.out.println(perObject == perobject2);

        Person perObject3 = new Person();

        System.out.println(perObject == perObject3);

        /*
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s3==s2);     //false
        */
    }
}
