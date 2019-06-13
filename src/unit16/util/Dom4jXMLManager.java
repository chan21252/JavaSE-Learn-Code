package unit16.util;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import unit16.enetity.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.List;

public class Dom4jXMLManager {

    public static void toXMLFromStudent(List<Student> studentList, String xmlFileName) throws Exception {
        //documentFactory，创建document,Element,
        DocumentFactory documentFactory = new DocumentFactory();
        Document document = documentFactory.createDocument();

        Element rootEle = documentFactory.createElement("student-list");
        document.setRootElement(rootEle);

        if (studentList == null || studentList.size() <= 0) {
            throw new NullPointerException("studentList为空");
        }

        for (Student student : studentList) {
            String code = student.getCode();
            String name = student.getName();
            String gender = student.getGender();
            String birthday = new SimpleDateFormat("yyyy/MM/dd").format(student.getBirthday());
            String address = student.getAddress();

            Element stuEle = documentFactory.createElement("student");
            Element nameEle = documentFactory.createElement("name");
            Element genderEle = documentFactory.createElement("gender");
            Element birthdayEle = documentFactory.createElement("birthday");
            Element addressEle = documentFactory.createElement("address");

            nameEle.setText(name);
            genderEle.setText(gender);
            birthdayEle.setText(birthday);
            addressEle.setText(address);
            Attribute codeAttr = documentFactory.createAttribute(stuEle, "code", code);

            stuEle.add(nameEle);
            stuEle.add(genderEle);
            stuEle.add(birthdayEle);
            stuEle.add(addressEle);
            stuEle.add(codeAttr);
            rootEle.add(stuEle);
        }


        String filePath = Tools.getClassPath() + "unit16/doc/";
        File xmlFile = new File(filePath, xmlFileName);

        Writer writer = new FileWriter(xmlFile);
        XMLWriter xmlWriter = new XMLWriter(writer, OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.close();
        writer.close();
    }
}
