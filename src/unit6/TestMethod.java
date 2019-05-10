package unit6;

import unit6.entity.Student;

public class TestMethod {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("令狐冲");
        stu.setAge(18);
        stu.showSelf();
    }
}
