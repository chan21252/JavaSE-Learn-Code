package unit12;

import java.io.File;

public class TestCharFileReader {
    public static void main(String[] args) {
        String fileName = "C:/Users/Administrator/Desktop/files/侠客行.txt";
        File file = new File(fileName);
        FileManager.readCharFile(file);
        FileManager.useBufferReader(new File("C:/Users/Administrator/Desktop/files/长恨歌.txt"));
    }
}
