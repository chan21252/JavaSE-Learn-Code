package work.io;

import java.io.File;
import java.util.Scanner;

/**
 * 在控制台接受一个数字大小的类型，比如输入5M，或者5KB，
 * 查找统计出电脑D盘目录下小于5M的文件有多少个，或者小于5KB的大小有多少个文件。
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入目录路径：");
        String dirPath = in.next();
        System.out.println("请输入文件大小（单位MB）：");
        long size = in.nextLong();

        File dir = new File(dirPath);
        int count = FileManager.countFilesBySize(dir, size);
        System.out.println(dir.getPath() + "中，文件大小小于 " + size + "MB 的文件个数是 " + count);
    }
}