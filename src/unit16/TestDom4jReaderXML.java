package unit16;

import unit16.enetity.Student;
import unit16.util.Dom4jXMLManager;

import java.util.List;

public class TestDom4jReaderXML {
    public static void main(String[] args) {
        String xmlFileName = "student1.xml";
        try {
            List<Student> studentList = Dom4jXMLManager.toStudentFromXML(xmlFileName);
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
