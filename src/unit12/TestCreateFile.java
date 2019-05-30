package unit12;

import java.util.ArrayList;
import java.util.List;

public class TestCreateFile {
    public static void main(String[] args) {
        String dir = "C:/Users/Administrator/Desktop/files2/child1";
        List<String> fileNames = new ArrayList<>();
        fileNames.add("诗词.txt");
        fileNames.add("唐诗三百首.rar");
        fileNames.add("论语故事.bat");
        fileNames.add("春秋.jpg");

        FileManager.createDir(dir, fileNames);
    }
}
