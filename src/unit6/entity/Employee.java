package unit6.entity;

public class Employee {
    private String name;
    private char sex;
    private int workAge;

    public Employee(){

    }

    public Employee(String name, int workAge){
        System.out.println("调用有参构造方法");
        this.name = name;
        this.workAge = workAge;
        System.out.println("name 的值是 " + name);
        System.out.println("workAge 的值是 " + workAge);
    }
}
