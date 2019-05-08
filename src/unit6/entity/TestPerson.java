package unit6.entity;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "任盈盈";
        //p1.address = "黑木崖";
        p1.age = 20;
        p1.height = 165.50;
        p1.sex = '女';

        System.out.println(p1.name);
        //System.out.println(p1.address);
        System.out.println(p1.age);
        System.out.println(p1.height);
        System.out.println(p1.sex);

        Person p2 = new Person();
        p2.name = "令狐冲";
        p2.age = 22;
        p2.height = 183.00;
        p2.sex = '男';

        p1.feature = "都有学习的习惯";
        System.out.println(p2.feature);
    }
}
