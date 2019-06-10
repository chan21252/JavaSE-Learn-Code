package unit15.entity;

public class Student {
    public String name;
    protected Integer age;
    double height;
    private double money;

    public Student() {

    }

    public Student(String name, Integer age) {
        System.out.println("String，int 构造器");
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public void learn(Book book) {
        System.out.println("我的名字是 " + name + "，我正在学习" + book.getName());
    }

    void run() {
        System.out.println("我是" + name + "，我在奔跑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
