package unit16.util;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import unit16.enetity.Student;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * JDOM解析XML文档
 */
public class JDomXMLManager {
    private static SAXBuilder saxBuilder;

    /**
     * 将XML文件读取，并封装为对象，存储在List中返回
     *
     * @return 对象集合
     */
    public static List<Student> toObjectFromXML(String xmlFileName) throws Exception {
        //对象集合
        List<Student> studentList = new ArrayList<>();

        //创建SAXBuilder对象
        newInstanceSAXBuilder();
        String path = Tools.getClassPath() + "unit16/doc/";
        //System.out.println(path);

        //创建XML文件对象
        File xmlFile = new File(path, xmlFileName);
        //SAXBuilder对象构建Document对象
        Document document = saxBuilder.build(xmlFile);

        if (document == null) {
            throw new IOException("创建xml文档对象失败");
        }

        //获取根元素
        Element root = document.getRootElement();
        List<Element> childrenList = root.getChildren();

        for (Element e : childrenList) {
            Student stuObj = new Student();

            String code = e.getAttribute("code").getValue();
            stuObj.setCode(code);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = sdf.parse(e.getChild("birthday").getText());
            stuObj.setBirthday(birthday);

            stuObj.setName(e.getChildText("name"));
            stuObj.setGender(e.getChild("gender").getText());
            stuObj.setAddress(e.getChild("address").getText());

            studentList.add(stuObj);
        }
        return studentList;
    }

    /**
     * 此方法用来创建一个SAXBuilder;
     */
    private static void newInstanceSAXBuilder() {
        if (saxBuilder != null) {
            return;
        }

        saxBuilder = new SAXBuilder();
    }
}
