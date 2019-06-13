package unit16.util;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import unit16.enetity.Student;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dom4jXMLManager {

    public static void toXMLFromStudent(List<Student> studentList, String xmlFileName) throws Exception {
        //documentFactory，创建document, Element, Attribute
        DocumentFactory documentFactory = new DocumentFactory();
        //创建document对象
        Document document = documentFactory.createDocument();

        //创建根元素
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

            //根据对象，创建元素
            Element stuEle = documentFactory.createElement("student");
            Element nameEle = documentFactory.createElement("name");
            Element genderEle = documentFactory.createElement("gender");
            Element birthdayEle = documentFactory.createElement("birthday");
            Element addressEle = documentFactory.createElement("address");

            //设置元素文本、属性
            nameEle.setText(name);
            genderEle.setText(gender);
            birthdayEle.setText(birthday);
            addressEle.setText(address);
            Attribute codeAttr = documentFactory.createAttribute(stuEle, "code", code);

            //添加到上级元素
            stuEle.add(nameEle);
            stuEle.add(genderEle);
            stuEle.add(birthdayEle);
            stuEle.add(addressEle);
            stuEle.add(codeAttr);
            rootEle.add(stuEle);
        }

        //创建XML文件
        String filePath = Tools.getClassPath() + "unit16/doc/";
        File xmlFile = new File(filePath, xmlFileName);

        //创建输出流
        Writer writer = new FileWriter(xmlFile);
        //创建XML输出流
        XMLWriter xmlWriter = new XMLWriter(writer, OutputFormat.createPrettyPrint());
        //写入document
        xmlWriter.write(document);
        xmlWriter.close();
        writer.close();
    }

    public static List<Student> toStudentFromXML(String xmlFileName) throws Exception {
        List<Student> studentList = new ArrayList<>();

        String path = Tools.getClassPath() + "unit16/doc/";
        File xmlFile = new File(path, xmlFileName);

        Reader reader = new FileReader(xmlFile);
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(reader);

        if (document == null) {
            throw new NullPointerException("document为空");
        }

        Element rootEle = document.getRootElement();
        List<Element> studentEleList = rootEle.elements();

        for (Element e : studentEleList) {
            Student student = new Student();

            String name = e.element("name").getText();
            String gender = e.element("gender").getText();
            String address = e.element("address").getText();
            Date birthday = new SimpleDateFormat("yyyy/MM/dd").parse(e.element("birthday").getText());
            String code = e.attributeValue("code");

            student.setCode(code);
            student.setName(name);
            student.setGender(gender);
            student.setBirthday(birthday);
            student.setAddress(address);

            studentList.add(student);
        }

        reader.close();

        return studentList;
    }
}
