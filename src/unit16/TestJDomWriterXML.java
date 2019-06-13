package unit16;

import unit16.enetity.Student;
import unit16.util.JDomXMLManager;

import java.util.Scanner;

public class TestJDomWriterXML {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入要修改的学生编号");
        String code = in.next();
        System.out.println("请输入姓名：");
        String name = in.next();
        System.out.println("请输入性别：");
        String gender = in.next();
        System.out.println("请输入地址：");
        String address = in.next();

        Student student = new Student();
        student.setCode(code);
        student.setName(name);
        student.setGender(gender);
        student.setAddress(address);

        String xmlFileName = "student.xml";

        try {
            JDomXMLManager.modifyXML(student, xmlFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
