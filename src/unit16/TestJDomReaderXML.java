package unit16;

import unit16.enetity.Student;
import unit16.util.JDomXMLManager;

import java.text.SimpleDateFormat;
import java.util.List;

public class TestJDomReaderXML {
    public static void main(String[] args) {
        String xmlFileName = "student.xml";
        System.out.println("所有学生信息如下：");
        System.out.println("-----------------------------------------");
        System.out.println("序号\t姓名\t性别\t生日\t地址");
        System.out.println("-----------------------------------------");
        try {
            List<Student> studentList = JDomXMLManager.toObjectFromXML(xmlFileName);
            for (Student s : studentList) {
                String code = s.getCode();
                String name = s.getName();
                String gender = s.getGender();
                String birthday = new SimpleDateFormat("yyyy-MM-dd").format(s.getBirthday());
                String address = s.getAddress();
                System.out.printf("%s\t%s\t%s\t%s\t%s\n", code, name, gender, birthday, address);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
