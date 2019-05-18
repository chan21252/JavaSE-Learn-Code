package unit8.test;

import unit8.abstarcts.Animal;
import unit8.abstarcts.Mammal;
import unit8.abstarcts.imp.Cat;
import unit8.abstarcts.imp.Dog;

public class Test {
    public static void main(String[] args) {
        //错误：抽象类不可以使用构造器实例化
        //Animal ani = new Animal();

        Animal aniDog = new Dog();
        aniDog.run();

        Mammal aniCat = new Cat();
        aniCat.eat();
        aniCat.lactation();
        aniCat.run();
    }
}
