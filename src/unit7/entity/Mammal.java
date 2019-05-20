package unit7.entity;

public class Mammal extends Animal {

    public Mammal(String desc) {
        super(desc);
        System.out.println("调用Mammal构造器");
    }

    public static void staMethod() {
        System.out.println("子类的静态方法");
    }

    /**
     * 哺乳动物的特有行为
     */
    public void lactation() {
        System.out.println("哺乳动物都有哺乳的特征");
    }

    @Override
    public void action() {
        super.action();
        System.out.println("我是哺乳动物，我是这样奔跑的");
    }

    @Override
    protected void run() {
        super.run();
    }
}
