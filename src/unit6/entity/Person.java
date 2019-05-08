package unit6.entity;

/**
 * 自定义一个表示人类的数据类型，属于java引用类型
 * @author cuican
 */
public class Person {
    /* 定义实例成员属性 */
    public String name;    //姓名
    protected int age;        //年龄
    private String address; //地址
    char sex;       //性别
    double height;  //身高

    /* 定义类的属性（静态，static修饰） */
    public static String feature;       //共同特征
    public static final int MAX_AGE = 100;  //年龄上限
}
