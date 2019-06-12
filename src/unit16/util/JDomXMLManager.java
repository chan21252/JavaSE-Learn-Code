package unit16.util;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JDOM解析XML文档
 */
public class JDomXMLManager {
    private static SAXBuilder saxBuilder;
    private static Document document;

    /**
     * 将XML文件读取，并封装为对象，存储在List中返回
     *
     * @return
     */
    public static List<?> toObjectFromXML(String xmlFileName) {
        List<?> objectList = new ArrayList<>();
        newInstanceSAXBuilder();
        String path = Tools.getClassPath() + "/src/unit16/doc/";
        System.out.println(path);
        File xmlFile = new File(Tools.getClassPath(), xmlFileName);
        try {
            document = saxBuilder.build(xmlFile);
            if (document == null) {
                throw new Exception("document为空");
            }
        } catch (JDOMException | IOException e) {
            e.printStackTrace();
        }
        return objectList;
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
