package unit8.abstarcts.imp;

import unit8.abstarcts.Mammal;

public class Cat extends Mammal {
    @Override
    public void eat() {
        System.out.println("猫在吃鱼");
    }

    @Override
    public void lactation() {
        System.out.println("猫在哺乳");
    }

    @Override
    public void run() {
        System.out.println("猫在奔跑，还可以上树");
    }
}
