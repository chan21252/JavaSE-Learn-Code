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

    public Employee(String name, int workAge, char sex) {
        this.name = name;
        this.workAge = workAge;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex != '男' && sex != '女')
            this.sex = '男';
        else
            this.sex = sex;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

}
