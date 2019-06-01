package work.io;

import java.io.File;

/**
 * 编写一个Java应用程序，可以实现Dos中的type命令，并加上行号。
 * 即将文本文件在控制台上显示出来，并在每一行的前面加上行号。
 */
public class Exercise08 {
    public static void main(String[] args) {
        File file = new File("src/work/io/files/s.txt");    //使用相对路径创建文件
        //System.out.println(file.getAbsolutePath());
        FileManager.readCharFileWithLine(file);
    }
}