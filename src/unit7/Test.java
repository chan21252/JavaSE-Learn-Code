package unit7;

import unit7.entity.Animal;
import unit7.entity.Mammal;

public class Test {
    public static void main(String[] args) {
        Mammal mammal = new Mammal("哺乳动物");

        mammal.action();
        //mammal.eat();     //默认修饰符，不在一个包不能访问
        //mammal.run();     //Test不是Animal的子类，不在一个包，不能访问protected方法

        Dog dog = new Dog();
        dog.testPro();

        /*
        父类变量引用子类对象，无法直接访问子类的非继承成员
        使用需要强制类型转换。
         */
        Animal ani = new Mammal("哺乳动物也是动物");  //类型是父类，实例是子类，向上转型
        ((Mammal) ani).lactation(); //上转型对象不能直接调用子类非继承的属性和方法

        mammal.action();
        ani.action();

        ani.staMethod();
        mammal.staMethod();

        Child c = new Child();
        c.setName("123");
        System.out.println(c.getParentName());

    }
}
