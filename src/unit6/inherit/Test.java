package unit6.inherit;

import unit6.inherit.entity.Animal;
import unit6.inherit.entity.Mammal;

public class Test {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();

        mammal.action();
        //mammal.eat();     //默认修饰符，不在一个包不能访问
        //mammal.run();     //Test不是Animal的子类，不在一个包，不能访问protected方法

        Dog dog = new Dog();
        dog.testPro();

        Animal ani = new Mammal();  //类型是父类，实例是子类，向上转型
        ((Mammal) ani).lactation(); //上转型对象不能直接调用子类非继承的属性和方法

    }
}
