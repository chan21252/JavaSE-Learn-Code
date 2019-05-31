package work.io.exercise01;

import java.io.File;
import java.util.Scanner;

public class TestFileManager {
    public static void main(String[] args) {
        //在D盘创建一个ss目录
        File dirSs = new File("D:/ss/");
        FileManager.createDir(dirSs);

        //Hello World写入到s.txt
        File fileS = new File("D:/ss/s.txt");
        String str1 = "Hello World";
        FileManager.writeChartoFile(fileS, str1);

        //读取s.txt
        String str2 = FileManager.readCharFromFile(fileS);
        System.out.println(str2);

        //统计字符
        StringManager.countChar(str2);

        //转换字符
        String str3 = StringManager.convert(str2);
        System.out.println(str3);

        //从控制台输入一个路径，循环遍历路径下所有文件和目录
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        String dirPath = in.next();
        File dirTravel = new File(dirPath);
        FileManager.travelDir(dirTravel);

        //拷贝
        File file = new File("D:/bg.jpg");
        File copyDir = new File("F:/");
        FileManager.copyFile(file, copyDir);
    }
}
