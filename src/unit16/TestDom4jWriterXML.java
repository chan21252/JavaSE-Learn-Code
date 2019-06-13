package unit16;

import unit16.enetity.Student;
import unit16.util.Dom4jXMLManager;
import unit16.util.Tools;

import java.util.ArrayList;
import java.util.List;

public class TestDom4jWriterXML {
    public static void main(String[] args) {
        Student s1 = new Student("stu001", "令狐冲", Tools.toDate(1988, 10, 22),
                "男", "华山");
        Student s2 = new Student("stu002", "任盈盈", Tools.toDate(1990, 10, 22),
                "女", "黑木崖");
        Student s3 = new Student("stu003", "岳灵珊", Tools.toDate(1991, 10, 22),
                "女", "华山");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        try {
            Dom4jXMLManager.toXMLFromStudent(studentList, "student1.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
