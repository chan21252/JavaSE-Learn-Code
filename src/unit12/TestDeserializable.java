package unit12;

import java.io.File;

public class TestDeserializable {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\files1\\Employee.DATA");

        FileManager.javaDeserializable(file);
    }
}
