package unit12;

import java.io.File;

public class TestCopyFile {
    public static void main(String[] args) {
        File target = new File("C:\\Users\\Administrator\\Desktop\\files\\bg.jpg");
        File dir = new File("C:\\Users\\Administrator\\Desktop\\files1");

        FileManager.copyFile(target, dir);
    }
}
