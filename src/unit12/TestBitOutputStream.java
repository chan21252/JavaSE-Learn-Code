package unit12;

import java.io.File;

public class TestBitOutputStream {
    public static void main(String[] args) {
        String filePath = "C:/Users/Administrator/Desktop/files/启动文件.bat";
        FileManager.binaryOutputStream(filePath);

        File file = new File("C:/Users/Administrator/Desktop/files/");
        FileManager.useBufferedOutputStream(file);
    }
}
