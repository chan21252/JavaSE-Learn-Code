package unit6.entity;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 无参数，无返回值方法
     */
    public void showSelf(){
        System.out.println("我的名字是 " + this.name);
        System.out.println("我的年龄是 " + this.age);
    }
}
