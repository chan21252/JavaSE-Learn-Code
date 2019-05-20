package unit7.entity;

public class Animal {
    private String desc = "我们都是好朋友，要爱护动物";

    public Animal(String desc) {
        this.desc = desc;
        System.out.println("调用Animal构造器");
    }

    public static void staMethod() {
        System.out.println("父类的静态方法");
    }

    public void action() {
        System.out.println("动物在行动");
    }

    /**
     * 吃饭方法，默认访问修饰符，只能在一个包中访问
     */
    void eat() {
        System.out.println("吃东西才能活着");
    }

    /**
     * 奔跑方法，protected修饰符，不同包的子类可以访问
     */
    protected void run() {
        System.out.println("奔跑");
    }
}
