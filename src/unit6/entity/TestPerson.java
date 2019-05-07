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
    }
}
